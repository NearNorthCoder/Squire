/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.WorldView
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.WorldView;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSCollisionMap;
import net.runelite.rs.api.RSIndexedObjectSet;
import net.runelite.rs.api.RSIterableNodeHashTable;
import net.runelite.rs.api.RSNodeDeque;
import net.runelite.rs.api.RSScene;

public interface RSWorldView
extends WorldView {
    @Import(value="id")
    public int getId();

    @Import(value="npcs")
    public RSIndexedObjectSet npcs();

    @Import(value="scene")
    public RSScene getScene();

    @Import(value="players")
    public RSIndexedObjectSet players();

    @Import(value="groundItems")
    public RSNodeDeque[][][] getGroundItems();

    @Import(value="graphicsObjects")
    public RSNodeDeque getGraphicsObjects();

    @Import(value="tileHeights")
    public int[][][] getTileHeights();

    @Import(value="tileRenderFlags")
    public byte[][][] getTileRenderFlags();

    @Import(value="plane")
    public int getPlane();

    @Import(value="baseX")
    public int getBaseX();

    @Import(value="baseY")
    public int getBaseY();

    @Import(value="worldViewWidth")
    public int getSizeX();

    @Import(value="worldViewHeight")
    public int getSizeY();

    @Import(value="collisionMaps")
    public RSCollisionMap[] getCollisionMaps();

    @Import(value="tileLastDrawnActor")
    public int[][] getOccupiedTilesTick();

    @Import(value="tileRenderFlags")
    public byte[][][] getTileSettings();

    @Import(value="isInInstance")
    public boolean isInstance();

    @Import(value="instanceChunkTemplates")
    public int[][][] getInstanceTemplateChunks();

    @Import(value="worldEntities")
    public RSIterableNodeHashTable worldEntities();

    @Import(value="objectSounds")
    public RSNodeDeque getSoundEffects();
}

