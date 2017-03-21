/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.genetics.controllers;

import com.genetics.beans.Chromosome;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author elsayedawd
 */
public class LoadingPopulation {

    private Chromosome chromosome;
    
    public List<Chromosome> generatePopulation(int populationNumber) {
        Random r = new Random();
        int Low = 0;
        int High = 15;
        int numberOfCars;
        int numberOfFrdiges;
        int numberOfTanks;
        List<Chromosome> populationList = new ArrayList();
        for (int i = 0; i < populationNumber; i++) {
            Random rn = new Random();
            numberOfCars=r.nextInt(High - Low) + Low;
            numberOfFrdiges=r.nextInt(High - Low) + Low;
            numberOfTanks=r.nextInt(High - Low) + Low;
            chromosome = new Chromosome();
            chromosome.setNumberOfCars(numberOfCars);
            chromosome.setNumberOfFridges(numberOfFrdiges);
            chromosome.setNumberOfTanks(numberOfTanks);
            populationList.add(chromosome);
        }
        return populationList;
    }
}
