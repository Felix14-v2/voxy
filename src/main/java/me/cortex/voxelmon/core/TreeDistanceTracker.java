package me.cortex.voxelmon.core;

//Tracks the distance with respect to the entire world size
public class TreeDistanceTracker {
    private final int scalingFactor;

    public TreeDistanceTracker(int scalingFactor) {
        this.scalingFactor = scalingFactor;
    }
}