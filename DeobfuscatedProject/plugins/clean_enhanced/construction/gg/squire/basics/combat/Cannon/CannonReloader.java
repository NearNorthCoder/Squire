/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.callback.ClientThread
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.combat.Cannon;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.combat.Cannon.ReloadingCannonTask;
import gg.squire.basics.combat.Cannon.RepairingCannonTask;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.MenuAction;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Cannon Reloader", description="Reloads cannon when it runs out of ammo", enabledByDefault=false)
public class CannonReloader
extends SquirePlugin {
    private  boolean bK;
    private  GameObject bN;
    private  WorldPoint bH;
    private  List<WorldPoint> bO;
    @Inject
    private  Client v;
    private static  int[] lIIlIllII;
    private static  String[] lIIlIIIll;
    private  boolean bG;
    private  int bM;
    private  int bJ;
    private  WorldArea bL;
    @Inject
    private  ClientThread bB;
    private  boolean bI;

    private static boolean var1(int n2, int n3) {
        return n2 < n3;
    }

    private static void var2() {
        lIIlIllII = new int[14];
        CannonReloader.lIIlIllII[0] = -1;
        CannonReloader.lIIlIllII[1] = 1;
        CannonReloader.lIIlIllII[2] = 3;
        CannonReloader.lIIlIllII[3] = 2;
        CannonReloader.lIIlIllII[4] = (84 + 23 - 17 + 45 ^ 101 + 79 - 130 + 116) & (0x4B ^ 0x74 ^ (0x36 ^ 0x28) ^ -1);
        CannonReloader.lIIlIllII[5] = 0x5D ^ 0x5A;
        CannonReloader.lIIlIllII[6] = 0xFFFFED1F & 0xBAF5;
        CannonReloader.lIIlIllII[7] = 0xFFFFAFFB & 0x533F;
        CannonReloader.lIIlIllII[8] = 0xE4 ^ 0x9E ^ (0x39 ^ 0x45);
        CannonReloader.lIIlIllII[9] = -(0xFFFF9FFD & 0x6567) & (0xFFFFADFF & 0xFF77);
        CannonReloader.lIIlIllII[10] = 0xFFFFD6E6 & 0x7DF9;
        CannonReloader.lIIlIllII[11] = 0x3B ^ 0x33 ^ (0x50 ^ 0x5C);
        CannonReloader.lIIlIllII[12] = 0x6E ^ 0x6B;
        CannonReloader.lIIlIllII[13] = 117 + 66 - 31 + 10 ^ 119 + 123 - 189 + 117;
    }

    public GameObject aD() {
        return this.bN;
    }

    static {
        CannonReloader.var2();
        CannonReloader.var3();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var4;
        if (CannonReloader.var5(chatMessage.getType(), ChatMessageType.SPAM) && CannonReloader.var5(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (CannonReloader.var6(var4.getMessage().equals(lIIlIIIll[lIIlIllII[4]]) ? 1 : 0)) {
            var7.bK = lIIlIllII[1];
            var7.bI = lIIlIllII[1];
            0;
            if (2 <= 1) {
                return;
            }
        } else if (!CannonReloader.var8(var4.getMessage().contains(lIIlIIIll[lIIlIllII[1]]) ? 1 : 0) || !CannonReloader.var8(var4.getMessage().contains(lIIlIIIll[lIIlIllII[3]]) ? 1 : 0) || CannonReloader.var6(var4.getMessage().contains(lIIlIIIll[lIIlIllII[2]]) ? 1 : 0)) {
            var7.bK = lIIlIllII[4];
            var7.bL = null;
            0;
            if (3 <= -1) {
                return;
            }
        } else if (CannonReloader.var6(var4.getMessage().startsWith(lIIlIIIll[lIIlIllII[11]]) ? 1 : 0)) {
            CannonReloader var7;
            if (CannonReloader.var9(var7.bL) && CannonReloader.var10(var7.bH)) {
                if (CannonReloader.var6(var7.bI)) {
                    var7.bI = lIIlIllII[4];
                    0;
                    if null != null {
                        return;
                    }
                } else {
                    GameObject[] var11;
                    LocalPoint var12 = LocalPoint.fromWorld((Client)var7.v, (WorldPoint)var7.bH);
                    if (CannonReloader.var10(var12) && CannonReloader.var13((var11 = var7.v.getScene().getTiles()[var7.v.getPlane()][var12.getSceneX()][var12.getSceneY()].getGameObjects()).length) && CannonReloader.var14(var7.v.getLocalPlayer().getWorldLocation().distanceTo(var11[lIIlIllII[4]].getWorldLocation()), lIIlIllII[3])) {
                        var7.bK = lIIlIllII[1];
                        var7.bM = var7.v.getWorld();
                        var7.bN = var11[lIIlIllII[4]];
                        var7.bL = CannonReloader.f(var7.bN.getWorldLocation());
                    }
                }
                var7.bH = null;
            }
            var7.bG = lIIlIllII[4];
            0;
            if null != null {
                return;
            }
        } else if (!CannonReloader.var8(var4.getMessage().equals(lIIlIIIll[lIIlIllII[12]]) ? 1 : 0) || CannonReloader.var6(var4.getMessage().equals(lIIlIIIll[lIIlIllII[8]]) ? 1 : 0)) {
            var7.bH = null;
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIlIllII[3]];
        classArray[CannonReloader.lIIlIllII[4]] = ReloadingCannonTask.class;
        classArray[CannonReloader.lIIlIllII[1]] = RepairingCannonTask.class;
        return classArray;
    }

    private static boolean var13(int n2) {
        return n2 > 0;
    }

    protected void onStart() {
        this.bB.invoke(() -> {
            this.bJ = this.v.getVarpValue(lIIlIllII[2]);
        });
    }

    public boolean aA() {
        return this.bK;
    }

    public WorldArea aB() {
        return this.bL;
    }

    private static boolean var15(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = lIIlIllII[4];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = lIIlIllII[4];
        while (CannonReloader.var1(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if ((0x3D ^ 0x39) >= -1) continue;
            return null;
        }
        return String.valueOf(var19);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    public CannonReloader() {
        this.bM = lIIlIllII[0];
        this.bO = new ArrayList<WorldPoint>();
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static WorldArea f(WorldPoint worldPoint) {
        return new WorldArea(worldPoint.getX() - lIIlIllII[1], worldPoint.getY() - lIIlIllII[1], lIIlIllII[2], lIIlIllII[2], worldPoint.getPlane());
    }

    private static boolean var5(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var32;
        void var33;
        CannonReloader var34;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        Player player = this.v.getLocalPlayer();
        if ((!CannonReloader.var35(gameObject.getId(), lIIlIllII[5]) || CannonReloader.var36(gameObject.getId(), lIIlIllII[6])) && CannonReloader.var8(var34.bK) && CannonReloader.var14(var33.getWorldLocation().distanceTo(var32.getWorldLocation()), lIIlIllII[3]) && CannonReloader.var36(var33.getAnimation(), lIIlIllII[7])) {
            var34.bL = CannonReloader.f(var32.getWorldLocation());
            var34.bM = var34.v.getWorld();
            var34.bN = var32;
        }
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }

    public int aC() {
        return this.bM;
    }

    public int az() {
        return this.bJ;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        CannonReloader var37;
        void var38;
        if (!CannonReloader.var9(this.bL) || CannonReloader.var35(menuOptionClicked.getId(), lIIlIllII[8]) && CannonReloader.var35(menuOptionClicked.getId(), lIIlIllII[9])) {
            return;
        }
        if (CannonReloader.var15(var38.getMenuAction(), MenuAction.WIDGET_TARGET_ON_GAME_OBJECT) && CannonReloader.var36(var37.v.getSelectedWidget().getId(), WidgetInfo.INVENTORY.getId())) {
            Widget var39 = var37.v.getSelectedWidget();
            int var40 = var39.getItemId();
            if (CannonReloader.var35(var40, lIIlIllII[3]) && CannonReloader.var35(var40, lIIlIllII[10])) {
                return;
            }
            0;
            if (((59 + 78 - 78 + 171 ^ 118 + 30 - 35 + 79) & (0x91 ^ 0xC1 ^ (0x78 ^ 0xE) ^ -1)) != 0) {
                return;
            }
        } else if (CannonReloader.var5(var38.getMenuAction(), MenuAction.GAME_OBJECT_FIRST_OPTION)) {
            return;
        }
        this.bH = WorldPoint.fromScene((Client)this.v, (int)menuOptionClicked.getParam0(), (int)menuOptionClicked.getParam1(), (int)this.v.getPlane());
    }

        catch (Exception var46) {
            var46.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2, int n3) {
        return n2 <= n3;
    }

    protected void onStop() {
        this.bK = lIIlIllII[4];
        this.bM = lIIlIllII[0];
        this.bL = null;
        this.bJ = lIIlIllII[4];
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    @Subscribe
    public void c(VarbitChanged varbitChanged) {
        if (CannonReloader.var36(varbitChanged.getVarpId(), lIIlIllII[2])) {
            this.bJ = varbitChanged.getValue();
        }
    }

    private static boolean var35(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var36(int n2, int n3) {
        return n2 == n3;
    }

    public List<WorldPoint> aE() {
        return this.bO;
    }

    private static void var3() {
        lIIlIIIll = new String[lIIlIllII[5]];
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[4]] = "You add the furnace.";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[1]] = "You pick up the cannon";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[3]] = "Your cannon has decayed. Speak to Nulodion to get a new one!";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[2]] = "Your cannon has been destroyed!";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[11]] = "You load the cannon with";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[12]] = "This isn't your cannon!";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[8]] = "This is not your cannon.";
    }
}

