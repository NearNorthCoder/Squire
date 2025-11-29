/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.input.KeyListener
 *  net.runelite.client.input.KeyManager
 *  net.runelite.client.plugins.Plugin
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.PluginManager
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.questing;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.questing.SquireQuestHelperConfig;
import gg.squire.basics.questing.overlay.QuestInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.basics.questing.AttackingNpcTask;
import gg.squire.basics.questing.BankingForItemsTask;
import gg.squire.basics.questing.PerformingDetailedStepTask;
import gg.squire.basics.questing.PerformingDigTask;
import gg.squire.basics.questing.EquippingItemsTask;
import gg.squire.basics.questing.InteractingWithObjectTask;
import gg.squire.basics.questing.PickingUpAnItemTask;
import gg.squire.basics.questing.PressingContinueTask;
import gg.squire.basics.questing.PressingDialogOptionTask;
import gg.squire.basics.questing.RotatingMirrorTask;
import gg.squire.basics.questing.TalkingToNpcTask;
import gg.squire.basics.questing.UsingItemOnItemTask;
import gg.squire.basics.questing.WidgetStepTask;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.PluginManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;

@PluginDescriptor(name="Squire Quest QOL", enabledByDefault=false)
@SquireUtil
public class SquireQuestHelper
extends SquirePlugin {
    @Inject
    public  SquireQuestHelperConfig fA;
    @Inject
    private  OverlayManager bq;
    @Inject
    private  PluginManager fC;
    private final  KeyListener fB;
    @Inject
    private  KeyManager bY;
    public  boolean fu;
    @Inject
    private  QuestInfoBox fD;
    @Inject
    private  EventBus K;
    private static  int[] llIIlIIl;
    private static  String[] llIIIllI;

    private static void var1() {
        llIIlIIl = new int[39];
        SquireQuestHelper.llIIlIIl[0] = 1;
        SquireQuestHelper.llIIlIIl[1] = (0x1E ^ 0x33) & ~(0xA ^ 0x27);
        SquireQuestHelper.llIIlIIl[2] = 0x8D ^ 0x80;
        SquireQuestHelper.llIIlIIl[3] = 2;
        SquireQuestHelper.llIIlIIl[4] = 3;
        SquireQuestHelper.llIIlIIl[5] = 0xB8 ^ 0xBC;
        SquireQuestHelper.llIIlIIl[6] = 42 + 9 - -81 + 24 ^ 26 + 97 - 1 + 31;
        SquireQuestHelper.llIIlIIl[7] = 0xF4 ^ 0x87 ^ (0xD9 ^ 0xAC);
        SquireQuestHelper.llIIlIIl[8] = 105 + 14 - 114 + 129 ^ 124 + 91 - 206 + 120;
        SquireQuestHelper.llIIlIIl[9] = 91 + 47 - -5 + 10 ^ 17 + 38 - -16 + 74;
        SquireQuestHelper.llIIlIIl[10] = 40 + 6 - 10 + 132 ^ 23 + 52 - -49 + 37;
        SquireQuestHelper.llIIlIIl[11] = 0xAE ^ 0xB8 ^ (0x3F ^ 0x23);
        SquireQuestHelper.llIIlIIl[12] = 0x59 ^ 0x28 ^ (0x7A ^ 0);
        SquireQuestHelper.llIIlIIl[13] = 0x79 ^ 0x75;
        SquireQuestHelper.llIIlIIl[14] = 0x40 ^ 0x4E;
        SquireQuestHelper.llIIlIIl[15] = 0x3C ^ 0x33;
        SquireQuestHelper.llIIlIIl[16] = 128 + 66 - 84 + 44 ^ 65 + 38 - -29 + 6;
        SquireQuestHelper.llIIlIIl[17] = 0x18 ^ 9;
        SquireQuestHelper.llIIlIIl[18] = 6 ^ 0x14;
        SquireQuestHelper.llIIlIIl[19] = 0x82 ^ 0x91;
        SquireQuestHelper.llIIlIIl[20] = 0x13 ^ 0x6F ^ (0x7D ^ 0x15);
        SquireQuestHelper.llIIlIIl[21] = 0x58 ^ 0x4D;
        SquireQuestHelper.llIIlIIl[22] = -1;
        SquireQuestHelper.llIIlIIl[23] = 17 + 47 - -28 + 45 ^ 140 + 144 - 267 + 142;
        SquireQuestHelper.llIIlIIl[24] = 0xB7 ^ 0x88 ^ (0xB3 ^ 0x9B);
        SquireQuestHelper.llIIlIIl[25] = 0x49 ^ 0x1B ^ (3 ^ 0x49);
        SquireQuestHelper.llIIlIIl[26] = 0x71 ^ 0x6E ^ (0x62 ^ 0x64);
        SquireQuestHelper.llIIlIIl[27] = 0x24 ^ 0x3E;
        SquireQuestHelper.llIIlIIl[28] = 0xD ^ 0x21 ^ (0x60 ^ 0x57);
        SquireQuestHelper.llIIlIIl[29] = 3 ^ (0xB5 ^ 0xAA);
        SquireQuestHelper.llIIlIIl[30] = 3 ^ (0xD8 ^ 0xC6);
        SquireQuestHelper.llIIlIIl[31] = 0x6C ^ 0x24 ^ (0x95 ^ 0xC3);
        SquireQuestHelper.llIIlIIl[32] = 0x67 ^ 0x78;
        SquireQuestHelper.llIIlIIl[33] = 48 + 67 - -9 + 60 ^ 120 + 61 - 57 + 28;
        SquireQuestHelper.llIIlIIl[34] = 0xA3 ^ 0x82;
        SquireQuestHelper.llIIlIIl[35] = 5 + 127 - 72 + 86 ^ 18 + 15 - -27 + 116;
        SquireQuestHelper.llIIlIIl[36] = 0x34 ^ 0x50;
        SquireQuestHelper.llIIlIIl[37] = 0x6F ^ 0x4C;
        SquireQuestHelper.llIIlIIl[38] = 0x43 ^ 0x75 ^ (0x4C ^ 0x5E);
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)llIIlIIl[1]);
        this.bq.remove((Overlay)this.fD);
        0;
        this.K.unregister((Object)this.fD);
        this.bY.unregisterKeyListener(this.fB);
        this.fu = llIIlIIl[1];
    }

    public List<Integer> cF() {
        return this.cG().stream().filter(var2 -> {
            try {
                Field var3 = var2.getClass().getDeclaredField(llIIIllI[llIIlIIl[34]]);
                var3.setAccessible(llIIlIIl[0]);
                return (Boolean)var3.get(var2);
            }
            catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
                return llIIlIIl[1];
            }
        }).flatMap(SquireQuestHelper::b).collect(Collectors.toList());
    }

    private static boolean var4(Object object) {
        return object != null;
    }

    static {
        SquireQuestHelper.var1();
        SquireQuestHelper.var5();
    }

    public NPC cK() {
        Object var6 = this.cy();
        try {
            Field var7 = var6.getClass().getDeclaredField(llIIIllI[llIIlIIl[25]]);
            var7.setAccessible(llIIlIIl[0]);
            int var8 = var7.getInt(var6);
            Field var9 = var6.getClass().getDeclaredField(llIIIllI[llIIlIIl[26]]);
            var9.setAccessible(llIIlIIl[0]);
            List var10 = (List)var9.get(var6);
            if (SquireQuestHelper.var11(var10.isEmpty() ? 1 : 0)) {
                return NPCs.getNearest(nPC -> {
                    boolean bl2;
                    if (!SquireQuestHelper.var12(nPC.getId(), var8) || SquireQuestHelper.var13(nPC.getTransformedId(), var8)) {
                        bl2 = llIIlIIl[0];
                        0;
                        if (-1 > 2) {
                            return ((0x24 ^ 3) & ~(0x41 ^ 0x66)) != 0;
                        }
                    } else {
                        bl2 = llIIlIIl[1];
                    }
                    return bl2;
                });
            }
            return NPCs.getNearest(nPC -> {
                int n3;
                if (!SquireQuestHelper.var12(nPC.getId(), var8) || !SquireQuestHelper.var14(var10.contains(nPC.getId()) ? 1 : 0) || SquireQuestHelper.var13(nPC.getTransformedId(), var8)) {
                    n3 = llIIlIIl[0];
                    0;
                    if (3 == 2) {
                        return ((0x30 ^ 0x16) & ~(0x74 ^ 0x52)) != 0;
                    }
                } else {
                    n3 = llIIlIIl[1];
                }
                return n3 != 0;
            });
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }

    private static boolean var15(Object object) {
        return object == null;
    }

    private static  boolean a(String string, String string2) {
        return string2.toLowerCase().contains(string.toLowerCase());
    }

    private static boolean var13(int n2, int n3) {
        return n2 == n3;
    }

    public int cJ() {
        return this.A(llIIlIIl[1]);
    }

    @Provides
    SquireQuestHelperConfig t(ConfigManager configManager) {
        return (SquireQuestHelperConfig)configManager.getConfig(SquireQuestHelperConfig.class);
    }

    private static void var5() {
        llIIIllI = new String[llIIlIIl[38]];
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[1]] = "getAllIds";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[0]] = "teleport to";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[3]] = "Quest helper needs to be enabled for this plugin to work";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[4]] = "selectedQuest";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[5]] = "None";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[6]] = "objectID";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[7]] = "getSelectedQuest";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[8]] = "getCurrentStep";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[9]] = "LightPuzzle";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[10]] = "getActiveStep";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[11]] = "ConditionalStep";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[12]] = "getActiveStep";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[13]] = SquireQuestHelper.var16("pv1hosjybRA=", "Exvat");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[2]] = SquireQuestHelper.var17("oAC2u1wVfFw=", "bdxTb");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[14]] = "worldPoint";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[15]] = "Walking to object (using web)";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[16]] = "Couldn't path with web, trying to open doors!!";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[17]] = "Open";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[18]] = "Opening door";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[19]] = "worldMapPoint";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[20]] = "text";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[21]] = "getRequirements";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[23]] = "ItemRequirement";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[24]] = "getId";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[25]] = "npcID";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[26]] = "alternateNpcIDs";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[27]] = "shouldHighlightInInventory";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[28]] = "check";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[29]] = "ItemRequirement";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[30]] = "ItemRequirements";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[31]] = "ItemRequirements";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[32]] = "itemRequirements";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[33]] = "ItemRequirement";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[34]] = "equip";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[35]] = "Open";
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[37]] = "QuestHelperPlugin";
    }

    private static boolean var18(int n2, int n3) {
        return n2 <= n3;
    }

    private static Stream<Integer> b(Object var19) {
        try {
            Method var20 = var19.getClass().getMethod(llIIIllI[llIIlIIl[1]], new Class[llIIlIIl[1]]);
            var20.setAccessible(llIIlIIl[0]);
            return ((List)var20.invoke(var19, new Object[llIIlIIl[1]])).stream();
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return Stream.empty();
        }
    }

    public List<Object> cE() {
        try {
            SquireQuestHelper var21;
            Object var22 = var21.cy();
            Method var23 = var22.getClass().getMethod(llIIIllI[llIIlIIl[21]], new Class[llIIlIIl[1]]);
            var23.setAccessible(llIIlIIl[0]);
            return (List)var23.invoke(var22, new Object[llIIlIIl[1]]);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return List.of();
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(String ... stringArray) {
        void var24;
        String[] stringArray2 = stringArray;
        int n2 = stringArray2.length;
        int var25 = llIIlIIl[1];
        while (SquireQuestHelper.var26(var25, (int)var24)) {
            SquireQuestHelper var27;
            void var28;
            void var29 = var28[var25];
            if (SquireQuestHelper.var11(var27.cD().stream().anyMatch(arg_0 -> SquireQuestHelper.a((String)var29, arg_0)) ? 1 : 0)) {
                return llIIlIIl[0];
            }
            ++var25;
            0;
            
            return ((3 ^ 0x45 ^ (0xC3 ^ 0xAB)) & (0x76 ^ 0x73 ^ (0xAD ^ 0x86) ^ -1)) != 0;
        }
        return llIIlIIl[1];
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)llIIlIIl[0]);
        this.bq.add((Overlay)this.fD);
        0;
        this.K.register((Object)this.fD);
        this.bY.registerKeyListener(this.fB);
        this.fu = llIIlIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean cB() {
        void var30;
        WorldPoint worldPoint2 = this.cA();
        if (SquireQuestHelper.var15(worldPoint2)) {
            return llIIlIIl[1];
        }
        if (SquireQuestHelper.var11(Static.getClient().isInInstancedRegion() ? 1 : 0) && SquireQuestHelper.var14(House.isInside() ? 1 : 0)) {
            Collection var31 = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)var30);
            WorldPoint var32 = var31.stream().min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (SquireQuestHelper.var15(var32)) {
                SquireQuestHelper var33;
                WorldPoint var34 = var33.cC();
                if (SquireQuestHelper.var15(var34)) {
                    return llIIlIIl[1];
                }
                var32 = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)var33.cC()).stream().filter(Objects::nonNull).findFirst().orElse(null);
                if (SquireQuestHelper.var15(var32)) {
                    return llIIlIIl[1];
                }
            }
            Movement.walkTo((WorldPoint)var32, (boolean)llIIlIIl[1]);
            0;
            return llIIlIIl[0];
        }
        if (SquireQuestHelper.var11(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var30);
            0;
        }
        return llIIlIIl[0];
    }

    public TileObject cx() {
        Object var35 = this.cy();
        try {
            SquireQuestHelper var36;
            Field var37 = var35.getClass().getDeclaredField(llIIIllI[llIIlIIl[6]]);
            var37.setAccessible(llIIlIIl[0]);
            int var38 = var37.getInt(var35);
            WorldPoint var39 = var36.cA();
            Collection var40 = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)var39);
            return TileObjects.getAll(tileObject -> {
                boolean bl2;
                if (SquireQuestHelper.var13(tileObject.getId(), var38)) {
                    bl2 = llIIlIIl[0];
                    0;
                    if (2 <= 0) {
                        return ((0x51 ^ 0x64) & ~(0x23 ^ 0x16)) != 0;
                    }
                } else {
                    bl2 = llIIlIIl[1];
                }
                return bl2;
            }).stream().filter(tileObject -> {
                boolean bl2;
                if (SquireQuestHelper.var18(var40.stream().map(worldPoint -> worldPoint.distanceTo2D(tileObject.getWorldLocation())).min(Comparator.comparingInt(n2 -> n2)).orElse(llIIlIIl[36]), llIIlIIl[6])) {
                    bl2 = llIIlIIl[0];
                    0;
                    if (-1 > -1) {
                        return ((0x54 ^ 0x6C ^ (0x4C ^ 0x64)) & (0x1F ^ 0x4A ^ (0x1D ^ 0x58) ^ -1)) != 0;
                    }
                } else {
                    bl2 = llIIlIIl[1];
                }
                return bl2;
            }).findFirst().orElse(null);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }

    public List<Integer> cH() {
        return this.cE().stream().filter(object -> object.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[29]])).filter(var41 -> {
            try {
                boolean bl2;
                Class[] classArray = new Class[llIIlIIl[0]];
                classArray[SquireQuestHelper.llIIlIIl[1]] = Client.class;
                Method var42 = var41.getClass().getDeclaredMethod(llIIIllI[llIIlIIl[28]], classArray);
                var42.setAccessible(llIIlIIl[0]);
                Object[] objectArray = new Object[llIIlIIl[0]];
                objectArray[SquireQuestHelper.llIIlIIl[1]] = Static.getClient();
                if (SquireQuestHelper.var14(((Boolean)var42.invoke(var41, objectArray)).booleanValue() ? 1 : 0)) {
                    bl2 = llIIlIIl[0];
                    0;
                    if (1 <= 0) {
                        return ((0x50 ^ 0x70) & ~(0x19 ^ 0x39)) != 0;
                    }
                } else {
                    bl2 = llIIlIIl[1];
                }
                return bl2;
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                return llIIlIIl[1];
            }
        }).flatMap(SquireQuestHelper::b).collect(Collectors.toList());
    }

    /*
     * WARNING - void declaration
     */
    public String cz() {
        void var1_1;
        SquireQuestHelper var43;
        if (SquireQuestHelper.var14(this.fu)) {
            return llIIIllI[llIIlIIl[13]];
        }
        Object var44 = var43.cy();
        if (SquireQuestHelper.var15(var44)) {
            return llIIIllI[llIIlIIl[2]];
        }
        return var1_1.getClass().getSimpleName();
    }

    /*
     * WARNING - void declaration
     */
    public boolean d(TileObject tileObject) {
        TileObject var45;
        void var46;
        if (SquireQuestHelper.var11(Movement.walkTo((Locatable)tileObject) ? 1 : 0)) {
            Log.info((String)llIIIllI[llIIlIIl[15]]);
            return llIIlIIl[0];
        }
        Log.info((String)llIIIllI[llIIlIIl[16]]);
        WorldPoint var47 = Players.getLocal().getWorldLocation();
        if (SquireQuestHelper.var18(var47.distanceTo2D(var46.getWorldLocation()), llIIlIIl[3]) && SquireQuestHelper.var4(var45 = TileObjects.getNearest((WorldPoint)var46.getWorldLocation(), arg_0 -> SquireQuestHelper.a((TileObject)var46, arg_0)))) {
            var45.interact(llIIIllI[llIIlIIl[17]]);
            Log.info((String)llIIIllI[llIIlIIl[18]]);
            return llIIlIIl[0];
        }
        return llIIlIIl[1];
    }

    public Object cy() {
        Plugin var48 = this.cv();
        try {
            Method var49 = var48.getClass().getDeclaredMethod(llIIIllI[llIIlIIl[7]], new Class[llIIlIIl[1]]);
            Object var50 = var49.invoke((Object)var48, new Object[llIIlIIl[1]]);
            Method var51 = var50.getClass().getMethod(llIIIllI[llIIlIIl[8]], new Class[llIIlIIl[1]]);
            Object var52 = var51.invoke(var50, new Object[llIIlIIl[1]]);
            if (SquireQuestHelper.var4(var52) && SquireQuestHelper.var11(var52.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[9]]) ? 1 : 0)) {
                Method var53 = var52.getClass().getSuperclass().getMethod(llIIIllI[llIIlIIl[10]], new Class[llIIlIIl[1]]);
                return var53.invoke(var52, new Object[llIIlIIl[1]]);
            }
            if (SquireQuestHelper.var4(var52) && SquireQuestHelper.var11(var52.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[11]]) ? 1 : 0)) {
                Method var53 = var52.getClass().getMethod(llIIIllI[llIIlIIl[12]], new Class[llIIlIIl[1]]);
                return var53.invoke(var52, new Object[llIIlIIl[1]]);
            }
            return var52;
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    private static boolean var26(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static  boolean a(TileObject tileObject, TileObject tileObject2) {
        int n2;
        if (SquireQuestHelper.var54(tileObject2, tileObject)) {
            String[] stringArray = new String[llIIlIIl[0]];
            stringArray[SquireQuestHelper.llIIlIIl[1]] = llIIIllI[llIIlIIl[35]];
            if (SquireQuestHelper.var11(tileObject2.hasAction(stringArray) ? 1 : 0)) {
                n2 = llIIlIIl[0];
                0;
                if (((0xF0 ^ 0xC1 ^ (0x54 ^ 0x72)) & (40 + 71 - 67 + 137 ^ 48 + 149 - 92 + 57 ^ -1)) >= 0) return n2 != 0;
                return ((0xF1 ^ 0xA7 ^ (0x5D ^ 0x43)) & (102 + 57 - 106 + 90 ^ 17 + 95 - -18 + 69 ^ -1)) != 0;
            }
        }
        n2 = llIIlIIl[1];
        return n2 != 0;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

        catch (Exception var59) {
            var59.printStackTrace();
            return null;
        }
    }

    public Object cw() {
        Plugin var60 = this.cv();
        try {
            String string;
            Field var61 = var60.getClass().getDeclaredField(llIIIllI[llIIlIIl[4]]);
            var61.setAccessible(llIIlIIl[0]);
            Object var62 = var61.get(var60);
            if (SquireQuestHelper.var15(var62)) {
                string = llIIIllI[llIIlIIl[5]];
                0;
                if (3 <= -1) {
                    return null;
                }
            } else {
                string = var62.getClass().getSimpleName();
            }
            return string;
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            return null;
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIlIIl[2]];
        classArray[SquireQuestHelper.llIIlIIl[1]] = PressingContinueTask.class;
        classArray[SquireQuestHelper.llIIlIIl[0]] = PressingDialogOptionTask.class;
        classArray[SquireQuestHelper.llIIlIIl[3]] = TalkingToNpcTask.class;
        classArray[SquireQuestHelper.llIIlIIl[4]] = InteractingWithObjectTask.class;
        classArray[SquireQuestHelper.llIIlIIl[5]] = PerformingDetailedStepTask.class;
        classArray[SquireQuestHelper.llIIlIIl[6]] = WidgetStepTask.class;
        classArray[SquireQuestHelper.llIIlIIl[7]] = UsingItemOnItemTask.class;
        classArray[SquireQuestHelper.llIIlIIl[8]] = EquippingItemsTask.class;
        classArray[SquireQuestHelper.llIIlIIl[9]] = AttackingNpcTask.class;
        classArray[SquireQuestHelper.llIIlIIl[10]] = BankingForItemsTask.class;
        classArray[SquireQuestHelper.llIIlIIl[11]] = RotatingMirrorTask.class;
        classArray[SquireQuestHelper.llIIlIIl[12]] = PerformingDigTask.class;
        classArray[SquireQuestHelper.llIIlIIl[13]] = PickingUpAnItemTask.class;
        return classArray;
    }

    private static boolean var12(int n2, int n3) {
        return n2 != n3;
    }

        catch (Exception var67) {
            var67.printStackTrace();
            return null;
        }
    }

    private static boolean var54(Object object, Object object2) {
        return object != object2;
    }

    public SquireQuestHelper() {
        this.fu = llIIlIIl[0];
        this.fB = new bh(this);
    }

    private List<Object> f(List<Object> list) {
        List<Object> list2 = list.stream().filter(object -> object.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[33]])).flatMap(object -> {
            if (SquireQuestHelper.var11(object.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[31]]) ? 1 : 0)) {
                try {
                    Object var68;
                    Field var69 = var68.getClass().getDeclaredField(llIIIllI[llIIlIIl[32]]);
                    var69.setAccessible(llIIlIIl[0]);
                    return ((List)var69.get(var68)).stream();
                }
                catch (IllegalAccessException | NoSuchFieldException var69) {
                    return Stream.empty();
                }
            }
            return Stream.of(object);
        }).collect(Collectors.toList());
        if (SquireQuestHelper.var11(list2.stream().anyMatch(object -> object.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[30]])) ? 1 : 0)) {
            return this.f(list2);
        }
        return list2;
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    private static String var70(String var71, String var72) {
        var71 = new String(Base64.getDecoder().decode(var71.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var73 = new StringBuilder();
        char[] var74 = var72.toCharArray();
        int var75 = llIIlIIl[1];
        char[] var76 = var71.toCharArray();
        int var77 = var76.length;
        int var78 = llIIlIIl[1];
        while (SquireQuestHelper.var26(var78, var77)) {
            char var79 = var76[var78];
            var73.append((char)(var79 ^ var74[var75 % var74.length]));
            0;
            ++var75;
            ++var78;
            0;
            if (2 < (16 + 102 - 66 + 114 ^ 50 + 99 - 113 + 126)) continue;
            return null;
        }
        return String.valueOf(var73);
    }

    public boolean cu() {
        return Dialog.getName().contains(llIIIllI[llIIlIIl[0]]);
    }

    public Plugin cv() {
        Optional<Plugin> optional = this.fC.getPlugins().stream().filter(plugin -> plugin.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[37]])).findFirst();
        if (SquireQuestHelper.var11(optional.isEmpty() ? 1 : 0)) {
            JOptionPane.showMessageDialog(null, llIIIllI[llIIlIIl[3]]);
            this.forceStop();
            return null;
        }
        return optional.get();
    }

    public List<Integer> cI() {
        List<Object> list = this.cG();
        return list.stream().filter(var80 -> {
            try {
                Class[] classArray = new Class[llIIlIIl[0]];
                classArray[SquireQuestHelper.llIIlIIl[1]] = Client.class;
                Method var81 = var80.getClass().getDeclaredMethod(llIIIllI[llIIlIIl[27]], classArray);
                var81.setAccessible(llIIlIIl[0]);
                Object[] objectArray = new Object[llIIlIIl[0]];
                objectArray[SquireQuestHelper.llIIlIIl[1]] = Static.getClient();
                return (Boolean)var81.invoke(var80, objectArray);
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                return llIIlIIl[1];
            }
        }).flatMap(SquireQuestHelper::b).collect(Collectors.toList());
    }

    public boolean isEnabled() {
        return this.fu;
    }

    public List<Object> cG() {
        List<Object> list = this.cE();
        return this.f(list);
    }

    public WorldPoint cA() {
        Object var82 = this.cy();
        try {
            Field var83 = var82.getClass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[14]]);
            var83.setAccessible(llIIlIIl[0]);
            return (WorldPoint)var83.get(var82);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }

    public List<String> cD() {
        try {
            SquireQuestHelper var84;
            Object var85 = var84.cy();
            Field var86 = var85.getClass().getSuperclass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[20]]);
            var86.setAccessible(llIIlIIl[0]);
            return (List)var86.get(var85);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return List.of();
        }
    }

    private WorldPoint cC() {
        Object var87 = this.cy();
        try {
            Field var88 = var87.getClass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[19]]);
            var88.setAccessible(llIIlIIl[0]);
            return (WorldPoint)var88.get(var87);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int A(int n2) {
        void var89;
        void var90;
        List<Object> list = this.cE();
        if (SquireQuestHelper.var18(list.size(), n2)) {
            return llIIlIIl[22];
        }
        Object var91 = var90.get((int)var89);
        if (SquireQuestHelper.var14(var91.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[23]]) ? 1 : 0)) {
            return llIIlIIl[22];
        }
        try {
            Method var92 = var91.getClass().getMethod(llIIIllI[llIIlIIl[24]], new Class[llIIlIIl[1]]);
            var92.setAccessible(llIIlIIl[0]);
            return (Integer)var92.invoke(var91, new Object[llIIlIIl[1]]);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return llIIlIIl[22];
        }
    }
}

