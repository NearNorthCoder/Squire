/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api;

import com.jagex.oldscape.pub.OAuthApi;
import java.awt.Canvas;
import java.awt.Dimension;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.runelite.api.Actor;
import net.runelite.api.AmbientSoundEffect;
import net.runelite.api.Animation;
import net.runelite.api.Buffer;
import net.runelite.api.BufferProvider;
import net.runelite.api.ChatLineBuffer;
import net.runelite.api.ChatMessageType;
import net.runelite.api.CollisionData;
import net.runelite.api.Deque;
import net.runelite.api.EnumComposition;
import net.runelite.api.Frames;
import net.runelite.api.FriendContainer;
import net.runelite.api.FriendsChatManager;
import net.runelite.api.GameEngine;
import net.runelite.api.GameState;
import net.runelite.api.GrandExchangeOffer;
import net.runelite.api.GraphicsObject;
import net.runelite.api.HashTable;
import net.runelite.api.Ignore;
import net.runelite.api.IndexDataBase;
import net.runelite.api.IndexedSprite;
import net.runelite.api.IntegerNode;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemComposition;
import net.runelite.api.ItemContainer;
import net.runelite.api.IterableHashTable;
import net.runelite.api.Menu;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.MessageNode;
import net.runelite.api.Model;
import net.runelite.api.ModelData;
import net.runelite.api.MouseRecorder;
import net.runelite.api.NPC;
import net.runelite.api.NPCComposition;
import net.runelite.api.NameableContainer;
import net.runelite.api.NodeCache;
import net.runelite.api.ObjectComposition;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Prayer;
import net.runelite.api.Preferences;
import net.runelite.api.Projectile;
import net.runelite.api.Projection;
import net.runelite.api.Rasterizer;
import net.runelite.api.RenderOverview;
import net.runelite.api.RuneLiteObject;
import net.runelite.api.Scene;
import net.runelite.api.ScriptEvent;
import net.runelite.api.SequenceDefinition;
import net.runelite.api.Skill;
import net.runelite.api.SpritePixels;
import net.runelite.api.StructComposition;
import net.runelite.api.TextureProvider;
import net.runelite.api.Tile;
import net.runelite.api.TileFunction;
import net.runelite.api.TileObject;
import net.runelite.api.VarbitComposition;
import net.runelite.api.WidgetNode;
import net.runelite.api.World;
import net.runelite.api.WorldType;
import net.runelite.api.WorldView;
import net.runelite.api.clan.ClanChannel;
import net.runelite.api.clan.ClanSettings;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.hooks.Callbacks;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.IsaacCipher;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.packets.PacketWriter;
import net.runelite.api.packets.ServerPacket;
import net.runelite.api.vars.AccountType;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.worldmap.MapElementConfig;
import net.runelite.api.worldmap.WorldMap;
import net.unethicalite.api.KeyHandler;
import net.unethicalite.api.MouseHandler;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.events.MenuAutomated;
import org.slf4j.Logger;

public interface Client
extends OAuthApi,
GameEngine {
    public Callbacks getCallbacks();

    public DrawCallbacks getDrawCallbacks();

    public void setDrawCallbacks(DrawCallbacks var1);

    public Logger getLogger();

    public String getBuildID();

    public int getBoostedSkillLevel(Skill var1);

    public int getRealSkillLevel(Skill var1);

    public int getTotalLevel();

    public MessageNode addChatMessage(ChatMessageType var1, String var2, String var3, String var4);

    public MessageNode addChatMessage(ChatMessageType var1, String var2, String var3, String var4, boolean var5);

    public GameState getGameState();

    public int getRSGameState();

    public void setGameState(GameState var1);

    public void setGameState(int var1);

    public void stopNow();

    public boolean isWorldSelectOpen();

    public boolean isMembersWorld();

    public void setWorldSelectOpen(boolean var1);

    @Deprecated
    public String getUsername();

    public void setUsername(String var1);

    public void setPassword(String var1);

    public void setOtp(String var1);

    public int getCurrentLoginField();

    public int getLoginIndex();

    @Deprecated
    public AccountType getAccountType();

    @Override
    public Canvas getCanvas();

    public int getFPS();

    public int getCameraX();

    public double getCameraFpX();

    public int getCameraY();

    public double getCameraFpY();

    public int getCameraZ();

    public double getCameraFpZ();

    public int getCameraPitch();

    public double getCameraFpPitch();

    public int getCameraYaw();

    public double getCameraFpYaw();

    public int getWorld();

    public int getCanvasHeight();

    public int getCanvasWidth();

    public int getViewportHeight();

    public int getViewportWidth();

    public int getViewportXOffset();

    public int getViewportYOffset();

    public int getScale();

    public Point getMouseCanvasPosition();

    public int getSceneMaxPlane();

    public Player getLocalPlayer();

    public int getLocalPlayerIndex();

    @Nonnull
    public ItemComposition getItemComposition(int var1);

    @Nullable
    public NPC getFollower();

    @Nonnull
    public ItemComposition getItemDefinition(int var1);

    @Nullable
    public SpritePixels createItemSprite(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7);

    public NodeCache getItemModelCache();

    public NodeCache getItemSpriteCache();

    @Nullable
    public SpritePixels[] getSprites(IndexDataBase var1, int var2, int var3);

    public IndexDataBase getIndexSprites();

    public IndexDataBase getIndexScripts();

    public IndexDataBase getIndexConfig();

    public IndexDataBase getIndex(int var1);

    public int getMouseCurrentButton();

    public boolean isDraggingWidget();

    @Nullable
    public Widget getDraggedWidget();

    @Nullable
    public Widget getDraggedOnWidget();

    public void setDraggedOnWidget(Widget var1);

    public int getDragTime();

    public int getTopLevelInterfaceId();

    public Widget[] getWidgetRoots();

    @Nullable
    @Deprecated
    public Widget getWidget(WidgetInfo var1);

    @Nullable
    public Widget getWidget(int var1, int var2);

    @Nullable
    public Widget getWidget(int var1);

    public int[] getWidgetPositionsX();

    public int[] getWidgetPositionsY();

    public Widget createWidget();

    public int getEnergy();

    public int getWeight();

    public String[] getPlayerOptions();

    public boolean[] getPlayerOptionsPriorities();

    public int[] getPlayerMenuTypes();

    public World[] getWorldList();

    public MenuEntry createMenuEntry(int var1);

    public MenuEntry createMenuEntry(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8);

    public MenuEntry[] getMenuEntries();

    public int getMenuOptionCount();

    public void setMenuEntries(MenuEntry[] var1);

    public void setMenuOptionCount(int var1);

    public boolean isMenuOpen();

    public boolean isMenuScrollable();

    public int getMenuScroll();

    public void setMenuScroll(int var1);

    public int getMenuX();

    public int getMenuY();

    public int getMenuHeight();

    public int getMenuWidth();

    @Deprecated
    public int getMapAngle();

    public boolean isResized();

    public int getRevision();

    public int[] getVarps();

    public int[] getServerVarps();

    public Map<Integer, Object> getVarcMap();

    @Deprecated
    public int getVar(int var1);

    public int getVarbitValue(int var1);

    public int getServerVarbitValue(int var1);

    public int getVarpValue(int var1);

    public int getServerVarpValue(int var1);

    public int getVarcIntValue(int var1);

    public String getVarcStrValue(int var1);

    public void setVarcStrValue(int var1, String var2);

    public void setVarcIntValue(int var1, int var2);

    public void setVarbit(int var1, int var2);

    @Nullable
    public VarbitComposition getVarbit(int var1);

    public int getVarbitValue(int[] var1, int var2);

    public int getVarpValue(int[] var1, int var2);

    public void setVarbitValue(int[] var1, int var2, int var3);

    public void queueChangedVarp(int var1);

    public WidgetNode openInterface(int var1, int var2, int var3);

    public void closeInterface(WidgetNode var1, boolean var2);

    public HashTable<IntegerNode> getWidgetFlags();

    public HashTable<WidgetNode> getComponentTable();

    public GrandExchangeOffer[] getGrandExchangeOffers();

    public boolean isPrayerActive(Prayer var1);

    public int getSkillExperience(Skill var1);

    public long getOverallExperience();

    public void refreshChat();

    public IntPredicate getAnimationInterpolationFilter();

    public void setAnimationInterpolationFilter(IntPredicate var1);

    public Map<Integer, ChatLineBuffer> getChatLineMap();

    public IterableHashTable<MessageNode> getMessages();

    public ObjectComposition getObjectDefinition(int var1);

    public NPCComposition getNpcDefinition(int var1);

    public StructComposition getStructComposition(int var1);

    public NodeCache getStructCompositionCache();

    public Object[] getDBTableField(int var1, int var2, int var3);

    public Object getDBTableField(int var1, int var2, int var3, int var4);

    public MapElementConfig getMapElementConfig(int var1);

    public List<Integer> getDBRowsByValue(int var1, int var2, int var3, Object var4);

    public IndexedSprite[] getMapScene();

    public SpritePixels[] getMapDots();

    public int getGameCycle();

    public SpritePixels[] getMapIcons();

    public IndexedSprite[] getModIcons();

    public void setModIcons(IndexedSprite[] var1);

    public IndexedSprite createIndexedSprite();

    public SpritePixels createSpritePixels(int[] var1, int var2, int var3);

    @Nullable
    public LocalPoint getLocalDestinationLocation();

    public RuneLiteObject createRuneLiteObject();

    @Nullable
    public ModelData loadModelData(int var1);

    public ModelData mergeModels(ModelData[] var1, int var2);

    public ModelData mergeModels(ModelData ... var1);

    @Nullable
    public Model loadModel(int var1);

    @Nullable
    public Model loadModel(int var1, short[] var2, short[] var3);

    public Animation loadAnimation(int var1);

    public int getMusicVolume();

    public void setMusicVolume(int var1);

    public void playSoundEffect(int var1);

    public void playSoundEffect(int var1, int var2, int var3, int var4);

    public void playSoundEffect(int var1, int var2, int var3, int var4, int var5);

    public void playSoundEffect(int var1, int var2);

    public BufferProvider getBufferProvider();

    public int getMouseIdleTicks();

    public long getMouseLastPressedMillis();

    public void setMouseLastPressedMillis(long var1);

    public long getClientMouseLastPressedMillis();

    public void setClientMouseLastPressedMillis(long var1);

    default public int getKeyboardIdleTicks() {
        return this.getKeyHandler().getKeyboardIdleTicks();
    }

    public void changeMemoryMode(boolean var1);

    @Nullable
    public ItemContainer getItemContainer(InventoryID var1);

    @Nullable
    public ItemContainer getItemContainer(int var1);

    public HashTable<ItemContainer> getItemContainers();

    public int getIntStackSize();

    public void setIntStackSize(int var1);

    public int[] getIntStack();

    public int getStringStackSize();

    public void setStringStackSize(int var1);

    public Object[] getObjectStack();

    public int getArraySizes(int var1);

    public int[] getArray(int var1);

    public Widget getScriptActiveWidget();

    public Widget getScriptDotWidget();

    public boolean isFriended(String var1, boolean var2);

    @Nullable
    public FriendsChatManager getFriendsChatManager();

    public FriendContainer getFriendContainer();

    public NameableContainer<Ignore> getIgnoreContainer();

    public Preferences getPreferences();

    public int getCameraYawTarget();

    public int getCameraPitchTarget();

    public void setCameraYawTarget(int var1);

    public void setCameraPitchTarget(int var1);

    public void setCameraSpeed(float var1);

    public void setCameraMouseButtonMask(int var1);

    public void setCameraPitchRelaxerEnabled(boolean var1);

    public void setInvertYaw(boolean var1);

    public void setInvertPitch(boolean var1);

    @Deprecated
    public RenderOverview getRenderOverview();

    public WorldMap getWorldMap();

    public boolean isStretchedEnabled();

    public void setStretchedEnabled(boolean var1);

    public boolean isStretchedFast();

    public void setStretchedFast(boolean var1);

    public void setStretchedIntegerScaling(boolean var1);

    public void setStretchedKeepAspectRatio(boolean var1);

    public void setScalingFactor(int var1);

    public double getScalingFactor();

    public void invalidateStretching(boolean var1);

    public Dimension getStretchedDimensions();

    public Dimension getRealDimensions();

    public void changeWorld(World var1);

    public World createWorld();

    public SpritePixels drawInstanceMap(int var1);

    public void setMinimapReceivesClicks(boolean var1);

    public void runScript(Object ... var1);

    public void runScriptEvent(ScriptEvent var1);

    public ScriptEvent createScriptEvent(Object ... var1);

    public boolean hasHintArrow();

    public int getHintArrowType();

    public void clearHintArrow();

    public void setHintArrow(WorldPoint var1);

    public void setHintArrow(LocalPoint var1);

    public void setHintArrow(Player var1);

    public void setHintArrow(NPC var1);

    public WorldPoint getHintArrowPoint();

    public Player getHintArrowPlayer();

    public NPC getHintArrowNpc();

    public boolean isInterpolatePlayerAnimations();

    public void setInterpolatePlayerAnimations(boolean var1);

    public boolean isInterpolateNpcAnimations();

    public void setInterpolateNpcAnimations(boolean var1);

    public boolean isInterpolateObjectAnimations();

    public void setInterpolateObjectAnimations(boolean var1);

    public boolean isInterpolateWidgetAnimations();

    public void setInterpolateWidgetAnimations(boolean var1);

    public int addClientScript(byte[] var1);

    public int[] getBoostedSkillLevels();

    public int[] getRealSkillLevels();

    public int[] getSkillExperiences();

    public void queueChangedSkill(Skill var1);

    public Map<Integer, SpritePixels> getSpriteOverrides();

    public Map<Integer, SpritePixels> getWidgetSpriteOverrides();

    public void setCompass(SpritePixels var1);

    public NodeCache getWidgetSpriteCache();

    public int getTickCount();

    public void setTickCount(int var1);

    @Deprecated
    public void setInventoryDragDelay(int var1);

    public boolean isHdMinimapEnabled();

    public void setHdMinimapEnabled(boolean var1);

    public EnumSet<WorldType> getWorldType();

    public int getCameraMode();

    public void setCameraMode(int var1);

    public double getCameraFocalPointX();

    public void setCameraFocalPointX(double var1);

    public double getCameraFocalPointY();

    public void setCameraFocalPointY(double var1);

    public double getCameraFocalPointZ();

    public void setCameraFocalPointZ(double var1);

    public void setFreeCameraSpeed(int var1);

    @Deprecated
    public int getOculusOrbState();

    @Deprecated
    public void setOculusOrbState(int var1);

    @Deprecated
    public void setOculusOrbNormalSpeed(int var1);

    @Deprecated
    public int getOculusOrbFocalPointX();

    @Deprecated
    public int getOculusOrbFocalPointY();

    public void setOculusOrbFocalPointX(int var1);

    public void setOculusOrbFocalPointY(int var1);

    public void openWorldHopper();

    public void hopToWorld(World var1);

    public void setSkyboxColor(int var1);

    public int getSkyboxColor();

    public boolean isGpu();

    public void setGpuFlags(int var1);

    public int getGpuFlags();

    public int get3dZoom();

    public int getCenterX();

    public int getCenterY();

    public TextureProvider getTextureProvider();

    public NodeCache getCachedModels2();

    public int getRasterizer3D_clipMidX2();

    public int getRasterizer3D_clipNegativeMidX();

    public int getRasterizer3D_clipNegativeMidY();

    public int getRasterizer3D_clipMidY2();

    public void checkClickbox(Model var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10);

    public void checkClickbox(Projection var1, Model var2, int var3, int var4, int var5, int var6, long var7);

    public boolean isWidgetSelected();

    public void setSpellSelected(boolean var1);

    default public void setWidgetSelected(boolean selected) {
        this.setSpellSelected(selected);
    }

    @Deprecated
    public int getSelectedItem();

    @Deprecated
    public int getSelectedItemIndex();

    @Nullable
    public Widget getSelectedWidget();

    public NodeCache getItemCompositionCache();

    public NodeCache getObjectCompositionCache();

    public NodeCache getAnimationCache();

    public SpritePixels[] getCrossSprites();

    public EnumComposition getEnum(int var1);

    public void draw2010Menu(int var1);

    public int[] getGraphicsPixels();

    public void drawOriginalMenu(int var1);

    public void resetHealthBarCaches();

    public boolean getRenderSelf();

    public void setRenderSelf(boolean var1);

    default public void invokeMenuAction(String option, String target, int identifier, int opcode, int param0, int param1) {
        this.invokeMenuAction(option, target, identifier, opcode, param0, param1, -1, -1);
    }

    public void invokeMenuAction(String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8);

    public void invokeMenuAction(String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

    public MouseRecorder getMouseRecorder();

    public void setPrintMenuActions(boolean var1);

    public String getSelectedSpellName();

    public void setSelectedSpellName(String var1);

    public boolean getSpellSelected();

    public String getSelectedSpellActionName();

    public int getSelectedSpellFlags();

    public void setSelectedSpellFlags(int var1);

    public int getSelectedSpellItemId();

    public void setSelectedSpellItemId(int var1);

    public void setHideFriendAttackOptions(boolean var1);

    public void setHideFriendCastOptions(boolean var1);

    public void setHideClanmateAttackOptions(boolean var1);

    public void setHideClanmateCastOptions(boolean var1);

    public void setUnhiddenCasts(Set<String> var1);

    public void addFriend(String var1);

    public void removeFriend(String var1);

    public void addIgnore(String var1);

    public void removeIgnore(String var1, boolean var2);

    public void setModulus(BigInteger var1);

    public BigInteger getModulus();

    public int getItemCount();

    public void setAllWidgetsAreOpTargetable(boolean var1);

    public int insertMenuItem(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9);

    public int getSelectedSpellWidget();

    public int getSelectedSpellChildIndex();

    public void setSelectedSpellWidget(int var1);

    public void setSelectedSpellChildIndex(int var1);

    public void scaleSprite(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12);

    public void setHideDisconnect(boolean var1);

    public void setTempMenuEntry(MenuEntry var1);

    public void setShowMouseCross(boolean var1);

    public void setMouseIdleTicks(int var1);

    public void setKeyboardIdleTicks(int var1);

    public void setGeSearchResultCount(int var1);

    public void setGeSearchResultIds(short[] var1);

    public void setGeSearchResultIndex(int var1);

    public void setComplianceValue(@Nonnull String var1, boolean var2);

    public boolean getComplianceValue(@Nonnull String var1);

    public boolean isMirrored();

    public void setMirrored(boolean var1);

    public boolean isComparingAppearance();

    public void setComparingAppearance(boolean var1);

    public void setLoginScreen(SpritePixels var1);

    public void setLoginScreenBackground(SpritePixels var1);

    public void setLoginScreenLeftTitleSprite();

    public void setLoginScreenRightTitleSprite();

    public void setShouldRenderLoginScreenFire(boolean var1);

    public boolean shouldRenderLoginScreenFire();

    public boolean isKeyPressed(int var1);

    public int getFollowerIndex();

    public int isItemSelected();

    public String getSelectedItemName();

    public Widget getMessageContinueWidget();

    public void setOutdatedScript(String var1);

    public List<String> getOutdatedScripts();

    public Frames getFrames(int var1);

    public SequenceDefinition getSequenceDefinition(int var1);

    public IndexDataBase getSequenceDefinition_skeletonsArchive();

    public IndexDataBase getSequenceDefinition_archive();

    public IndexDataBase getSequenceDefinition_animationsArchive();

    public IndexDataBase getNpcDefinition_archive();

    public IndexDataBase getObjectDefinition_modelsArchive();

    public IndexDataBase getObjectDefinition_archive();

    public IndexDataBase getItemDefinition_archive();

    public IndexDataBase getKitDefinition_archive();

    public IndexDataBase getKitDefinition_modelsArchive();

    public IndexDataBase getSpotAnimationDefinition_archive();

    public IndexDataBase getSpotAnimationDefinition_modelArchive();

    public Buffer createBuffer(byte[] var1);

    public long[] getCrossWorldMessageIds();

    public int getCrossWorldMessageIdsIndex();

    @Nullable
    public ClanChannel getClanChannel();

    @Nullable
    public ClanChannel getGuestClanChannel();

    @Nullable
    public ClanSettings getClanSettings();

    @Nullable
    public ClanSettings getGuestClanSettings();

    @Nullable
    public ClanChannel getClanChannel(int var1);

    @Nullable
    public ClanSettings getClanSettings(int var1);

    public void setUnlockedFps(boolean var1);

    public void setUnlockedFpsTarget(int var1);

    public Deque<AmbientSoundEffect> getAmbientSoundEffects();

    public boolean getCameraPitchRelaxerEnabled();

    public void posToCameraAngle(int var1, int var2);

    default public void interact(int identifier, int opcode, int param0, int param1) {
        this.interact(identifier, opcode, param0, param1, -1, -1);
    }

    default public void interact(int identifier, int opcode, int param0, int param1, int clickX, int clickY) {
        this.interact(identifier, opcode, param0, param1, clickX, clickY, null);
    }

    default public void interact(int identifier, int opcode, int param0, int param1, int clickX, int clickY, SceneEntity sceneEntity) {
        this.interact(MenuAutomated.builder().identifier(identifier).opcode(MenuAction.of(opcode)).param0(param0).param1(param1).clickX(clickX).clickY(clickY).entity(sceneEntity).build());
    }

    public void interact(MenuAutomated var1);

    public int getMouseLastPressedX();

    public void setMouseLastPressedX(int var1);

    public int getMouseLastPressedY();

    public void setMouseLastPressedY(int var1);

    public String getLoginMessage();

    public PacketWriter getPacketWriter();

    public PacketBufferNode preparePacket(ClientPacket var1, IsaacCipher var2);

    public PacketBufferNode preparePacket(ClientPacket var1);

    public int getMouseWheelRotation();

    default public void setSelectedSceneTileX(int sceneX) {
        this.getTopLevelWorldView().getScene().setSelectedSceneTileX(sceneX);
    }

    default public void setSelectedSceneTileY(int sceneY) {
        this.getTopLevelWorldView().getScene().setSelectedSceneTileY(sceneY);
    }

    default public void setViewportWalking(boolean enabled) {
        this.getTopLevelWorldView().getScene().setViewportWalking(enabled);
    }

    public void setCheckClick(boolean var1);

    public boolean isTileObjectValid(Tile var1, TileObject var2);

    public boolean isItemDefinitionCached(int var1);

    public boolean loadWorlds();

    public Widget[][] getWidgets();

    public boolean isLowCpu();

    public void setLowCpu(boolean var1);

    public void uncacheItem(int var1);

    public void cacheItem(int var1, ItemComposition var2);

    public void clearItemCache();

    public void processDialog(int var1, int var2);

    public void setDestinationX(int var1);

    public void setDestinationY(int var1);

    public int getDestinationX();

    public int getDestinationY();

    public void setWindowedMode(int var1);

    public int getWindowedMode();

    public MouseHandler getMouseHandler();

    public KeyHandler getKeyHandler();

    public boolean isFocused();

    public void setFocused(boolean var1);

    public void setClickCrossX(int var1);

    public void setClickCrossY(int var1);

    public void setLoginIndex(int var1);

    public ClientPacket createClientPacket(int var1, int var2);

    public ServerPacket createServerPacket(int var1, int var2);

    public String getPassword();

    public long[] getEntitiesAtMouse();

    public int getEntitiesAtMouseCount();

    public void setEntitiesAtMouseCount(int var1);

    public void setExpandedMapLoading(int var1);

    public int getExpandedMapLoading();

    public long calculateTag(int var1, int var2, int var3, boolean var4, int var5);

    public String[] getMenuOptions();

    @Nonnull
    public Menu getMenu();

    public void setMenuOpen(boolean var1);

    public void setPendingAutomation(MenuAutomated var1);

    public void setQueuedMenu(MenuAutomated var1);

    public MenuAutomated getQueuedMenu();

    public VarbitComposition getVarbitComposition(int var1);

    public void setDraggedWidget(Widget var1);

    public void invokeWidgetAction(int var1, int var2, int var3, int var4, String var5);

    public void promptCredentials(boolean var1);

    public void setStaffModLevel(int var1);

    public int getStaffModLevel();

    public void setShowMouseOverText(boolean var1);

    public MenuEntry createMenuEntry(String var1, String var2, int var3, int var4, int var5, int var6, boolean var7);

    public void insertMenuItem(String var1, String var2, int var3, int var4, int var5, int var6, boolean var7, int var8);

    public void setIdleTimeout(int var1);

    public int getIdleTimeout();

    public boolean isMinimapZoom();

    public void setMinimapZoom(boolean var1);

    public double getMinimapZoom();

    public void setMinimapZoom(double var1);

    public void setMinimapTileDrawer(TileFunction var1);

    public Rasterizer getRasterizer();

    public void setDiscordId(String var1);

    public void setDiscordUsername(String var1);

    public String getDiscordUsername();

    public String getDiscordId();

    public void setWorldList(World[] var1);

    public void forcedLogoutWildy();

    public long getTimeOfPreviousKeyPress();

    public void setTimeOfPreviousKeyPress(long var1);

    public int getMappedKeyCode(int var1);

    public String getJagexDisplayName();

    public String getJagexCharacterId();

    public WorldView getWorldView(int var1);

    public WorldView getTopLevelWorldView();

    public boolean isCameraShakeDisabled();

    public void setCameraShakeDisabled(boolean var1);

    @Deprecated
    default public int[][][] getInstanceTemplateChunks() {
        return this.getTopLevelWorldView().getScene().getInstanceTemplateChunks();
    }

    @Deprecated
    public int[][] getXteaKeys();

    @Deprecated
    public boolean isInInstancedRegion();

    @Deprecated
    public int[] getMapRegions();

    @Deprecated
    default public Scene getScene() {
        WorldView wv = this.getTopLevelWorldView();
        return wv == null ? null : wv.getScene();
    }

    @Deprecated
    default public List<Player> getPlayers() {
        WorldView topLevelWorldView = this.getTopLevelWorldView();
        return topLevelWorldView == null ? Collections.emptyList() : (List)topLevelWorldView.players().stream().collect(Collectors.toCollection(ArrayList::new));
    }

    @Deprecated
    default public List<NPC> getNpcs() {
        WorldView topLevelWorldView = this.getTopLevelWorldView();
        return topLevelWorldView == null ? Collections.emptyList() : (List)topLevelWorldView.npcs().stream().collect(Collectors.toCollection(ArrayList::new));
    }

    @Nullable
    @Deprecated
    default public CollisionData[] getCollisionMaps() {
        return this.getTopLevelWorldView().getCollisionMaps();
    }

    @Deprecated
    default public int getPlane() {
        return this.getTopLevelWorldView().getPlane();
    }

    @Deprecated
    default public int[][][] getTileHeights() {
        return this.getTopLevelWorldView().getTileHeights();
    }

    @Deprecated
    default public byte[][][] getTileSettings() {
        return this.getTopLevelWorldView().getTileSettings();
    }

    @Deprecated
    default public int getBaseX() {
        WorldView wv = this.getTopLevelWorldView();
        return wv == null ? 0 : wv.getBaseX();
    }

    @Deprecated
    default public int getBaseY() {
        WorldView wv = this.getTopLevelWorldView();
        return wv == null ? 0 : wv.getBaseY();
    }

    public Projectile createProjectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, @Nullable Actor var11, int var12, int var13);

    public Deque<Projectile> getProjectiles();

    @Deprecated
    default public Deque<GraphicsObject> getGraphicsObjects() {
        return this.getTopLevelWorldView().getGraphicsObjects();
    }

    @Deprecated
    @Nullable
    default public Tile getSelectedSceneTile() {
        return this.getTopLevelWorldView().getSelectedSceneTile();
    }

    public String getLauncherDisplayName();

    public void menuAction(int var1, int var2, MenuAction var3, int var4, int var5, String var6, String var7);
}

