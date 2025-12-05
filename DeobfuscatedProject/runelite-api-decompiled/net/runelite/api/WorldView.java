/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import javax.annotation.Nullable;
import net.runelite.api.CollisionData;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.IndexedObjectSet;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.WorldEntity;

public interface WorldView {
    public int getId();

    public boolean isTopLevel();

    public Scene getScene();

    public IndexedObjectSet<? extends Player> players();

    public IndexedObjectSet<? extends NPC> npcs();

    public IndexedObjectSet<? extends WorldEntity> worldEntities();

    @Nullable
    public CollisionData[] getCollisionMaps();

    public int getPlane();

    public int[][][] getTileHeights();

    public byte[][][] getTileSettings();

    public int getSizeX();

    public int getSizeY();

    public int getBaseX();

    public int getBaseY();

    public Deque<GraphicsObject> getGraphicsObjects();

    @Nullable
    public Tile getSelectedSceneTile();

    public boolean isInstance();

    public int[][][] getInstanceTemplateChunks();
}

