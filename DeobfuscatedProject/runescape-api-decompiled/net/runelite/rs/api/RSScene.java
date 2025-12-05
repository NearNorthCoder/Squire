/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.DecorativeObject
 *  net.runelite.api.GameObject
 *  net.runelite.api.GroundObject
 *  net.runelite.api.Renderable
 *  net.runelite.api.Scene
 *  net.runelite.api.Tile
 *  net.runelite.api.WallObject
 *  net.runelite.api.mixins.Inject
 *  net.runelite.mapping.Construct
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.Renderable;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.api.mixins.Inject;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSIntProjection;
import net.runelite.rs.api.RSNodeDeque;
import net.runelite.rs.api.RSProjection;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSTile;
import net.runelite.rs.api.RSWorldView;

public interface RSScene
extends Scene {
    @Import(value="tempGameObjects")
    public RSGameObject[] getObjects();

    @Import(value="tiles")
    public RSTile[][][] getTiles();

    @Import(value="drawTile")
    public void draw(RSProjection var1, Tile var2, boolean var3);

    @Import(value="tileHeights")
    public int[][][] getTileHeights();

    @Import(value="drawTileMinimap")
    public void drawTile(int[] var1, int var2, int var3, int var4, int var5, int var6);

    @Import(value="occlude")
    public void updateOccluders();

    @Import(value="xSize")
    public int getMaxX();

    @Import(value="cameraX2")
    public void setCameraX2(int var1);

    @Import(value="cameraY2")
    public void setCameraY2(int var1);

    @Import(value="ySize")
    public int getMaxY();

    @Import(value="planes")
    public int getMaxZ();

    @Import(value="minPlane")
    public int getMinLevel();

    @Import(value="minPlane")
    public void setMinLevel(int var1);

    @Import(value="newGroundItemPile")
    public void newGroundItemPile(int var1, int var2, int var3, int var4, RSRenderable var5, long var6, RSRenderable var8, RSRenderable var9);

    @Import(value="newGameObject")
    public boolean newGameObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RSRenderable var9, int var10, boolean var11, long var12, int var14);

    @Import(value="removeGameObject")
    public void removeGameObject(GameObject var1);

    @Import(value="removeGameObject")
    public void removeGameObject(int var1, int var2, int var3);

    public void removeWallObject(WallObject var1);

    @Import(value="removeBoundaryObject")
    public void removeWallObject(int var1, int var2, int var3);

    public void removeDecorativeObject(DecorativeObject var1);

    @Import(value="removeWallDecoration")
    public void removeDecorativeObject(int var1, int var2, int var3);

    public void removeGroundObject(GroundObject var1);

    @Import(value="removeFloorDecoration")
    public void removeGroundObject(int var1, int var2, int var3);

    @Inject
    public int getRoofRemovalMode();

    public short[][][] getUnderlayIds();

    public void setUnderlayIds(short[][][] var1);

    public short[][][] getOverlayIds();

    public void setOverlayIds(short[][][] var1);

    public byte[][][] getTileShapes();

    public void setTileShapes(byte[][][] var1);

    @Import(value="isInInstance")
    public boolean isInstance();

    @Import(value="instanceChunkTemplates")
    public int[][][] getInstanceTemplateChunks();

    @Import(value="menuOpen")
    public void menuOpen(boolean var1);

    @Import(value="menuOpenSecondary")
    public void menuOpenSecondary(int var1, int var2, int var3);

    @Import(value="drawEntity")
    public boolean drawEntity(int var1, int var2, int var3, int var4, int var5, Renderable var6, int var7, long var8, boolean var10);

    @Import(value="selectedX")
    public int getSelectedSceneTileX();

    @Import(value="selectedX")
    public void setSelectedSceneTileX(int var1);

    @Import(value="selectedY")
    public int getSelectedSceneTileY();

    @Import(value="selectedY")
    public void setSelectedSceneTileY(int var1);

    @Import(value="viewportWalking")
    public void setViewportWalking(boolean var1);

    @Import(value="tilesDeque")
    public RSNodeDeque getTilesDeque();

    @Import(value="selectedScreenX")
    public int getSelectedScreenX();

    @Import(value="selectedScreenY")
    public int getSelectedScreenY();

    @Import(value="checkClick")
    public boolean isCheckClick();

    @Import(value="checkClick")
    public void setCheckClick(boolean var1);

    @Import(value="cameraX")
    public int getCameraX();

    @Import(value="cameraY")
    public int getCameraY();

    @Import(value="cameraZ")
    public int getCameraZ();

    @Import(value="cameraX")
    public void setCameraX(int var1);

    @Import(value="cameraY")
    public void setCameraY(int var1);

    @Import(value="cameraZ")
    public void setCameraZ(int var1);

    @Import(value="tileUpdateCount")
    public int getTileUpdateCount();

    @Import(value="tileUpdateCount")
    public void setTileUpdateCount(int var1);

    @Import(value="cameraXTileMin")
    public void setMinTileX(int var1);

    @Import(value="cameraYTileMin")
    public void setMinTileY(int var1);

    @Import(value="cameraYTileMax")
    public void setMaxTileY(int var1);

    @Import(value="cameraXTileMax")
    public void setMaxTileX(int var1);

    @Import(value="worldViewId")
    public int getWorldViewId();

    public RSWorldView getWorldView();

    @Import(value="plane")
    public int getPlane();

    @Import(value="visibilityMap")
    public void visibilityMap(int var1, int var2);

    @Import(value="isTileVisible")
    public boolean isTileVisible(int var1, int var2);

    @Import(value="drawnCount")
    public void setDrawnCount(int var1);

    @Import(value="drawnCount")
    public int getDrawnCount();

    @Import(value="cameraXTile")
    public void setScreenCenterX(int var1);

    @Import(value="cameraXTile")
    public int getScreenCenterX();

    @Import(value="cameraYTile")
    public int getScreenCenterY();

    @Import(value="cameraYTile")
    public void setScreenCenterZ(int var1);

    @Import(value="plane")
    public void setPlane(int var1);

    @Construct
    public RSIntProjection newIntProjection(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

    @Import(value="maxRenderDistance")
    public int getVanillaDrawDistance();

    public void hoverTile(int var1, int var2, int var3);

    @Import(value="drawProjection")
    public void drawProjection(RSProjection var1, boolean var2, boolean var3);

    @Import(value="sendWalk")
    public void sendWalk();

    @Import(value="cameraCenterX")
    public void setCameraCenterX(int var1);

    @Import(value="cameraCenterY")
    public void setCameraCenterY(int var1);

    @Import(value="cameraXOffset")
    public int getCameraXOffset();

    @Import(value="cameraXOffset")
    public void setCameraXOffset(int var1);

    @Import(value="cameraYOffset")
    public void setCameraYOffset(int var1);

    @Import(value="cameraYOffset")
    public int getCameraYOffset();

    @Import(value="cameraXTileMin")
    public int getMinTileX();

    @Import(value="cameraXTileMax")
    public int getMaxTileX();

    @Import(value="cameraYTileMin")
    public int getMinTileY();

    @Import(value="cameraYTileMax")
    public int getMaxTileY();
}

