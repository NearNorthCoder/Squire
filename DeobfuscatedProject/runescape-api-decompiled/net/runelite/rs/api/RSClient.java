/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Client
 *  net.runelite.api.Deque
 *  net.runelite.api.Projectile
 *  net.runelite.api.Rasterizer
 *  net.runelite.api.SpritePixels
 *  net.runelite.api.WidgetNode
 *  net.runelite.api.World
 *  net.runelite.api.clan.ClanRank
 *  net.runelite.api.clan.ClanSettings
 *  net.runelite.api.packets.ClientPacket
 *  net.runelite.api.packets.IsaacCipher
 *  net.runelite.api.widgets.Widget
 *  net.runelite.mapping.Construct
 *  net.runelite.mapping.Import
 */
package net.runelite.rs.api;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Map;
import net.runelite.api.Client;
import net.runelite.api.Deque;
import net.runelite.api.Projectile;
import net.runelite.api.Rasterizer;
import net.runelite.api.SpritePixels;
import net.runelite.api.WidgetNode;
import net.runelite.api.World;
import net.runelite.api.clan.ClanRank;
import net.runelite.api.clan.ClanSettings;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.IsaacCipher;
import net.runelite.api.widgets.Widget;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;
import net.runelite.rs.api.RSAbstractArchive;
import net.runelite.rs.api.RSAbstractRasterProvider;
import net.runelite.rs.api.RSArchive;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSBufferedFile;
import net.runelite.rs.api.RSClanChannel;
import net.runelite.rs.api.RSClanSettings;
import net.runelite.rs.api.RSClientPacket;
import net.runelite.rs.api.RSClientPreferences;
import net.runelite.rs.api.RSDbRowType;
import net.runelite.rs.api.RSDbTable;
import net.runelite.rs.api.RSDbTableType;
import net.runelite.rs.api.RSEnumComposition;
import net.runelite.rs.api.RSEvictingDualNodeHashTable;
import net.runelite.rs.api.RSFloorOverlayDefinition;
import net.runelite.rs.api.RSFont;
import net.runelite.rs.api.RSFrames;
import net.runelite.rs.api.RSFriendSystem;
import net.runelite.rs.api.RSFriendsChat;
import net.runelite.rs.api.RSGameEngine;
import net.runelite.rs.api.RSGrandExchangeOffer;
import net.runelite.rs.api.RSHintArrow;
import net.runelite.rs.api.RSIndexedSprite;
import net.runelite.rs.api.RSIntegerNode;
import net.runelite.rs.api.RSInterfaceParent;
import net.runelite.rs.api.RSItemComposition;
import net.runelite.rs.api.RSIterableNodeHashTable;
import net.runelite.rs.api.RSKeyHandler;
import net.runelite.rs.api.RSLoginType;
import net.runelite.rs.api.RSMenu;
import net.runelite.rs.api.RSMenuAction;
import net.runelite.rs.api.RSModelData;
import net.runelite.rs.api.RSMouseHandler;
import net.runelite.rs.api.RSMouseRecorder;
import net.runelite.rs.api.RSMusicTrackDescriptor;
import net.runelite.rs.api.RSNPCComposition;
import net.runelite.rs.api.RSNodeDeque;
import net.runelite.rs.api.RSNodeHashTable;
import net.runelite.rs.api.RSObjectComposition;
import net.runelite.rs.api.RSObjectNode;
import net.runelite.rs.api.RSPacketBufferNode;
import net.runelite.rs.api.RSPacketWriter;
import net.runelite.rs.api.RSParamComposition;
import net.runelite.rs.api.RSPcmStreamMixer;
import net.runelite.rs.api.RSPlatformInfo;
import net.runelite.rs.api.RSPlayer;
import net.runelite.rs.api.RSRasterizerFields;
import net.runelite.rs.api.RSRawPcmStream;
import net.runelite.rs.api.RSRawSound;
import net.runelite.rs.api.RSRuneLiteClanMember;
import net.runelite.rs.api.RSRuneLiteMenuEntry;
import net.runelite.rs.api.RSSceneTileModel;
import net.runelite.rs.api.RSSceneTilePaint;
import net.runelite.rs.api.RSScriptEvent;
import net.runelite.rs.api.RSSequenceDefinition;
import net.runelite.rs.api.RSServerPacket;
import net.runelite.rs.api.RSSoundEffect;
import net.runelite.rs.api.RSSpotAnimationDefinition;
import net.runelite.rs.api.RSSpriteMask;
import net.runelite.rs.api.RSSpritePixels;
import net.runelite.rs.api.RSStructComposition;
import net.runelite.rs.api.RSTextureProvider;
import net.runelite.rs.api.RSTileItem;
import net.runelite.rs.api.RSUsername;
import net.runelite.rs.api.RSVarbitComposition;
import net.runelite.rs.api.RSVarcs;
import net.runelite.rs.api.RSVarpDefinition;
import net.runelite.rs.api.RSWidget;
import net.runelite.rs.api.RSWidgetDefinition;
import net.runelite.rs.api.RSWorld;
import net.runelite.rs.api.RSWorldMap;
import net.runelite.rs.api.RSWorldMapElement;
import net.runelite.rs.api.RSWorldView;

public interface RSClient
extends RSGameEngine,
Client {
    @Import(value="mapIconCount")
    public int getMapIconCount();

    @Import(value="drawSpriteOnMinimap")
    default public void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, RSSpritePixels var4, RSSpriteMask var5) {
        this.drawSpriteOnMinimap(var0, var1, var2, var3, this.getCamAngleDY() & 0x7FF, var4, var5);
    }

    @Import(value="drawSpriteOnMinimap")
    public void drawSpriteOnMinimap(int var1, int var2, int var3, int var4, int var5, RSSpritePixels var6, RSSpriteMask var7);

    @Import(value="mapIconXs")
    public int[] getMapIconXs();

    @Import(value="mapIconYs")
    public int[] getMapIconYs();

    @Import(value="varcs")
    public RSVarcs getVarcs();

    @Import(value="changedSkills")
    public int[] getChangedSkills();

    @Import(value="changedSkillsCount")
    public int getChangedSkillsCount();

    @Import(value="changedSkillsCount")
    public void setChangedSkillsCount(int var1);

    @Import(value="mouseCam")
    public boolean isMouseCameraMode();

    @Import(value="KeyHandler_keyCodes")
    public int[] getKeyHandlerKeyCodes();

    @Import(value="randomDatData")
    public byte[] getRandomDatData();

    @Import(value="randomDatData")
    public void setRandomDatData(byte[] var1);

    public RSWidget[] getGroup(int var1);

    @Import(value="topLevelWorldView")
    public RSWorldView getTopLevelWorldView();

    @Import(value="gameState")
    public int getRSGameState();

    @Import(value="updateGameState")
    public void setRSGameState(int var1);

    @Import(value="worldSelectOpen")
    public boolean isWorldSelectOpen();

    @Import(value="isMembersWorld")
    public boolean isMembersWorld();

    @Import(value="worldSelectOpen")
    public void setWorldSelectOpen(boolean var1);

    @Import(value="Login_username")
    public String getUsername();

    @Import(value="Login_username")
    public void setUsername(String var1);

    @Import(value="combatTargetPlayerIndex")
    public int getLocalInteractingIndex();

    @Import(value="combatTargetPlayerIndex")
    public void setLocalInteractingIndex(int var1);

    @Import(value="otp")
    public String getOtp();

    @Import(value="otp")
    public void setOtp(String var1);

    @Import(value="currentLoginField")
    public int getCurrentLoginField();

    @Import(value="loginIndex")
    public int getLoginIndex();

    @Import(value="fps")
    public int getFPS();

    @Import(value="cameraX")
    public int getCameraX();

    @Import(value="cameraZ")
    public int getCameraY();

    @Import(value="cameraY")
    public int getCameraZ();

    @Import(value="cameraPitch")
    public int getCameraPitch();

    @Import(value="cameraPitch")
    public void setCameraPitch(int var1);

    @Import(value="cameraYaw")
    public int getCameraYaw();

    @Import(value="worldId")
    public int getWorld();

    @Import(value="canvasHeight")
    public int getCanvasHeight();

    @Import(value="canvasWidth")
    public int getCanvasWidth();

    @Import(value="viewportHeight")
    public int getViewportHeight();

    @Import(value="viewportWidth")
    public int getViewportWidth();

    @Import(value="viewportOffsetX")
    public int getViewportXOffset();

    @Import(value="viewportOffsetY")
    public int getViewportYOffset();

    @Import(value="viewportZoom")
    public int getScale();

    @Import(value="localPlayer")
    public RSPlayer getLocalPlayer();

    @Import(value="localPlayerIndex")
    public int getLocalPlayerIndex();

    @Import(value="archive8")
    public RSArchive getIndexSprites();

    @Import(value="archive12")
    public RSArchive getIndexScripts();

    @Import(value="archive2")
    public RSArchive getIndexConfig();

    @Import(value="MouseHandler_currentButton")
    public int getMouseCurrentButton();

    @Import(value="isDraggingWidget")
    public boolean isDraggingWidget();

    @Import(value="clickedWidget")
    public RSWidget getDraggedWidget();

    @Import(value="draggedOnWidget")
    public RSWidget getDraggedOnWidget();

    @Import(value="draggedOnWidget")
    public void setDraggedOnWidget(Widget var1);

    @Import(value="widgetDragDuration")
    public int getDragTime();

    @Import(value="rootInterface")
    public int getTopLevelInterfaceId();

    @Import(value="rootWidgetXs")
    public int[] getWidgetPositionsX();

    @Import(value="rootWidgetYs")
    public int[] getWidgetPositionsY();

    @Construct
    public RSWidget createWidget();

    @Import(value="runEnergy")
    public int getEnergy();

    @Import(value="weight")
    public int getWeight();

    @Import(value="playerMenuActions")
    public String[] getPlayerOptions();

    @Import(value="playerOptionsPriorities")
    public boolean[] getPlayerOptionsPriorities();

    @Import(value="playerMenuOpcodes")
    public int[] getPlayerMenuTypes();

    @Import(value="World_worlds")
    public RSWorld[] getWorldList();

    @Import(value="isMenuOpen")
    public boolean isMenuOpen();

    @Import(value="camAngleY")
    public int getMapAngle();

    @Import(value="isResizable")
    public boolean isResized();

    @Import(value="RunException_revision")
    public int getRevision();

    @Import(value="regions")
    public int[] getMapRegions();

    @Import(value="instanceChunkTemplates")
    public int[][][] getInstanceTemplateChunks();

    @Import(value="xteaKeys")
    public int[][] getXteaKeys();

    @Import(value="Varps_main")
    public int[] getVarps();

    @Import(value="Varps_temp")
    public int[] getServerVarps();

    default public void closeInterface(WidgetNode interfaceNode, boolean unload) {
        this.closeInterface((RSInterfaceParent)interfaceNode, unload);
    }

    @Import(value="widgetFlags")
    public RSNodeHashTable getWidgetFlags();

    @Import(value="interfaceParents")
    public RSNodeHashTable getComponentTable();

    @Import(value="grandExchangeOffers")
    public RSGrandExchangeOffer[] getGrandExchangeOffers();

    @Import(value="Messages_channels")
    public Map getChatLineMap();

    @Import(value="Messages_hashTable")
    public RSIterableNodeHashTable getMessages();

    @Import(value="WorldMapElement_get")
    public RSWorldMapElement getMapElementConfig(int var1);

    @Import(value="mapSceneSprites")
    public RSIndexedSprite[] getMapScene();

    @Import(value="mapDotSprites")
    public RSSpritePixels[] getMapDots();

    @Import(value="cycle")
    public int getGameCycle();

    @Import(value="mapIcons")
    public RSSpritePixels[] getMapIcons();

    @Import(value="AbstractFont_modIconSprites")
    public RSIndexedSprite[] getModIcons();

    @Construct
    public RSIndexedSprite createIndexedSprite();

    @Construct
    public RSSpritePixels createSpritePixels(int[] var1, int var2, int var3);

    @Import(value="rasterProvider")
    public RSAbstractRasterProvider getBufferProvider();

    @Import(value="MouseHandler_idleCycles")
    public int getMouseIdleTicks();

    @Import(value="MouseHandler_idleCycles")
    public void setMouseIdleTicks(int var1);

    @Import(value="MouseHandler_lastPressedTimeMillis")
    public long getMouseLastPressedMillis();

    @Import(value="MouseHandler_lastPressedTimeMillis")
    public void setMouseLastPressedMillis(long var1);

    @Import(value="mouseLastLastPressedTimeMillis")
    public long getClientMouseLastPressedMillis();

    @Import(value="mouseLastLastPressedTimeMillis")
    public void setClientMouseLastPressedMillis(long var1);

    default public int getKeyboardIdleTicks() {
        return this.getKeyHandler().getKeyboardIdleTicks();
    }

    @Import(value="itemContainers")
    public RSNodeHashTable getItemContainers();

    @Import(value="Interpreter_intStackSize")
    public int getIntStackSize();

    @Import(value="Interpreter_intStackSize")
    public void setIntStackSize(int var1);

    @Import(value="Interpreter_intStack")
    public int[] getIntStack();

    @Import(value="Interpreter_stringStackSize")
    public int getStringStackSize();

    @Import(value="Interpreter_stringLocals")
    public Object[] getStringLocals();

    @Import(value="Interpreter_stringStackSize")
    public void setStringStackSize(int var1);

    @Import(value="Interpreter_stringStack")
    public Object[] getObjectStack();

    @Import(value="scriptActiveWidget")
    public RSWidget getScriptActiveWidget();

    @Import(value="scriptDotWidget")
    public RSWidget getScriptDotWidget();

    @Import(value="friendsChat")
    public RSFriendsChat getFriendsChatManager();

    @Import(value="clientPreferences")
    public RSClientPreferences getPreferences();

    @Import(value="camAngleY")
    public int getCameraYawTarget();

    @Import(value="camAngleY")
    public void setCameraYawTarget(int var1);

    @Import(value="camAngleX")
    public int getCameraPitchTarget();

    @Import(value="camAngleX")
    public void setCameraPitchTarget(int var1);

    @Import(value="getWorldMap")
    public RSWorldMap getWorldMap();

    @Import(value="changeWorld")
    public void changeWorld(World var1);

    @Construct
    public RSWorld createWorld();

    @Import(value="isInInstance")
    public boolean isInInstancedRegion();

    @Import(value="currentLevels")
    public int[] getBoostedSkillLevels();

    @Import(value="levels")
    public int[] getRealSkillLevels();

    @Import(value="experience")
    public int[] getSkillExperiences();

    @Import(value="compass")
    public void setCompass(SpritePixels var1);

    default public RSEvictingDualNodeHashTable getWidgetSpriteCache() {
        return this.getWidgetDefinition().getWidgetSpriteCache();
    }

    @Import(value="oculusOrbState")
    public int getOculusOrbState();

    @Import(value="oculusOrbState")
    public void setOculusOrbState(int var1);

    @Import(value="oculusOrbNormalSpeed")
    public void setOculusOrbNormalSpeed(int var1);

    @Import(value="oculusOrbFocalPointX")
    public int getOculusOrbFocalPointX();

    @Import(value="oculusOrbFocalPointY")
    public int getOculusOrbFocalPointY();

    @Import(value="oculusOrbFocalPointY")
    public void setOculusOrbFocalPointY(int var1);

    default public int get3dZoom() {
        return this.get3DRasterizerFields().getZoom();
    }

    default public void set3dZoom(int zoom) {
        this.get3DRasterizerFields().setZoom(zoom);
    }

    default public int getCenterX() {
        return this.get3DRasterizerFields().getClipMidX();
    }

    default public int getCenterY() {
        return this.get3DRasterizerFields().getClipMidY();
    }

    @Import(value="textureProvider")
    public RSTextureProvider getTextureProvider();

    default public int getRasterizer3D_clipMidX2() {
        return this.get3DRasterizerFields().getClipMidX2();
    }

    default public int getRasterizer3D_clipNegativeMidX() {
        return this.get3DRasterizerFields().getClipNegativeMidX();
    }

    default public int getRasterizer3D_clipNegativeMidY() {
        return this.get3DRasterizerFields().getClipNegativeMidY();
    }

    default public int getRasterizer3D_clipMidY2() {
        return this.get3DRasterizerFields().getClipMidY2();
    }

    @Import(value="isSpellSelected")
    public boolean isWidgetSelected();

    @Import(value="oculusOrbFocalPointX")
    public void setOculusOrbFocalPointX(int var1);

    default public void setKeyboardIdleTicks(int cycles) {
        this.getKeyHandler().setKeyboardIdleTicks(cycles);
    }

    @Import(value="foundItemIdCount")
    public void setGeSearchResultCount(int var1);

    @Import(value="foundItemIds")
    public void setGeSearchResultIds(short[] var1);

    @Import(value="foundItemIndex")
    public void setGeSearchResultIndex(int var1);

    @Import(value="followerIndex")
    public int getFollowerIndex();

    @Import(value="isItemSelected")
    public int isItemSelected();

    @Import(value="meslayerContinueWidget")
    public Widget getMessageContinueWidget();

    @Import(value="getFrames")
    public RSFrames getFrames(int var1);

    @Import(value="SequenceDefinition_get")
    public RSSequenceDefinition getSequenceDefinition(int var1);

    @Import(value="destinationX")
    public int getDestinationX();

    @Import(value="SequenceDefinition_skeletonsArchive")
    public RSAbstractArchive getSequenceDefinition_skeletonsArchive();

    @Import(value="SequenceDefinition_archive")
    public RSAbstractArchive getSequenceDefinition_archive();

    @Import(value="SequenceDefinition_animationsArchive")
    public RSAbstractArchive getSequenceDefinition_animationsArchive();

    @Import(value="NpcDefinition_archive")
    public RSAbstractArchive getNpcDefinition_archive();

    @Import(value="ObjectDefinition_modelsArchive")
    public RSAbstractArchive getObjectDefinition_modelsArchive();

    @Import(value="ObjectDefinition_archive")
    public RSAbstractArchive getObjectDefinition_archive();

    @Import(value="destinationY")
    public int getDestinationY();

    @Import(value="ItemDefinition_archive")
    public RSAbstractArchive getItemDefinition_archive();

    @Import(value="KitDefinition_archive")
    public RSAbstractArchive getKitDefinition_archive();

    @Import(value="KitDefinition_modelsArchive")
    public RSAbstractArchive getKitDefinition_modelsArchive();

    @Import(value="SpotAnimationDefinition_archive")
    public RSAbstractArchive getSpotAnimationDefinition_archive();

    @Import(value="SpotAnimationDefinition_modelArchive")
    public RSAbstractArchive getSpotAnimationDefinition_modelArchive();

    @Construct
    public RSBuffer createBuffer(byte[] var1);

    @Import(value="crossWorldMessageIds")
    public long[] getCrossWorldMessageIds();

    @Import(value="crossWorldMessageIdsIndex")
    public int getCrossWorldMessageIdsIndex();

    @Import(value="guestClanChannel")
    public RSClanChannel getGuestClanChannel();

    @Import(value="guestClanSettings")
    public RSClanSettings getGuestClanSettings();

    default public RSNodeDeque getAmbientSoundEffects() {
        return this.getTopLevelWorldView().getSoundEffects();
    }

    public boolean getCameraPitchRelaxerEnabled();

    public void posToCameraAngle(int var1, int var2);

    @Import(value="MouseHandler_lastPressedX")
    public int getMouseLastPressedX();

    @Import(value="MouseHandler_lastPressedX")
    public void setMouseLastPressedX(int var1);

    @Import(value="MouseHandler_lastPressedY")
    public int getMouseLastPressedY();

    @Import(value="MouseHandler_lastPressedY")
    public void setMouseLastPressedY(int var1);

    @Import(value="packetWriter")
    public RSPacketWriter getPacketWriter();

    @Import(value="getPacketBufferNode")
    public RSPacketBufferNode preparePacket(ClientPacket var1, IsaacCipher var2);

    @Import(value="mouseWheelRotation")
    public int getMouseWheelRotation();

    @Import(value="isMenuOpen")
    public void setMenuOpen(boolean var1);

    public RSVarbitComposition getVarbitComposition(int var1);

    @Import(value="clickedWidget")
    public void setDraggedWidget(Widget var1);

    @Import(value="widgetDefaultMenuAction")
    public void invokeWidgetAction(int var1, int var2, int var3, int var4, String var5);

    @Import(value="Login_promptCredentials")
    public void promptCredentials(boolean var1);

    @Import(value="loginIndex")
    public void setLoginIndex(int var1);

    @Construct
    public RSClientPacket createClientPacket(int var1, int var2);

    @Construct
    public RSServerPacket createServerPacket(int var1, int var2);

    @Import(value="Login_password")
    public String getPassword();

    @Import(value="Login_password")
    public void setPassword(String var1);

    @Import(value="ViewportMouse_entityTags")
    public long[] getEntitiesAtMouse();

    @Import(value="ViewportMouse_entityCount")
    public int getEntitiesAtMouseCount();

    @Import(value="ViewportMouse_entityCount")
    public void setEntitiesAtMouseCount(int var1);

    @Import(value="calculateTag")
    public long calculateTag(int var1, int var2, int var3, int var4, boolean var5, int var6, int var7);

    @Import(value="playingJingle")
    public boolean isPlayingJingle();

    @Import(value="xPadding")
    public int getLoginScreenXPadding();

    @Import(value="MouseHandler_xVolatile")
    public int getMouseX();

    @Import(value="MouseHandler_yVolatile")
    public int getMouseY();

    @Import(value="containsBounds")
    public boolean containsBounds(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

    @Import(value="loadWorlds")
    public boolean loadWorlds();

    default public RSWidget[][] getWidgets() {
        if (this.getWidgetDefinition() == null) {
            return null;
        }
        return this.getWidgetDefinition().getWidgets();
    }

    @Import(value="resumePauseWidget")
    public void processDialog(int var1, int var2);

    @Import(value="widgetDefinition")
    public RSWidgetDefinition getWidgetDefinition();

    @Import(value="tempMenuAction")
    public RSMenuAction getTempMenuAction();

    @Import(value="menu")
    public RSMenu getMenu();

    @Import(value="addChatMessage")
    public void addRSChatMessage(int var1, String var2, String var3, String var4);

    @Import(value="getObjectDefinition")
    public RSObjectComposition getRSObjectComposition(int var1);

    @Import(value="getNpcDefinition")
    public RSNPCComposition getRSNpcComposition(int var1);

    @Import(value="mouseCam")
    public boolean isMouseCam();

    @Import(value="camAngleDX")
    public int getCamAngleDX();

    @Import(value="camAngleDX")
    public void setCamAngleDX(int var1);

    @Import(value="camAngleDY")
    public int getCamAngleDY();

    @Import(value="camAngleDY")
    public void setCamAngleDY(int var1);

    @Import(value="ItemDefinition_get")
    public RSItemComposition getRSItemDefinition(int var1);

    @Import(value="getItemSprite")
    public RSSpritePixels createRSItemSprite(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7, int var8);

    @Import(value="menuAction")
    public void sendMenuAction(int var1, int var2, int var3, int var4, int var5, int var6, String var7, String var8, int var9, int var10);

    @Import(value="SpriteBuffer_decode")
    public void decodeSprite(byte[] var1);

    @Import(value="SpriteBuffer_spriteCount")
    public int getIndexedSpriteCount();

    @Import(value="SpriteBuffer_spriteWidth")
    public int getIndexedSpriteWidth();

    @Import(value="SpriteBuffer_spriteHeight")
    public int getIndexedSpriteHeight();

    @Import(value="SpriteBuffer_xOffsets")
    public int[] getIndexedSpriteOffsetXs();

    @Import(value="SpriteBuffer_xOffsets")
    public void setIndexedSpriteOffsetXs(int[] var1);

    @Import(value="SpriteBuffer_yOffsets")
    public int[] getIndexedSpriteOffsetYs();

    @Import(value="SpriteBuffer_yOffsets")
    public void setIndexedSpriteOffsetYs(int[] var1);

    @Import(value="SpriteBuffer_spriteWidths")
    public int[] getIndexedSpriteWidths();

    @Import(value="SpriteBuffer_spriteWidths")
    public void setIndexedSpriteWidths(int[] var1);

    @Import(value="SpriteBuffer_spriteHeights")
    public int[] getIndexedSpriteHeights();

    @Import(value="SpriteBuffer_spriteHeights")
    public void setIndexedSpriteHeights(int[] var1);

    @Import(value="SpriteBuffer_pixels")
    public byte[][] getSpritePixels();

    @Import(value="SpriteBuffer_pixels")
    public void setSpritePixels(byte[][] var1);

    @Import(value="SpriteBuffer_spritePalette")
    public int[] getIndexedSpritePalette();

    @Import(value="SpriteBuffer_spritePalette")
    public void setIndexedSpritePalette(int[] var1);

    @Import(value="archive6")
    public RSArchive getMusicTracks();

    @Import(value="cycleCntr")
    public int getCycleCntr();

    @Import(value="chatCycle")
    public void setChatCycle(int var1);

    @Import(value="AbstractFont_modIconSprites")
    public void setRSModIcons(RSIndexedSprite[] var1);

    @Import(value="soundEffects")
    public RSSoundEffect[] getAudioEffects();

    @Import(value="ItemDefinition_cached")
    public RSEvictingDualNodeHashTable getItemCompositionCache();

    @Import(value="soundEffectIds")
    public int[] getQueuedSoundEffectIDs();

    @Import(value="soundLocations")
    public int[] getSoundLocations();

    @Import(value="queuedSoundEffectLoops")
    public int[] getQueuedSoundEffectLoops();

    @Import(value="queuedSoundEffectDelays")
    public int[] getQueuedSoundEffectDelays();

    @Import(value="soundEffectCount")
    public int getQueuedSoundEffectCount();

    @Import(value="soundEffectCount")
    public void setQueuedSoundEffectCount(int var1);

    @Import(value="queueSoundEffect")
    public void queueSoundEffect(int var1, int var2, int var3);

    @Import(value="isLowDetail")
    public boolean isLowMemory();

    @Import(value="isLowDetail")
    public void setLowMemory(boolean var1);

    @Import(value="Scene_isLowDetail")
    public void setSceneLowMemory(boolean var1);

    @Import(value="PcmPlayer_stereo")
    public void setAudioHighMemory(boolean var1);

    @Import(value="ObjectDefinition_isLowDetail")
    public void setObjectDefinitionLowDetail(boolean var1);

    @Import(value="friendSystem")
    public RSFriendSystem getFriendManager();

    @Import(value="loginType")
    public RSLoginType getLoginType();

    @Construct
    public RSUsername createName(String var1, RSLoginType var2);

    @Import(value="getVarbit")
    public int rs$getVarbit(int var1);

    @Import(value="VarbitDefinition_cached")
    public RSEvictingDualNodeHashTable getVarbitCache();

    @Import(value="musicTrackQueue")
    public ArrayList<RSMusicTrackDescriptor> getActiveMusicTracks();

    @Import(value="Rasterizer3D_fields")
    public RSRasterizerFields get3DRasterizerFields();

    @Import(value="Rasterizer3D_setClipFromRasterizer2D")
    public void setClipFromRasterizer2D();

    default public void setRasterizer3DIsClipped(boolean clipped2D) {
        this.get3DRasterizerFields().setClipped(clipped2D);
    }

    @Import(value="Rasterizer3D_gouraud")
    public void Rasterizer3D_gouraud(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12);

    default public void setRasterizer3DAlpha(int alpha) {
        this.get3DRasterizerFields().setAlpha(alpha);
    }

    @Import(value="Rasterizer3D_fillAlpha")
    public void rasterizer3DFillAlpha(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

    @Import(value="Model_transformTempX")
    public void setAnimOffsetX(int var1);

    @Import(value="Model_transformTempY")
    public void setAnimOffsetY(int var1);

    @Import(value="Model_transformTempZ")
    public void setAnimOffsetZ(int var1);

    @Import(value="sceneMinimapSprite")
    public RSSpritePixels getMinimapSprite();

    @Import(value="sceneMinimapSprite")
    public void setMinimapSprite(SpritePixels var1);

    @Import(value="drawObject")
    public void drawObject(int var1, int var2, int var3, int var4, int var5);

    @Construct
    public RSScriptEvent createScriptEvent();

    @Import(value="runScript")
    public void runScript(RSScriptEvent var1, int var2, int var3);

    @Import(value="hintArrow")
    public RSHintArrow getHintArrow();

    default public int getHintArrowTargetType() {
        return this.getHintArrow().getType();
    }

    default public void setHintArrowTargetType(int value) {
        this.getHintArrow().setType(value);
    }

    default public int getHintArrowX() {
        return this.getHintArrow().getX();
    }

    default public void setHintArrowX(int value) {
        this.getHintArrow().setX(value);
    }

    default public int getHintArrowY() {
        return this.getHintArrow().getY();
    }

    default public void setHintArrowY(int value) {
        this.getHintArrow().setY(value);
    }

    default public int getHintArrowOffsetX() {
        return this.getHintArrow().getSubX();
    }

    default public void setHintArrowOffsetX(int value) {
        this.getHintArrow().setSubX(value);
    }

    default public int getHintArrowOffsetY() {
        return this.getHintArrow().getSubY();
    }

    @Import(value="Rasterizer2D_pixels")
    public int[] getGraphicsPixels();

    default public void setHintArrowOffsetY(int value) {
        this.getHintArrow().setSubY(value);
    }

    default public int getHintArrowIndex() {
        return this.getHintArrow().getIndex();
    }

    default public void setHintArrowTargetIndex(int value) {
        this.getHintArrow().setIndex(value);
    }

    @Import(value="worldProperties")
    public int getFlags();

    @Import(value="worldToMinimap")
    public void worldToMinimap(RSWorldView var1, int var2, int var3, int var4, int var5, int var6, SpritePixels var7, RSSpriteMask var8);

    default public void worldToMinimap(int var0, int var1, int var2, int var3, RSSpritePixels var4, RSSpriteMask var5) {
        this.worldToMinimap(this.getTopLevelWorldView(), var0, var1, var2, var3, this.getCamAngleDY() & 0x7FF, var4, var5);
    }

    @Import(value="mapMarkerSprites")
    public RSSpritePixels[] getMapMarkerSprites();

    public RSTileItem getLastItemDespawn();

    public void setLastItemDespawn(RSTileItem var1);

    @Import(value="alignWidget")
    public void revalidateWidget(Widget var1);

    @Import(value="revalidateWidgetScroll")
    public void revalidateWidgetScroll(Widget[] var1, Widget var2, boolean var3);

    @Import(value="ViewportMouse_x")
    public int getViewportMouseX();

    @Import(value="ViewportMouse_y")
    public int getViewportMouseY();

    @Import(value="ObjectDefinition_cachedModels")
    public RSEvictingDualNodeHashTable getObjectDefinitionModelsCache();

    @Import(value="isSpellSelected")
    public void setSpellSelected(boolean var1);

    @Import(value="selectedSpellChildIndex")
    public void setSelectedSpellChildIndex(int var1);

    @Import(value="selectedSpellChildIndex")
    public int getSelectedSpellChildIndex();

    @Import(value="ViewportMouse_isInViewport")
    public boolean getViewportContainsMouse();

    @Import(value="Rasterizer2D_setClip")
    public void setClip(int var1, int var2, int var3, int var4);

    @Import(value="Rasterizer2D_replace")
    public void replacePixels(int[] var1, int var2, int var3, float[] var4);

    @Import(value="Rasterizer2D_width")
    public int getGraphicsPixelsWidth();

    @Import(value="Rasterizer2D_height")
    public int getGraphicsPixelsHeight();

    @Import(value="selectedSpellWidget")
    public int getSelectedSpellWidget();

    @Import(value="Rasterizer2D_fillRectangle")
    public void rasterizerFillRectangle(int var1, int var2, int var3, int var4, int var5);

    @Import(value="Rasterizer2D_xClipStart")
    public int getStartX();

    @Import(value="Rasterizer2D_yClipStart")
    public int getStartY();

    @Import(value="Rasterizer2D_xClipEnd")
    public int getEndX();

    @Import(value="Rasterizer2D_yClipEnd")
    public int getEndY();

    @Import(value="getEnum")
    public RSEnumComposition getRsEnum(int var1);

    @Import(value="fontBold12")
    public RSFont getFontBold12();

    @Import(value="Rasterizer2D_drawHorizontalLine")
    public void rasterizerDrawHorizontalLine(int var1, int var2, int var3, int var4);

    @Import(value="Rasterizer2D_drawLine")
    public void Rasterizer2D_drawLine(int var1, int var2, int var3, int var4, int var5);

    @Import(value="Rasterizer2D_drawHorizontalLineAlpha")
    public void rasterizerDrawHorizontalLineAlpha(int var1, int var2, int var3, int var4, int var5);

    @Import(value="Rasterizer2D_drawVerticalLine")
    public void rasterizerDrawVerticalLine(int var1, int var2, int var3, int var4);

    @Import(value="Rasterizer2D_drawVerticalLineAlpha")
    public void rasterizerDrawVerticalLineAlpha(int var1, int var2, int var3, int var4, int var5);

    @Import(value="Rasterizer2D_fillRectangleGradient")
    public void rasterizerDrawGradient(int var1, int var2, int var3, int var4, int var5, int var6);

    @Import(value="Rasterizer2D_fillRectangleGradientAlpha")
    public void rasterizerDrawGradientAlpha(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

    @Import(value="Rasterizer2D_fillRectangleAlpha")
    public void rasterizerFillRectangleAlpha(int var1, int var2, int var3, int var4, int var5, int var6);

    @Import(value="Rasterizer2D_drawRectangle")
    public void rasterizerDrawRectangle(int var1, int var2, int var3, int var4, int var5);

    @Import(value="Rasterizer2D_drawRectangleAlpha")
    public void rasterizerDrawRectangleAlpha(int var1, int var2, int var3, int var4, int var5, int var6);

    @Import(value="drawCircle")
    public void rasterizerDrawCircle(int var1, int var2, int var3, int var4);

    @Import(value="Rasterizer2D_drawCircleAlpha")
    public void rasterizerDrawCircleAlpha(int var1, int var2, int var3, int var4, int var5);

    @Import(value="HealthBarDefinition_cached")
    public RSEvictingDualNodeHashTable getHealthBarCache();

    @Import(value="readSoundEffect")
    public RSSoundEffect getTrack(RSAbstractArchive var1, int var2, int var3);

    @Import(value="createRawPcmStream")
    public RSRawPcmStream createRawPcmStream(RSRawSound var1, int var2, int var3);

    @Import(value="pcmStreamMixer")
    public RSPcmStreamMixer getSoundEffectAudioQueue();

    @Import(value="archive4")
    public RSArchive getIndexCache4();

    public void playMusicTrack(int var1, RSAbstractArchive var2, int var3, int var4, int var5, boolean var6);

    @Import(value="VarpDefinition_get")
    public RSVarpDefinition getVarpDefinition(int var1);

    @Construct
    public RSFloorOverlayDefinition newFloorOverlayDefinition();

    @Construct
    public RSTileItem newTileItem();

    @Import(value="renderSelf")
    public boolean getRenderSelf();

    @Construct
    public RSNodeDeque newNodeDeque();

    @Import(value="updateItemPile")
    public void updateItemPile(RSWorldView var1, int var2, int var3, int var4);

    @Import(value="changedSkills")
    public int[] getChangedSkillLevels();

    @Import(value="rootWidgetCount")
    public int getRootWidgetCount();

    @Import(value="widgetClickX")
    public int getWidgetClickX();

    @Import(value="widgetClickY")
    public int getWidgetClickY();

    @Import(value="renderSelf")
    public void setRenderSelf(boolean var1);

    @Import(value="tradeChatMode")
    public int getTradeChatMode();

    @Import(value="publicChatMode")
    public int getPublicChatMode();

    @Import(value="clientType")
    public int getClientType();

    @Import(value="clientType")
    public void setClientType(int var1);

    @Import(value="onMobile")
    public boolean isOnMobile();

    @Import(value="onMobile")
    public void setOnMobile(boolean var1);

    @Import(value="mouseRecorder")
    public RSMouseRecorder getMouseRecorder();

    @Import(value="hadFocus")
    public boolean hadFocus();

    @Import(value="mouseCrossColor")
    public int getMouseCrossColor();

    @Import(value="mouseCrossColor")
    public void setMouseCrossColor(int var1);

    @Import(value="leftClickOpensMenu")
    public boolean getLeftClickOpensMenu();

    @Import(value="showMouseOverText")
    public boolean getShowMouseOverText();

    @Import(value="showMouseOverText")
    public void setShowMouseOverText(boolean var1);

    @Import(value="selectedSpellName")
    public String getSelectedSpellName();

    public boolean isMinimapZoom();

    public double getMinimapZoom();

    public Rasterizer getRasterizer();

    public String getDiscordUsername();

    public String getDiscordId();

    @Import(value="timeOfPreviousKeyPress")
    public long getTimeOfPreviousKeyPress();

    @Import(value="selectedSpellName")
    public void setSelectedSpellName(String var1);

    @Import(value="timeOfPreviousKeyPress")
    public void setTimeOfPreviousKeyPress(long var1);

    public int getMappedKeyCode(int var1);

    @Import(value="showLoadingMessages")
    public boolean getShowLoadingMessages();

    @Import(value="showLoadingMessages")
    public void setShowLoadingMessages(boolean var1);

    @Import(value="stopTimeMs")
    public void setStopTimeMs(long var1);

    @Import(value="clearLoginScreen")
    public void clearLoginScreen(boolean var1);

    @Import(value="selectedSpellActionName")
    public String getSelectedSpellActionName();

    @Import(value="leftTitleSprite")
    public void setLeftTitleSprite(SpritePixels var1);

    @Import(value="rightTitleSprite")
    public void setRightTitleSprite(SpritePixels var1);

    @Construct
    public RSBuffer newBuffer(byte[] var1);

    @Construct
    public RSVarbitComposition newVarbitDefinition();

    @Import(value="musicPlayerStatus")
    public void setMusicPlayerStatus(int var1);

    @Import(value="changedVarps")
    public int[] getChangedVarps();

    @Import(value="selectedSpellFlags")
    public int getSelectedSpellFlags();

    @Import(value="changedVarpCount")
    public int getChangedVarpCount();

    @Import(value="changedVarpCount")
    public void setChangedVarpCount(int var1);

    public RSScriptEvent createRSScriptEvent(Object ... var1);

    public void runScriptEvent(RSScriptEvent var1);

    @Import(value="Script_cached")
    public RSEvictingDualNodeHashTable getScriptCache();

    @Import(value="StructDefinition_cached")
    public RSEvictingDualNodeHashTable getRSStructCompositionCache();

    @Import(value="selectedSpellFlags")
    public void setSelectedSpellFlags(int var1);

    @Import(value="StructDefinition_getStructDefinition")
    public RSStructComposition getRSStructComposition(int var1);

    @Import(value="getParamDefinition")
    public RSParamComposition getRSParamComposition(int var1);

    @Construct
    public RSIntegerNode newIntegerNode(int var1);

    @Construct
    public RSObjectNode newObjectNode(Object var1);

    @Construct
    public RSIterableNodeHashTable newIterableNodeHashTable(int var1);

    @Construct
    public RSSceneTilePaint createSceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7);

    @Import(value="isSpellSelected")
    public boolean getSpellSelected();

    @Import(value="currentClanChannels")
    public RSClanChannel[] getCurrentClanChannels();

    @Import(value="currentClanSettings")
    public RSClanSettings[] getCurrentClanSettingsAry();

    public ClanRank getClanRankFromRs(int var1);

    @Import(value="readStringIntParameters")
    public RSIterableNodeHashTable readStringIntParameters(RSBuffer var1, RSIterableNodeHashTable var2);

    @Import(value="rndHue")
    public int getRndHue();

    @Import(value="Tiles_underlays")
    public short[][][] getTileUnderlays();

    @Import(value="Tiles_overlays")
    public short[][][] getTileOverlays();

    @Import(value="Tiles_shapes")
    public byte[][][] getTileShapes();

    @Import(value="SpotAnimationDefinition_get")
    public RSSpotAnimationDefinition getSpotAnimationDefinition(int var1);

    @Import(value="ModelData_get")
    public RSModelData getModelData(RSAbstractArchive var1, int var2, int var3);

    @Import(value="isCameraLocked")
    public boolean isCameraLocked();

    public boolean isUnlockedFps();

    public long getUnlockedFpsTarget();

    @Import(value="EnumDefinition_cached")
    public RSEvictingDualNodeHashTable getEnumDefinitionCache();

    @Import(value="FloorUnderlayDefinition_cached")
    public RSEvictingDualNodeHashTable getFloorUnderlayDefinitionCache();

    @Import(value="FloorOverlayDefinition_archive")
    public RSAbstractArchive getFloorOverlayDefinitionArchive();

    @Import(value="crossSprites")
    public RSSpritePixels[] getCrossSprites();

    @Import(value="FloorOverlayDefinition_cached")
    public RSEvictingDualNodeHashTable getFloorOverlayDefinitionCache();

    @Import(value="HitSplatDefinition_cached")
    public RSEvictingDualNodeHashTable getHitSplatDefinitionCache();

    @Import(value="HitSplatDefinition_cachedFonts")
    public RSEvictingDualNodeHashTable getHitSplatDefinitionDontsCache();

    @Import(value="InvDefinition_cached")
    public RSEvictingDualNodeHashTable getInvDefinitionCache();

    @Import(value="ItemDefinition_cachedModels")
    public RSEvictingDualNodeHashTable getItemDefinitionModelsCache();

    public void setModulus(BigInteger var1);

    @Import(value="ItemDefinition_cachedSprites")
    public RSEvictingDualNodeHashTable getItemDefinitionSpritesCache();

    @Import(value="KitDefinition_cached")
    public RSEvictingDualNodeHashTable getKitDefinitionCache();

    @Import(value="NpcDefinition_cached")
    public RSEvictingDualNodeHashTable getNpcDefinitionCache();

    @Import(value="NpcDefinition_cachedModels")
    public RSEvictingDualNodeHashTable getNpcDefinitionModelsCache();

    @Import(value="ObjectDefinition_cached")
    public RSEvictingDualNodeHashTable getObjectDefinitionCache();

    @Import(value="ObjectDefinition_cachedModelData")
    public RSEvictingDualNodeHashTable getObjectDefinitionModelDataCache();

    public BigInteger getModulus();

    @Import(value="ObjectDefinition_cachedEntities")
    public RSEvictingDualNodeHashTable getObjectDefinitionEntitiesCache();

    @Import(value="ParamDefinition_cached")
    public RSEvictingDualNodeHashTable getParamDefinitionCache();

    @Import(value="PlayerAppearance_cachedModels")
    public RSEvictingDualNodeHashTable getPlayerAppearanceModelsCache();

    @Import(value="SequenceDefinition_cached")
    public RSEvictingDualNodeHashTable getSequenceDefinitionCache();

    @Import(value="SequenceDefinition_cachedFrames")
    public RSEvictingDualNodeHashTable getSequenceDefinitionFramesCache();

    @Import(value="SequenceDefinition_cachedModel")
    public RSEvictingDualNodeHashTable getSequenceDefinitionModelsCache();

    @Import(value="ItemDefinition_fileCount")
    public int getItemCount();

    @Import(value="SpotAnimationDefinition_cached")
    public RSEvictingDualNodeHashTable getSpotAnimationDefinitionCache();

    @Import(value="SpotAnimationDefinition_cachedModels")
    public RSEvictingDualNodeHashTable getSpotAnimationDefinitionModlesCache();

    @Import(value="VarcInt_cached")
    public RSEvictingDualNodeHashTable getVarcIntCache();

    @Import(value="VarpDefinition_cached")
    public RSEvictingDualNodeHashTable getVarpDefinitionCache();

    @Import(value="WorldMapElement_cachedSprites")
    public RSEvictingDualNodeHashTable getSpritesCache();

    @Import(value="insertMenuItem")
    public int insertMenuItem(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9);

    @Import(value="DBRowType_cache")
    public RSEvictingDualNodeHashTable getDbRowTypeCache();

    @Import(value="DBTableType_cache")
    public RSEvictingDualNodeHashTable getDbTableTypeCache();

    @Import(value="DBTableIndex_cache")
    public RSEvictingDualNodeHashTable getDbTableIndexCache();

    @Import(value="DBTableMasterIndex_cache")
    public RSEvictingDualNodeHashTable getDbTableMasterIndexCache();

    @Import(value="selectedSpellItemId")
    public void setSelectedSpellItemId(int var1);

    @Import(value="closeInterface")
    public void closeInterface(RSInterfaceParent var1, boolean var2);

    @Construct
    public RSIterableNodeHashTable createIterableNodeHashTable(int var1);

    @Construct
    public RSRuneLiteClanMember runeliteClanMember(ClanSettings var1, int var2);

    @Construct
    public RSModelData newModelData(RSModelData[] var1, int var2);

    @Construct
    public RSSceneTileModel newSceneTileModel(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19);

    @Import(value="selectedSpellWidget")
    public void setSelectedSpellWidget(int var1);

    @Construct
    public RSEvictingDualNodeHashTable newEvictingDualNodeHashTable(int var1);

    @Import(value="getDbTable")
    public RSDbTable getDbTable(int var1);

    @Import(value="getDbTableType")
    public RSDbTableType getDbTableType(int var1);

    @Import(value="getDbRowType")
    public RSDbRowType getDbRowType(int var1);

    @Import(value="Login_response0")
    public String getLoginResponse0();

    @Import(value="Login_response1")
    public String getLoginResponse1();

    @Import(value="Sprite_drawScaled")
    public void scaleSprite(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12);

    @Import(value="Login_response2")
    public String getLoginResponse2();

    @Import(value="Login_response3")
    public String getLoginResponse3();

    @Import(value="Login_banType")
    public int getBanType();

    @Construct
    public RSPlatformInfo createPlatformInfo(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27);

    default public RSWidget getWidgetChild(int parent, int child) {
        return this.getWidgetDefinition().getWidgetChild(parent, child);
    }

    @Import(value="ServerPacket_values")
    public RSServerPacket[] getServerPackets();

    @Import(value="JagexCache_randomDat")
    public RSBufferedFile getJagexCacheRandomDat();

    @Import(value="JagexCache_randomDat")
    public void setJagexCacheRandomDat(RSBufferedFile var1);

    @Import(value="minimapState")
    public int getMinimapState();

    default public boolean[] getPressedKeys() {
        return this.getKeyHandler().getPressedKeys();
    }

    @Import(value="SceneTileModel_xMappings")
    public float[] getSceneTileModelXMappings();

    @Import(value="SceneTileModel_yMappings")
    public float[] getSceneTileModelYMappings();

    @Import(value="showMouseCross")
    public void setShowMouseCross(boolean var1);

    public int getSelectedSubMenu();

    @Import(value="charToByteCp1252")
    public byte charToByteCp1252(char var1);

    @Import(value="scroll")
    public void scroll(Widget var1, int var2, int var3, int var4, int var5, int var6, int var7);

    public void drawMenu(RSRuneLiteMenuEntry var1, int var2, int var3, int var4, int var5, int var6);

    public void setMenuParent(int var1, RSRuneLiteMenuEntry var2);

    public RSRuneLiteMenuEntry getParent(int var1);

    @Import(value="invalidateWidget")
    public void invalidateWidget(Widget var1);

    public boolean isTesting();

    public void send(String var1);

    public void send2(String var1);

    public void setRandomRepository(Map<String, Map<String, byte[]>> var1);

    @Import(value="fps")
    public void setFps(int var1);

    @Import(value="staffModLevel")
    public int getStaffModLevel();

    @Import(value="Varps_masks")
    public int[] getVarpsMasks();

    public int[] getVarbitsFg();

    @Import(value="isItemSelected")
    public int getSelectedItem();

    @Import(value="ObjectDefinition_cached")
    public RSEvictingDualNodeHashTable getObjectCompositionCache();

    @Import(value="destinationX")
    public void setDestinationX(int var1);

    @Import(value="destinationY")
    public void setDestinationY(int var1);

    @Import(value="setWindowedMode")
    public void setWindowedMode(int var1);

    @Import(value="getWindowedMode")
    public int getWindowedMode();

    @Import(value="MouseHandler_instance")
    public RSMouseHandler getMouseHandler();

    @Import(value="KeyHandler_instance")
    public RSKeyHandler getKeyHandler();

    @Import(value="hasFocus")
    public boolean isFocused();

    @Import(value="hasFocus")
    public void setFocused(boolean var1);

    @Import(value="mouseCrossX")
    public void setClickCrossX(int var1);

    @Import(value="mouseCrossY")
    public void setClickCrossY(int var1);

    @Import(value="staffModLevel")
    public void setStaffModLevel(int var1);

    @Import(value="jagexSessionId")
    public void setJagexSessionId(String var1);

    @Import(value="jagexDisplayName")
    public void setJagexDisplayName(String var1);

    @Import(value="jagexCharacterId")
    public void setCharacterId(String var1);

    @Import(value="jagexCharacterId")
    public void set(String var1);

    @Import(value="jagexDisplayName")
    public String getJagexDisplayName();

    @Import(value="jagexDisplayName")
    public String getLauncherDisplayName();

    @Import(value="jagexCharacterId")
    public String getJagexCharacterId();

    @Import(value="jagexSessionId")
    public String getJagexSessionId();

    public String getOverwrittenEnv(String var1);

    public int getSubmenuX();

    public int getSubmenuY();

    public int getSubmenuWidth();

    public int getSubmenuHeight();

    public int getSubmenuScroll();

    public int getSubmenuIdx();

    public void setSubmenuX(int var1);

    public void setSubmenuY(int var1);

    public void setSubmenuWidth(int var1);

    public void setSubmenuHeight(int var1);

    public void setSubmenuScroll(int var1);

    public void setSubmenuScrollMax(int var1);

    public void setSubmenuIdx(int var1);

    @Import(value="oculusOrbState")
    public int getOculusOrbMode();

    @Import(value="oculusOrbState")
    public void setOculusOrbMode(int var1);

    @Import(value="oculusOrbFocalPointZ")
    public int getOculusOrbFocalPointZ();

    @Import(value="oculusOrbFocalPointZ")
    public void setOculusOrbFocalPointZ(int var1);

    @Import(value="oculusOrbNormalSpeed")
    public void setFreeOculusOrbSpeed(int var1);

    @Import(value="serverCycle")
    public int getServerCycle();

    @Import(value="modelViewportXs")
    public float[] getModelViewportXs();

    @Import(value="modelViewportYs")
    public float[] getModelViewportYs();

    default public int getMenuOptionCount() {
        return this.getMenu().getMenuOptionCount();
    }

    default public void setMenuOptionCount(int count) {
        this.getMenu().setMenuOptionCount(count);
    }

    default public int getMenuX() {
        return this.getMenu().getMenuX();
    }

    default public int getMenuY() {
        return this.getMenu().getMenuY();
    }

    default public int getMenuHeight() {
        return this.getMenu().getMenuHeight();
    }

    default public int getMenuWidth() {
        return this.getMenu().getMenuWidth();
    }

    default public String[] getMenuOptions() {
        return this.getMenu().getMenuOptions();
    }

    @Import(value="cacheReady")
    public boolean isCacheReady();

    @Import(value="Scene_tileShape2D")
    public int[][] getSceneTileShape2D();

    @Import(value="Scene_tileRotation2D")
    public int[][] getSceneTileRotation2D();

    @Import(value="projectiles")
    public Deque<Projectile> getProjectiles();

    @Import(value="invalidateWidgetsUnder")
    public void invalidateWidgetsUnder(int var1, int var2, int var3, int var4);

    @Import(value="isZBufferedRendering")
    public boolean isZBufferedRendering();
}

