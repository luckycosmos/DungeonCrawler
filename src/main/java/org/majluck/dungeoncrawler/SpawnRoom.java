package org.majluck.dungeoncrawler;

import java.util.Random;

public class SpawnRoom {

    private final Random random = new Random();

    private int sizeX = random.nextInt(8) + 5;
    private int minX = -sizeX;
    private int maxX = sizeX;
    private int sizeZ = random.nextInt(8) + 5;
    private int minZ = -sizeZ;
    private int maxZ = sizeZ;

}
