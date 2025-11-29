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
import i.i.b.s.c.q.r.s.s.-.u.a.e.bh;
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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    protected void onStop() {
        InteractionManager.setHelper((boolean)llIIlIIl[1]);
        this.bq.remove((Overlay)this.fD);

        this.K.unregister((Object)this.fD);
        this.bY.unregisterKeyListener(this.fB);
        this.fu = llIIlIIl[1];
    }

    public List<Integer> cF() {
        return this.cG().stream().filter(llIllIIIIlIllII -> {
            try {
                Field llIllIIIIlIlIll = llIllIIIIlIllII.getClass().getDeclaredField(llIIIllI[llIIlIIl[34]]);
                llIllIIIIlIlIll.setAccessible(llIIlIIl[0]);
                return (Boolean)llIllIIIIlIlIll.get(llIllIIIIlIllII);
            }
            catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
                return llIIlIIl[1];
            }
        }).flatMap(SquireQuestHelper::b).collect(Collectors.toList());
    }

    private static boolean lIllIIllll(Object object) {
        return object != null;
    }

    static {
        SquireQuestHelper.lIllIIlIll();
        SquireQuestHelper.lIllIIIIII();
    }

    public NPC cK() {
        Object llIllIIIlIlIlIl = this.cy();
        try {
            Field llIllIIIlIlIlII = llIllIIIlIlIlIl.getClass().getDeclaredField(llIIIllI[llIIlIIl[25]]);
            llIllIIIlIlIlII.setAccessible(llIIlIIl[0]);
            int llIllIIIlIlIIll = llIllIIIlIlIlII.getInt(llIllIIIlIlIlIl);
            Field llIllIIIlIlIIlI = llIllIIIlIlIlIl.getClass().getDeclaredField(llIIIllI[llIIlIIl[26]]);
            llIllIIIlIlIIlI.setAccessible(llIIlIIl[0]);
            List llIllIIIlIlIIIl = (List)llIllIIIlIlIIlI.get(llIllIIIlIlIlIl);
            if (SquireQuestHelper.lIllIIllIl(llIllIIIlIlIIIl.isEmpty() ? 1 : 0)) {
                return NPCs.getNearest(nPC -> {
                    boolean bl2;
                    if (!SquireQuestHelper.lIllIlIlIl(nPC.getId(), llIllIIIlIlIIll) || SquireQuestHelper.lIllIlIlll(nPC.getTransformedId(), llIllIIIlIlIIll)) {
                        bl2 = llIIlIIl[0];

                        if (-1 > 2) {
                            return false;
                        }
                    } else {
                        bl2 = llIIlIIl[1];
                    }
                    return bl2;
                });
            }
            return NPCs.getNearest(nPC -> {
                int n3;
                if (!SquireQuestHelper.lIllIlIlIl(nPC.getId(), llIllIIIlIlIIll) || !SquireQuestHelper.lIllIlIIII(llIllIIIlIlIIIl.contains(nPC.getId()) ? 1 : 0) || SquireQuestHelper.lIllIlIlll(nPC.getTransformedId(), llIllIIIlIlIIll)) {
                    n3 = llIIlIIl[0];

                    if (3 == 2) {
                        return false;
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

    private static boolean lIllIIlllI(Object object) {
        return object == null;
    }

    private static  boolean a(String string, String string2) {
        return string2.toLowerCase().contains(string.toLowerCase());
    }

    private static boolean lIllIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    public int cJ() {
        return this.A(llIIlIIl[1]);
    }

    @Provides
    SquireQuestHelperConfig t(ConfigManager configManager) {
        return (SquireQuestHelperConfig)configManager.getConfig(SquireQuestHelperConfig.class);
    }

    private static void lIllIIIIII() {
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
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[13]] = SquireQuestHelper.lIlIllIllI("pv1hosjybRA=", "Exvat");
        SquireQuestHelper.llIIIllI[SquireQuestHelper.llIIlIIl[2]] = SquireQuestHelper.lIlIllIlll("oAC2u1wVfFw=", "bdxTb");
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

    private static boolean lIllIlIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static Stream<Integer> b(Object llIllIIllIIIIII) {
        try {
            Method llIllIIlIllllll = llIllIIllIIIIII.getClass().getMethod(llIIIllI[llIIlIIl[1]], new Class[llIIlIIl[1]]);
            llIllIIlIllllll.setAccessible(llIIlIIl[0]);
            return ((List)llIllIIlIllllll.invoke(llIllIIllIIIIII, new Object[llIIlIIl[1]])).stream();
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return Stream.empty();
        }
    }

    public List<Object> cE() {
        try {
            SquireQuestHelper llIllIIIllIllll;
            Object llIllIIIllIlllI = llIllIIIllIllll.cy();
            Method llIllIIIllIllIl = llIllIIIllIlllI.getClass().getMethod(llIIIllI[llIIlIIl[21]], new Class[llIIlIIl[1]]);
            llIllIIIllIllIl.setAccessible(llIIlIIl[0]);
            return (List)llIllIIIllIllIl.invoke(llIllIIIllIlllI, new Object[llIIlIIl[1]]);
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
        void llIllIIIlIIIlll;
        String[] stringArray2 = stringArray;
        int n2 = stringArray2.length;
        int llIllIIIlIIIllI = llIIlIIl[1];
        while (SquireQuestHelper.lIllIlIIlI(llIllIIIlIIIllI, (int)llIllIIIlIIIlll)) {
            SquireQuestHelper llIllIIIlIIlIlI;
            void llIllIIIlIIlIII;
            void llIllIIIlIIIlIl = llIllIIIlIIlIII[llIllIIIlIIIllI];
            if (SquireQuestHelper.lIllIIllIl(llIllIIIlIIlIlI.cD().stream().anyMatch(arg_0 -> SquireQuestHelper.a((String)llIllIIIlIIIlIl, arg_0)) ? 1 : 0)) {
                return llIIlIIl[0];
            }
            ++llIllIIIlIIIllI;

            if (3 >= 0) continue;
            return ((3 ^ 0x45 ^ (0xC3 ^ 0xAB)) & (0x76 ^ 0x73 ^ (0xAD ^ 0x86) ^ -1)) != 0;
        }
        return llIIlIIl[1];
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)llIIlIIl[0]);
        this.bq.add((Overlay)this.fD);

        this.K.register((Object)this.fD);
        this.bY.registerKeyListener(this.fB);
        this.fu = llIIlIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    public boolean cB() {
        void llIllIIlIIIlIII;
        WorldPoint worldPoint2 = this.cA();
        if (SquireQuestHelper.lIllIIlllI(worldPoint2)) {
            return llIIlIIl[1];
        }
        if (SquireQuestHelper.lIllIIllIl(Static.getClient().isInInstancedRegion() ? 1 : 0) && SquireQuestHelper.lIllIlIIII(House.isInside() ? 1 : 0)) {
            Collection llIllIIlIIIIlll = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)llIllIIlIIIlIII);
            WorldPoint llIllIIlIIIIllI = llIllIIlIIIIlll.stream().min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo(Players.getLocal().getWorldLocation()))).orElse(null);
            if (SquireQuestHelper.lIllIIlllI(llIllIIlIIIIllI)) {
                SquireQuestHelper llIllIIlIIIlIIl;
                WorldPoint llIllIIlIIIIlIl = llIllIIlIIIlIIl.cC();
                if (SquireQuestHelper.lIllIIlllI(llIllIIlIIIIlIl)) {
                    return llIIlIIl[1];
                }
                llIllIIlIIIIllI = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)llIllIIlIIIlIIl.cC()).stream().filter(Objects::nonNull).findFirst().orElse(null);
                if (SquireQuestHelper.lIllIIlllI(llIllIIlIIIIllI)) {
                    return llIIlIIl[1];
                }
            }
            Movement.walkTo((WorldPoint)llIllIIlIIIIllI, (boolean)llIIlIIl[1]);

            return llIIlIIl[0];
        }
        if (SquireQuestHelper.lIllIIllIl(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llIllIIlIIIlIII);

        }
        return llIIlIIl[0];
    }

    public TileObject cx() {
        Object llIllIIlIlIlIll = this.cy();
        try {
            SquireQuestHelper llIllIIlIlIllII;
            Field llIllIIlIlIlIlI = llIllIIlIlIlIll.getClass().getDeclaredField(llIIIllI[llIIlIIl[6]]);
            llIllIIlIlIlIlI.setAccessible(llIIlIIl[0]);
            int llIllIIlIlIlIIl = llIllIIlIlIlIlI.getInt(llIllIIlIlIlIll);
            WorldPoint llIllIIlIlIlIII = llIllIIlIlIllII.cA();
            Collection llIllIIlIlIIlll = WorldPoint.toLocalInstance((Client)Static.getClient(), (WorldPoint)llIllIIlIlIlIII);
            return TileObjects.getAll(tileObject -> {
                boolean bl2;
                if (SquireQuestHelper.lIllIlIlll(tileObject.getId(), llIllIIlIlIlIIl)) {
                    bl2 = llIIlIIl[0];

                    if (2 <= 0) {
                        return false;
                    }
                } else {
                    bl2 = llIIlIIl[1];
                }
                return bl2;
            }).stream().filter(tileObject -> {
                boolean bl2;
                if (SquireQuestHelper.lIllIlIIIl(llIllIIlIlIIlll.stream().map(worldPoint -> worldPoint.distanceTo2D(tileObject.getWorldLocation())).min(Comparator.comparingInt(n2 -> n2)).orElse(llIIlIIl[36]), llIIlIIl[6])) {
                    bl2 = llIIlIIl[0];

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
        return this.cE().stream().filter(object -> object.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[29]])).filter(llIllIIIIllIlII -> {
            try {
                boolean bl2;
                Class[] classArray = new Class[llIIlIIl[0]];
                classArray[SquireQuestHelper.llIIlIIl[1]] = Client.class;
                Method llIllIIIIllIIll = llIllIIIIllIlII.getClass().getDeclaredMethod(llIIIllI[llIIlIIl[28]], classArray);
                llIllIIIIllIIll.setAccessible(llIIlIIl[0]);
                Object[] objectArray = new Object[llIIlIIl[0]];
                objectArray[SquireQuestHelper.llIIlIIl[1]] = Static.getClient();
                if (SquireQuestHelper.lIllIlIIII(((Boolean)llIllIIIIllIIll.invoke(llIllIIIIllIlII, objectArray)).booleanValue() ? 1 : 0)) {
                    bl2 = llIIlIIl[0];

                    if (1 <= 0) {
                        return false;
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
        SquireQuestHelper llIllIIlIIlIllI;
        if (SquireQuestHelper.lIllIlIIII(this.fu ? 1 : 0)) {
            return llIIIllI[llIIlIIl[13]];
        }
        Object llIllIIlIIlIlIl = llIllIIlIIlIllI.cy();
        if (SquireQuestHelper.lIllIIlllI(llIllIIlIIlIlIl)) {
            return llIIIllI[llIIlIIl[2]];
        }
        return var1_1.getClass().getSimpleName();
    }

    /*
     * WARNING - void declaration
     */
    public boolean d(TileObject tileObject) {
        TileObject llIllIIIlllllll;
        void llIllIIlIIIIIIl;
        if (SquireQuestHelper.lIllIIllIl(Movement.walkTo((Locatable)tileObject) ? 1 : 0)) {
            Log.info((String)llIIIllI[llIIlIIl[15]]);
            return llIIlIIl[0];
        }
        Log.info((String)llIIIllI[llIIlIIl[16]]);
        WorldPoint llIllIIlIIIIIII = Players.getLocal().getWorldLocation();
        if (SquireQuestHelper.lIllIlIIIl(llIllIIlIIIIIII.distanceTo2D(llIllIIlIIIIIIl.getWorldLocation()), llIIlIIl[3]) && SquireQuestHelper.lIllIIllll(llIllIIIlllllll = TileObjects.getNearest((WorldPoint)llIllIIlIIIIIIl.getWorldLocation(), arg_0 -> SquireQuestHelper.a((TileObject)llIllIIlIIIIIIl, arg_0)))) {
            llIllIIIlllllll.interact(llIIIllI[llIIlIIl[17]]);
            Log.info((String)llIIIllI[llIIlIIl[18]]);
            return llIIlIIl[0];
        }
        return llIIlIIl[1];
    }

    public Object cy() {
        Plugin llIllIIlIIllllI = this.cv();
        try {
            Method llIllIIlIIlllIl = llIllIIlIIllllI.getClass().getDeclaredMethod(llIIIllI[llIIlIIl[7]], new Class[llIIlIIl[1]]);
            Object llIllIIlIIlllII = llIllIIlIIlllIl.invoke((Object)llIllIIlIIllllI, new Object[llIIlIIl[1]]);
            Method llIllIIlIIllIll = llIllIIlIIlllII.getClass().getMethod(llIIIllI[llIIlIIl[8]], new Class[llIIlIIl[1]]);
            Object llIllIIlIIllIlI = llIllIIlIIllIll.invoke(llIllIIlIIlllII, new Object[llIIlIIl[1]]);
            if (SquireQuestHelper.lIllIIllll(llIllIIlIIllIlI) && SquireQuestHelper.lIllIIllIl(llIllIIlIIllIlI.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[9]]) ? 1 : 0)) {
                Method llIllIIlIIllIIl = llIllIIlIIllIlI.getClass().getSuperclass().getMethod(llIIIllI[llIIlIIl[10]], new Class[llIIlIIl[1]]);
                return llIllIIlIIllIIl.invoke(llIllIIlIIllIlI, new Object[llIIlIIl[1]]);
            }
            if (SquireQuestHelper.lIllIIllll(llIllIIlIIllIlI) && SquireQuestHelper.lIllIIllIl(llIllIIlIIllIlI.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[11]]) ? 1 : 0)) {
                Method llIllIIlIIllIIl = llIllIIlIIllIlI.getClass().getMethod(llIIIllI[llIIlIIl[12]], new Class[llIIlIIl[1]]);
                return llIllIIlIIllIIl.invoke(llIllIIlIIllIlI, new Object[llIIlIIl[1]]);
            }
            return llIllIIlIIllIlI;
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    private static boolean lIllIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static  boolean a(TileObject tileObject, TileObject tileObject2) {
        int n2;
        if (SquireQuestHelper.lIllIllIlI(tileObject2, tileObject)) {
            String[] stringArray = new String[llIIlIIl[0]];
            stringArray[SquireQuestHelper.llIIlIIl[1]] = llIIIllI[llIIlIIl[35]];
            if (SquireQuestHelper.lIllIIllIl(tileObject2.hasAction(stringArray) ? 1 : 0)) {
                n2 = llIIlIIl[0];

                if (((0xF0 ^ 0xC1 ^ (0x54 ^ 0x72)) & (40 + 71 - 67 + 137 ^ 48 + 149 - 92 + 57 ^ -1)) >= 0) return n2 != 0;
                return ((0xF1 ^ 0xA7 ^ (0x5D ^ 0x43)) & (102 + 57 - 106 + 90 ^ 17 + 95 - -18 + 69 ^ -1)) != 0;
            }
        }
        n2 = llIIlIIl[1];
        return n2 != 0;
    }

    private static boolean lIllIIllIl(int n2) {
        return n2 != 0;
    }

    public Object cw() {
        Plugin llIllIIlIllIlIl = this.cv();
        try {
            String string;
            Field llIllIIlIllIlII = llIllIIlIllIlIl.getClass().getDeclaredField(llIIIllI[llIIlIIl[4]]);
            llIllIIlIllIlII.setAccessible(llIIlIIl[0]);
            Object llIllIIlIllIIll = llIllIIlIllIlII.get(llIllIIlIllIlIl);
            if (SquireQuestHelper.lIllIIlllI(llIllIIlIllIIll)) {
                string = llIIIllI[llIIlIIl[5]];

                if (3 <= -1) {
                    return null;
                }
            } else {
                string = llIllIIlIllIIll.getClass().getSimpleName();
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

    private static boolean lIllIlIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIllIlI(Object object, Object object2) {
        return object != object2;
    }

    public SquireQuestHelper() {
        this.fu = llIIlIIl[0];
        this.fB = new bh(this);
    }

    private List<Object> f(List<Object> list) {
        List<Object> list2 = list.stream().filter(object -> object.getClass().getSimpleName().contains(llIIIllI[llIIlIIl[33]])).flatMap(object -> {
            if (SquireQuestHelper.lIllIIllIl(object.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[31]]) ? 1 : 0)) {
                try {
                    Object llIllIIIIllIIII;
                    Field llIllIIIIlIllll = llIllIIIIllIIII.getClass().getDeclaredField(llIIIllI[llIIlIIl[32]]);
                    llIllIIIIlIllll.setAccessible(llIIlIIl[0]);
                    return ((List)llIllIIIIlIllll.get(llIllIIIIllIIII)).stream();
                }
                catch (IllegalAccessException | NoSuchFieldException llIllIIIIlIllll) {
                    return Stream.empty();
                }
            }
            return Stream.of(object);
        }).collect(Collectors.toList());
        if (SquireQuestHelper.lIllIIllIl(list2.stream().anyMatch(object -> object.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[30]])) ? 1 : 0)) {
            return this.f(list2);
        }
        return list2;
    }

    private static boolean lIllIlIIII(int n2) {
        return n2 == 0;
    }

        return String.valueOf(llIlIlllllllIII);
    }

    public boolean cu() {
        return Dialog.getName().contains(llIIIllI[llIIlIIl[0]]);
    }

    public Plugin cv() {
        Optional<Plugin> optional = this.fC.getPlugins().stream().filter(plugin -> plugin.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[37]])).findFirst();
        if (SquireQuestHelper.lIllIIllIl(optional.isEmpty() ? 1 : 0)) {
            JOptionPane.showMessageDialog(null, llIIIllI[llIIlIIl[3]]);
            this.forceStop();
            return null;
        }
        return optional.get();
    }

    public List<Integer> cI() {
        List<Object> list = this.cG();
        return list.stream().filter(llIllIIIIlllIII -> {
            try {
                Class[] classArray = new Class[llIIlIIl[0]];
                classArray[SquireQuestHelper.llIIlIIl[1]] = Client.class;
                Method llIllIIIIllIlll = llIllIIIIlllIII.getClass().getDeclaredMethod(llIIIllI[llIIlIIl[27]], classArray);
                llIllIIIIllIlll.setAccessible(llIIlIIl[0]);
                Object[] objectArray = new Object[llIIlIIl[0]];
                objectArray[SquireQuestHelper.llIIlIIl[1]] = Static.getClient();
                return (Boolean)llIllIIIIllIlll.invoke(llIllIIIIlllIII, objectArray);
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
        Object llIllIIlIIlIIII = this.cy();
        try {
            Field llIllIIlIIIllll = llIllIIlIIlIIII.getClass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[14]]);
            llIllIIlIIIllll.setAccessible(llIIlIIl[0]);
            return (WorldPoint)llIllIIlIIIllll.get(llIllIIlIIlIIII);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return null;
        }
    }

    public List<String> cD() {
        try {
            SquireQuestHelper llIllIIIlllIlIl;
            Object llIllIIIlllIlII = llIllIIIlllIlIl.cy();
            Field llIllIIIlllIIll = llIllIIIlllIlII.getClass().getSuperclass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[20]]);
            llIllIIIlllIIll.setAccessible(llIIlIIl[0]);
            return (List)llIllIIIlllIIll.get(llIllIIIlllIlII);
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return List.of();
        }
    }

    private WorldPoint cC() {
        Object llIllIIIllllIlI = this.cy();
        try {
            Field llIllIIIllllIIl = llIllIIIllllIlI.getClass().getSuperclass().getDeclaredField(llIIIllI[llIIlIIl[19]]);
            llIllIIIllllIIl.setAccessible(llIIlIIl[0]);
            return (WorldPoint)llIllIIIllllIIl.get(llIllIIIllllIlI);
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
        void llIllIIIllIIIII;
        void llIllIIIlIlllll;
        List<Object> list = this.cE();
        if (SquireQuestHelper.lIllIlIIIl(list.size(), n2)) {
            return llIIlIIl[22];
        }
        Object llIllIIIlIllllI = llIllIIIlIlllll.get((int)llIllIIIllIIIII);
        if (SquireQuestHelper.lIllIlIIII(llIllIIIlIllllI.getClass().getSimpleName().equals(llIIIllI[llIIlIIl[23]]) ? 1 : 0)) {
            return llIIlIIl[22];
        }
        try {
            Method llIllIIIlIlllIl = llIllIIIlIllllI.getClass().getMethod(llIIIllI[llIIlIIl[24]], new Class[llIIlIIl[1]]);
            llIllIIIlIlllIl.setAccessible(llIIlIIl[0]);
            return (Integer)llIllIIIlIlllIl.invoke(llIllIIIlIllllI, new Object[llIIlIIl[1]]);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return llIIlIIl[22];
        }
    }
}

