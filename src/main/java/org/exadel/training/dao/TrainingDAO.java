package org.exadel.training.dao;

import org.exadel.training.model.Training;

import java.util.List;

public interface TrainingDAO {
    void addTraining(Training training);

    List<Training> getAllTrainings();

    List<Training> getTrainingsByName(String name);

    void updateTraining(Training training);

    void removeTraining(Training training);
}
