/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Actor
 *  net.runelite.api.GameState
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.NpcLootReceived
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.basics.loot;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.loot.LooterConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aG;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aJ;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aK;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aL;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aM;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aN;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aO;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aP;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aQ;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@SquireUtil
@PluginDescriptor(name="Squire Looter", description="Loots items", enabledByDefault=false)
public class SquireLooter
extends SquirePlugin {
    /* synthetic */ List<aH> F;
    @Inject
    /* synthetic */ LooterConfig ew;
    @Inject
    /* synthetic */ aH ev;
    /* synthetic */ List<aH> eq;
    /* synthetic */ WorldPoint eu;
    private static /* synthetic */ int[] llIIlIIlI;
    private /* synthetic */ List<Integer> ex;
    private static /* synthetic */ String[] llIIlIIIl;
    /* synthetic */ Actor et;
    /* synthetic */ WorldPoint ep;
    /* synthetic */ List<aH> er;
    /* synthetic */ Instant es;

    public void a(Actor actor) {
        this.et = actor;
    }

    private static boolean lIlIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    public WorldPoint cj() {
        return this.eu;
    }

    private static String lIlIlllIlII(String lIllIlIlIlIlIll, String lIllIlIlIlIlIlI) {
        try {
            SecretKeySpec lIllIlIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIlIlIlIllll = Cipher.getInstance("Blowfish");
            lIllIlIlIlIllll.init(llIIlIIlI[3], lIllIlIlIllIIII);
            return new String(lIllIlIlIlIllll.doFinal(Base64.getDecoder().decode(lIllIlIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIlIlIlIlllI) {
            lIllIlIlIlIlllI.printStackTrace();
            return null;
        }
    }

    public List<aH> cg() {
        return this.eq;
    }

    public SquireLooter() {
        this.F = new ArrayList<aH>();
        this.eq = new ArrayList<aH>();
        this.er = new ArrayList<aH>();
        this.ex = new ArrayList<Integer>();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIlIIlI[0]];
        classArray[SquireLooter.llIIlIIlI[1]] = aK.class;
        classArray[SquireLooter.llIIlIIlI[2]] = aN.class;
        classArray[SquireLooter.llIIlIIlI[3]] = aO.class;
        classArray[SquireLooter.llIIlIIlI[4]] = aL.class;
        classArray[SquireLooter.llIIlIIlI[5]] = aM.class;
        classArray[SquireLooter.llIIlIIlI[6]] = aP.class;
        classArray[SquireLooter.llIIlIIlI[7]] = aQ.class;
        classArray[SquireLooter.llIIlIIlI[8]] = aJ.class;
        return classArray;
    }

    /*
     * WARNING - void declaration
     */
    private boolean y(int n2) {
        void lIllIlIlllIIIll;
        int[] nArray = this.ce();
        int n3 = nArray.length;
        int lIllIlIlllIIIlI = llIIlIIlI[1];
        while (SquireLooter.lIlIlllllII(lIllIlIlllIIIlI, (int)lIllIlIlllIIIll)) {
            void lIllIlIlllIIlIl;
            void lIllIlIlllIIlII;
            void lIllIlIlllIIIIl = lIllIlIlllIIlII[lIllIlIlllIIIlI];
            if (SquireLooter.lIlIlllllIl((int)lIllIlIlllIIIIl, (int)lIllIlIlllIIlIl)) {
                return llIIlIIlI[2];
            }
            ++lIllIlIlllIIIlI;
            "".length();
            if ((0x57 ^ 0x53) > 0) continue;
            return ((0xD6 ^ 0xB7) & ~(0x34 ^ 0x55)) != 0;
        }
        return llIIlIIlI[1];
    }

    private static boolean lIlIlllIlll(Object object, Object object2) {
        return object != object2;
    }

    public void d(List<aH> list) {
        this.eq = list;
    }

    public Actor ci() {
        return this.et;
    }

    public List<aH> ch() {
        return this.er;
    }

    protected void onStop() {
        this.es = null;
        this.et = null;
        this.eu = null;
        this.F.clear();
    }

    public void k(WorldPoint worldPoint) {
        this.eu = worldPoint;
    }

    static {
        SquireLooter.lIlIlllIllI();
        SquireLooter.lIlIlllIlIl();
    }

    private static boolean lIlIllllIIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIlllIlIl() {
        llIIlIIIl = new String[llIIlIIlI[0]];
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[1]] = SquireLooter.lIlIlllIIlI("pf6dc19nRe8=", "vdAml");
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[2]] = SquireLooter.lIlIlllIIll("CRgcMwQ=", "hktVw");
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[3]] = SquireLooter.lIlIlllIIll("AzgBJz0=", "DJhJD");
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[4]] = SquireLooter.lIlIlllIIll("OhEbEg==", "Rtzvm");
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[5]] = SquireLooter.lIlIlllIlII("nN7hyOqv1ak=", "qFsFX");
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[6]] = SquireLooter.lIlIlllIIll("GB0qPDg=", "zrDYK");
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[7]] = SquireLooter.lIlIlllIlII("S3gn/MlpHKI=", "Knaot");
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[8]] = SquireLooter.lIlIlllIIll("eQ==", "UJzdd");
    }

    private static boolean lIlIllllIII(Object object) {
        return object == null;
    }

    public void e(List<aH> list) {
        this.er = list;
    }

    @Provides
    LooterConfig n(ConfigManager configManager) {
        return (LooterConfig)configManager.getConfig(LooterConfig.class);
    }

    private static String lIlIlllIIlI(String lIllIlIlIlIIIII, String lIllIlIlIIlllll) {
        try {
            SecretKeySpec lIllIlIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIlIIlllll.getBytes(StandardCharsets.UTF_8)), llIIlIIlI[0]), "DES");
            Cipher lIllIlIlIlIIIlI = Cipher.getInstance("DES");
            lIllIlIlIlIIIlI.init(llIIlIIlI[3], lIllIlIlIlIIIll);
            return new String(lIllIlIlIlIIIlI.doFinal(Base64.getDecoder().decode(lIllIlIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIlIlIlIIIIl) {
            lIllIlIlIlIIIIl.printStackTrace();
            return null;
        }
    }

    public List<aH> p() {
        return this.F;
    }

    private static void lIlIlllIllI() {
        llIIlIIlI = new int[10];
        SquireLooter.llIIlIIlI[0] = 0x80 ^ 0x88;
        SquireLooter.llIIlIIlI[1] = (0x38 ^ 0x45 ^ (0xBB ^ 0x96)) & (202 + 65 - 265 + 209 ^ 35 + 116 - 86 + 66 ^ -" ".length());
        SquireLooter.llIIlIIlI[2] = " ".length();
        SquireLooter.llIIlIIlI[3] = "  ".length();
        SquireLooter.llIIlIIlI[4] = "   ".length();
        SquireLooter.llIIlIIlI[5] = 106 + 17 - 45 + 60 ^ 132 + 35 - 29 + 4;
        SquireLooter.llIIlIIlI[6] = 0x75 ^ 0x70;
        SquireLooter.llIIlIIlI[7] = 41 + 136 - 28 + 21 ^ 151 + 12 - 121 + 130;
        SquireLooter.llIIlIIlI[8] = 0xC ^ 0xB;
        SquireLooter.llIIlIIlI[9] = 69 + 62 - 67 + 81 ^ 89 + 96 - 99 + 71;
    }

    /*
     * WARNING - void declaration
     */
    private int[] ce() {
        void var2_2;
        SquireLooter lIllIlIllIlllII;
        if (SquireLooter.lIlIllllIll(this.ew.custom().isEmpty() ? 1 : 0)) {
            return new int[llIIlIIlI[1]];
        }
        String[] lIllIlIllIllIll = lIllIlIllIlllII.ew.custom().split(llIIlIIIl[llIIlIIlI[8]]);
        int[] lIllIlIllIllIlI = new int[lIllIlIllIllIll.length];
        int lIllIlIllIllIIl = llIIlIIlI[1];
        while (SquireLooter.lIlIlllllII(lIllIlIllIllIIl, lIllIlIllIllIll.length)) {
            lIllIlIllIllIlI[lIllIlIllIllIIl] = Integer.parseInt(lIllIlIllIllIll[lIllIlIllIllIIl].trim());
            ++lIllIlIllIllIIl;
            "".length();
            if (((45 + 133 - 177 + 151 ^ 28 + 80 - 53 + 82) & (0xFE ^ 0xC4 ^ (0x85 ^ 0xAE) ^ -" ".length())) < "   ".length()) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    protected void onStart() {
        void var1_1;
        if (SquireLooter.lIlIlllIlll(Game.getState(), GameState.LOGGED_IN)) {
            return;
        }
        lIllIlIlllllIlI.ep = Players.getLocal().getWorldLocation();
        Actor lIllIlIlllllIIl = Players.getLocal().getInteracting();
        if (SquireLooter.lIlIllllIII(lIllIlIlllllIIl)) {
            return;
        }
        this.a((Actor)var1_1);
    }

    public WorldPoint cf() {
        return this.ep;
    }

    private static boolean lIlIllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    public void a(List<aH> list) {
        this.F = list;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        npcLootReceived.getItems().forEach(itemStack -> {
            this.ex.add(itemStack.getId());
            "".length();
        });
    }

    public void j(WorldPoint worldPoint) {
        this.ep = worldPoint;
    }

    private static boolean lIlIlllllIl(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    private void a(ItemDespawned itemDespawned) {
        int n2 = itemDespawned.getItem().getId();
        this.F.removeIf(aH2 -> {
            int n3;
            if (SquireLooter.lIlIlllllIl(n2, aH2.P()) && SquireLooter.lIlIllllIll(itemDespawned.getItem().getWorldLocation().equals((Object)aH2.cd()) ? 1 : 0)) {
                n3 = llIIlIIlI[2];
                "".length();
                if ("   ".length() <= 0) {
                    return ((5 ^ 0x36) & ~(0xA1 ^ 0x92)) != 0;
                }
            } else {
                n3 = llIIlIIlI[1];
            }
            return n3 != 0;
        });
        "".length();
        if (SquireLooter.lIlIllllIll(this.ex.contains(n2) ? 1 : 0)) {
            this.ex.remove(this.ex.lastIndexOf(n2));
            "".length();
        }
    }

    private static boolean lIlIllllIll(int n2) {
        return n2 != 0;
    }

    private static String lIlIlllIIll(String lIllIlIlIllllIl, String lIllIlIllIIIIIl) {
        lIllIlIlIllllIl = new String(Base64.getDecoder().decode(lIllIlIlIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIlIllIIIIII = new StringBuilder();
        char[] lIllIlIlIllllll = lIllIlIllIIIIIl.toCharArray();
        int lIllIlIlIlllllI = llIIlIIlI[1];
        char[] lIllIlIlIlllIII = lIllIlIlIllllIl.toCharArray();
        int lIllIlIlIllIlll = lIllIlIlIlllIII.length;
        int lIllIlIlIllIllI = llIIlIIlI[1];
        while (SquireLooter.lIlIlllllII(lIllIlIlIllIllI, lIllIlIlIllIlll)) {
            char lIllIlIllIIIIll = lIllIlIlIlllIII[lIllIlIlIllIllI];
            lIllIlIllIIIIII.append((char)(lIllIlIllIIIIll ^ lIllIlIlIllllll[lIllIlIlIlllllI % lIllIlIlIllllll.length]));
            "".length();
            ++lIllIlIlIlllllI;
            ++lIllIlIlIllIllI;
            "".length();
            if (((0x9B ^ 0xA0) & ~(0xB9 ^ 0x82)) == 0) continue;
            return null;
        }
        return String.valueOf(lIllIlIllIIIIII);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        SquireLooter lIllIlIllllIIlI;
        void lIllIlIllllIIII;
        TileItem tileItem = itemSpawned.getItem();
        if (SquireLooter.lIlIllllIIl(tileItem.canPickup() ? 1 : 0)) {
            return;
        }
        if (SquireLooter.lIlIllllIIl(Reachable.isInteractable((Locatable)lIllIlIllllIIII) ? 1 : 0)) {
            return;
        }
        if (SquireLooter.lIlIllllIlI(lIllIlIllllIIII.distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlI[9])) {
            return;
        }
        aH lIllIlIlllIllll = new aH();
        lIllIlIlllIllll.f(lIllIlIllllIIII.getId());
        lIllIlIlllIllll.i(lIllIlIllllIIII.getWorldLocation());
        String lIllIlIlllIlllI = Static.getClient().getItemDefinition(lIllIlIllllIIII.getId()).getName();
        int n2 = Static.getClient().getItemDefinition(lIllIlIllllIIII.getId()).isStackable();
        if (SquireLooter.lIlIllllIIl(lIllIlIllllIIlI.ew.lootBones() ? 1 : 0)) {
            if (SquireLooter.lIlIllllIll(lIllIlIlllIlllI.toLowerCase().contains(llIIlIIIl[llIIlIIlI[1]]) ? 1 : 0)) {
                return;
            }
            if (SquireLooter.lIlIllllIll(lIllIlIlllIlllI.contains(llIIlIIIl[llIIlIIlI[2]]) ? 1 : 0)) {
                return;
            }
        }
        if (SquireLooter.lIlIllllIll(lIllIlIllllIIlI.y(lIllIlIllllIIII.getId()) ? 1 : 0)) {
            lIllIlIllllIIlI.F.add(lIllIlIlllIllll);
            "".length();
            return;
        }
        if (SquireLooter.lIlIllllIll(lIllIlIllllIIlI.ew.lootStackable() ? 1 : 0)) {
            int[] nArray = new int[llIIlIIlI[2]];
            nArray[SquireLooter.llIIlIIlI[1]] = lIllIlIlllIllll.P();
            if (SquireLooter.lIlIllllIll(Inventory.contains((int[])nArray) ? 1 : 0) && SquireLooter.lIlIllllIll(n2)) {
                System.out.println("Adding stackable item " + Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName() + " to items to loot");
                lIllIlIllllIIlI.F.add(lIllIlIlllIllll);
                "".length();
            }
        }
        if (SquireLooter.lIlIllllIll(Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName().contains(llIIlIIIl[llIIlIIlI[3]]) ? 1 : 0)) {
            if (SquireLooter.lIlIllllIll(lIllIlIllllIIlI.ew.herbsToLoot().contains((Object)aG.x(lIllIlIllllIIII.getId())) ? 1 : 0)) {
                lIllIlIllllIIlI.eq.add(lIllIlIlllIllll);
                "".length();
                System.out.println("Adding " + Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName() + " to herbs to loot");
                "".length();
                if (-" ".length() == (0x79 ^ 0x72 ^ (0x38 ^ 0x37))) {
                    return;
                }
            }
        } else if (SquireLooter.lIlIllllIll(Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName().contains(llIIlIIIl[llIIlIIlI[4]]) ? 1 : 0)) {
            if (SquireLooter.lIlIllllIll(lIllIlIllllIIlI.ew.lootHeads() ? 1 : 0)) {
                lIllIlIllllIIlI.er.add(lIllIlIlllIllll);
                "".length();
                System.out.println("Adding " + Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName() + " to heads to loot");
                "".length();
                if (null != null) {
                    return;
                }
            }
        } else {
            if (SquireLooter.lIlIlllllII(Prices.getItemPrice((int)lIllIlIllllIIII.getId()) * lIllIlIllllIIII.getQuantity(), lIllIlIllllIIlI.ew.lootValue()) && SquireLooter.lIlIllllIIl(Static.getClient().getItemDefinition(lIllIlIllllIIII.getId()).getName().contains(llIIlIIIl[llIIlIIlI[5]]) ? 1 : 0) && SquireLooter.lIlIllllIIl(Static.getClient().getItemDefinition(lIllIlIllllIIII.getId()).getName().toLowerCase().contains(llIIlIIIl[llIIlIIlI[6]]) ? 1 : 0) && SquireLooter.lIlIllllIIl(Static.getClient().getItemDefinition(lIllIlIllllIIII.getId()).getName().contains(llIIlIIIl[llIIlIIlI[7]]) ? 1 : 0)) {
                return;
            }
            lIllIlIllllIIlI.F.add(lIllIlIlllIllll);
            "".length();
            System.out.println("Adding " + Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName() + " to items to loot");
        }
    }
}

