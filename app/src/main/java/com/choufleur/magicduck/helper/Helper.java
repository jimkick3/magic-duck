package com.choufleur.magicduck.helper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Helper {
    static int[][] P; // [n,k] number of solutions existing
    static int[][] S; // [n,k] number of solutions current element is a part of

    static ArrayList<ArrayList<Task>> potentialSolutions = new ArrayList(); // set of tasks that fit in the day
    static ArrayList<Integer> scores = new ArrayList();

    static ArrayList<Task> bestSolution; // unordered set of best tasks

    static ArrayList<Double> costs = new ArrayList();

    // Computes matrices P and S. N = list of all tasks, K = length of day
    public static void computeMatrices(ArrayList<Task> tasks, int K){
        int N = tasks.size();
        P = new int[N][K]; // I think this sets all elements to 0 by default
        S = new int[N][K];

        for(int n = 0; n < N; n++){
            for(int k = 0; k < K; k++){
                if(k == 0){
                    P[n][k]++;
                }
                else if(n == 0){
                    // do nothing
                }
                else{
                    if(tasks.get(n).getTotalDuration() > k){
                        P[n][k] += P[n-1][k];
                    }
                    else if(tasks.get(n).getTotalDuration() == k){
                        P[n][k]++;
                        S[n][k]++;
                    }
                    else{
                        P[n][k] += P[n-1][k] + P[n-1][k-tasks.get(n).getTotalDuration()];
                        S[n][k] += P[n-1][k-tasks.get(n).getTotalDuration()];
                    }
                }
            }
        }
    }

    public static void findPotentialSolutions(){
        //TODO we have number of solutions in P but not the actual subsets
    }

    // Scores the potential solutions. day = length of the day (min)
    public static void scoreSolutions(int day){
        for(ArrayList<Task> list: potentialSolutions){
            int tmpScore = 0;
            int duration = 0;
            for(Task task: list){
                tmpScore += task.getPriority();
                duration += task.getTotalDuration();
            }
            int timeLoss = day - duration;
            scores.add(tmpScore - (int)((timeLoss)/5.0));
        }
    }

    // Find the best set of tasks according to their scores
    public static void bestSet(){
        int i = scores.indexOf(Collections.max(scores));
        bestSolution = potentialSolutions.get(i);
    }

    // Calculate cost function of a certain permutation of the tasks. Only used in another method.
    // Time should be minutes from midnight
    private static double cost(Task task, int executeTime, int prodTime){
        return Math.abs(prodTime - executeTime) * (1.0/task.getPriority());
    }

    // Find power set of a set. Only used in another method.
    private static ArrayList<ArrayList<Task>> powerSet(ArrayList<Task> set){
        //TODO find all subsets
        return null;
    }

    // Compute costs of all sets in the power set of the best solution
    public static void computeCost(){
        ArrayList<Task> bestPermutation;
        for(int k = 1; k <= bestSolution.size(); k++){
            for(ArrayList<Task> subset: powerSet(bestSolution)){
                if(subset.size() == k){
                    double min = -1.0;
                    for(Task task: subset){
                        
                    }
                }
            }
        }
    }
}
