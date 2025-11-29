package gg.squire.basics.loot;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aG;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aH;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aJ;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aK;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aL;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aM;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aN;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aO;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aP;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aQ;
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
@PluginDescriptor(name = "Squire Looter", description = "Loots items", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/loot/SquireLooter.class */
public class SquireLooter extends SquirePlugin {
    @Inject
    /* synthetic */ LooterConfig ew;
    @Inject
    /* synthetic */ aH ev;
    /* synthetic */ WorldPoint eu;
    private static /* synthetic */ int[] llIIlIIlI;
    private static /* synthetic */ String[] llIIlIIIl;
    /* synthetic */ Actor et;
    /* synthetic */ WorldPoint ep;
    /* synthetic */ Instant es;
    /* synthetic */ List<aH> F = new ArrayList();
    /* synthetic */ List<aH> eq = new ArrayList();
    /* synthetic */ List<aH> er = new ArrayList();
    private /* synthetic */ List<Integer> ex = new ArrayList();

    public void a(Actor actor) {
        this.et = actor;
    }

    private static boolean lIlIlllllII(int i2, int i3) {
        return i2 < i3;
    }

    public WorldPoint cj() {
        return this.eu;
    }

    private static String lIlIlllIlII(String lIllIlIlIlIllIl, String lIllIlIlIlIllII) {
        try {
            SecretKeySpec lIllIlIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIlIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIIlI[3], lIllIlIlIllIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIllIlIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIlIlIlIlllI) {
            lIllIlIlIlIlllI.printStackTrace();
            return null;
        }
    }

    public List<aH> cg() {
        return this.eq;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llIIlIIlI[0]];
        clsArr[llIIlIIlI[1]] = aK.class;
        clsArr[llIIlIIlI[2]] = aN.class;
        clsArr[llIIlIIlI[3]] = aO.class;
        clsArr[llIIlIIlI[4]] = aL.class;
        clsArr[llIIlIIlI[5]] = aM.class;
        clsArr[llIIlIIlI[6]] = aP.class;
        clsArr[llIIlIIlI[7]] = aQ.class;
        clsArr[llIIlIIlI[8]] = aJ.class;
        return clsArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean y(int i2) {
        int[] ce = ce();
        int length = ce.length;
        int i3 = llIIlIIlI[1];
        while (lIlIlllllII(i3, length)) {
            if (lIlIlllllIl(ce[i3], i2)) {
                return llIIlIIlI[2];
            }
            i3++;
            "".length();
            if ((87 ^ 83) <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIIlIIlI[1];
    }

    private static boolean lIlIlllIlll(Object obj, Object obj2) {
        return obj != obj2;
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
        lIlIlllIllI();
        lIlIlllIlIl();
    }

    private static boolean lIlIllllIIl(int i2) {
        return i2 == 0;
    }

    private static void lIlIlllIlIl() {
        llIIlIIIl = new String[llIIlIIlI[0]];
        llIIlIIIl[llIIlIIlI[1]] = lIlIlllIIlI("pf6dc19nRe8=", "vdAml");
        llIIlIIIl[llIIlIIlI[2]] = lIlIlllIIll("CRgcMwQ=", "hktVw");
        llIIlIIIl[llIIlIIlI[3]] = lIlIlllIIll("AzgBJz0=", "DJhJD");
        llIIlIIIl[llIIlIIlI[4]] = lIlIlllIIll("OhEbEg==", "Rtzvm");
        llIIlIIIl[llIIlIIlI[5]] = lIlIlllIlII("nN7hyOqv1ak=", "qFsFX");
        llIIlIIIl[llIIlIIlI[6]] = lIlIlllIIll("GB0qPDg=", "zrDYK");
        llIIlIIIl[llIIlIIlI[7]] = lIlIlllIlII("S3gn/MlpHKI=", "Knaot");
        llIIlIIIl[llIIlIIlI[8]] = lIlIlllIIll("eQ==", "UJzdd");
    }

    private static boolean lIlIllllIII(Object obj) {
        return obj == null;
    }

    public void e(List<aH> list) {
        this.er = list;
    }

    @Provides
    LooterConfig n(ConfigManager configManager) {
        return (LooterConfig) configManager.getConfig(LooterConfig.class);
    }

    private static String lIlIlllIIlI(String lIllIlIlIlIIIII, String lIllIlIlIIlllIl) {
        try {
            SecretKeySpec lIllIlIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIlIIlllIl.getBytes(StandardCharsets.UTF_8)), llIIlIIlI[0]), "DES");
            Cipher lIllIlIlIlIIIlI = Cipher.getInstance("DES");
            lIllIlIlIlIIIlI.init(llIIlIIlI[3], lIllIlIlIlIIIll);
            return new String(lIllIlIlIlIIIlI.doFinal(Base64.getDecoder().decode(lIllIlIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIlIlIlIIIIl) {
            lIllIlIlIlIIIIl.printStackTrace();
            return null;
        }
    }

    public List<aH> p() {
        return this.F;
    }

    private static void lIlIlllIllI() {
        llIIlIIlI = new int[10];
        llIIlIIlI[0] = 128 ^ 136;
        llIIlIIlI[1] = ((56 ^ 69) ^ (187 ^ 150)) & (((((202 + 65) - 265) + 209) ^ (((35 + 116) - 86) + 66)) ^ (-" ".length()));
        llIIlIIlI[2] = " ".length();
        llIIlIIlI[3] = "  ".length();
        llIIlIIlI[4] = "   ".length();
        llIIlIIlI[5] = (((106 + 17) - 45) + 60) ^ (((132 + 35) - 29) + 4);
        llIIlIIlI[6] = 117 ^ 112;
        llIIlIIlI[7] = (((41 + 136) - 28) + 21) ^ (((151 + 12) - 121) + 130);
        llIIlIIlI[8] = 12 ^ 11;
        llIIlIIlI[9] = (((69 + 62) - 67) + 81) ^ (((89 + 96) - 99) + 71);
    }

    private int[] ce() {
        if (lIlIllllIll(this.ew.custom().isEmpty() ? 1 : 0)) {
            return new int[llIIlIIlI[1]];
        }
        String[] split = this.ew.custom().split(llIIlIIIl[llIIlIIlI[8]]);
        int[] iArr = new int[split.length];
        int i2 = llIIlIIlI[1];
        while (lIlIlllllII(i2, split.length)) {
            iArr[i2] = Integer.parseInt(split[i2].trim());
            i2++;
            "".length();
            if ((((((45 + 133) - 177) + 151) ^ (((28 + 80) - 53) + 82)) & (((254 ^ 196) ^ (133 ^ 174)) ^ (-" ".length()))) >= "   ".length()) {
                return null;
            }
        }
        return iArr;
    }

    protected void onStart() {
        if (lIlIlllIlll(Game.getState(), GameState.LOGGED_IN)) {
            return;
        }
        this.ep = Players.getLocal().getWorldLocation();
        Actor interacting = Players.getLocal().getInteracting();
        if (lIlIllllIII(interacting)) {
            return;
        }
        a(interacting);
    }

    public WorldPoint cf() {
        return this.ep;
    }

    private static boolean lIlIllllIlI(int i2, int i3) {
        return i2 > i3;
    }

    public void a(List<aH> list) {
        this.F = list;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        npcLootReceived.getItems().forEach(itemStack -> {
            this.ex.add(Integer.valueOf(itemStack.getId()));
            "".length();
        });
    }

    public void j(WorldPoint worldPoint) {
        this.ep = worldPoint;
    }

    private static boolean lIlIlllllIl(int i2, int i3) {
        return i2 == i3;
    }

    @Subscribe
    private void a(ItemDespawned itemDespawned) {
        int id = itemDespawned.getItem().getId();
        this.F.removeIf(aHVar -> {
            if (lIlIlllllIl(id, aHVar.P()) && lIlIllllIll(itemDespawned.getItem().getWorldLocation().equals(aHVar.cd()) ? 1 : 0)) {
                ?? r0 = llIIlIIlI[2];
                "".length();
                return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIIlI[1];
        });
        "".length();
        if (lIlIllllIll(this.ex.contains(Integer.valueOf(id)) ? 1 : 0)) {
            this.ex.remove(this.ex.lastIndexOf(Integer.valueOf(id)));
            "".length();
        }
    }

    private static boolean lIlIllllIll(int i2) {
        return i2 != 0;
    }

    private static String lIlIlllIIll(String lIllIlIllIIIIlI, String lIllIlIllIIIIIl) {
        String lIllIlIllIIIIlI2 = new String(Base64.getDecoder().decode(lIllIlIllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIllIlIllIIIIIl.toCharArray();
        int lIllIlIlIlllllI = llIIlIIlI[1];
        char[] charArray2 = lIllIlIllIIIIlI2.toCharArray();
        int length = charArray2.length;
        int i2 = llIIlIIlI[1];
        while (lIlIlllllII(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[lIllIlIlIlllllI % charArray.length]));
            "".length();
            lIllIlIlIlllllI++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        TileItem item = itemSpawned.getItem();
        if (lIlIllllIIl(item.canPickup() ? 1 : 0) || lIlIllllIIl(Reachable.isInteractable(item) ? 1 : 0) || lIlIllllIlI(item.distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlI[9])) {
            return;
        }
        aH aHVar = new aH();
        aHVar.f(item.getId());
        aHVar.i(item.getWorldLocation());
        String name = Static.getClient().getItemDefinition(item.getId()).getName();
        boolean isStackable = Static.getClient().getItemDefinition(item.getId()).isStackable();
        if (lIlIllllIIl(this.ew.lootBones() ? 1 : 0) && (lIlIllllIll(name.toLowerCase().contains(llIIlIIIl[llIIlIIlI[1]]) ? 1 : 0) || lIlIllllIll(name.contains(llIIlIIIl[llIIlIIlI[2]]) ? 1 : 0))) {
            return;
        }
        if (lIlIllllIll(y(item.getId()) ? 1 : 0)) {
            this.F.add(aHVar);
            "".length();
            return;
        }
        if (lIlIllllIll(this.ew.lootStackable() ? 1 : 0)) {
            int[] iArr = new int[llIIlIIlI[2]];
            iArr[llIIlIIlI[1]] = aHVar.P();
            if (lIlIllllIll(Inventory.contains(iArr) ? 1 : 0) && lIlIllllIll(isStackable ? 1 : 0)) {
                System.out.println("Adding stackable item " + Static.getClient().getItemDefinition(aHVar.P()).getName() + " to items to loot");
                this.F.add(aHVar);
                "".length();
            }
        }
        if (lIlIllllIll(Static.getClient().getItemDefinition(aHVar.P()).getName().contains(llIIlIIIl[llIIlIIlI[3]]) ? 1 : 0)) {
            if (lIlIllllIll(this.ew.herbsToLoot().contains(aG.x(item.getId())) ? 1 : 0)) {
                this.eq.add(aHVar);
                "".length();
                System.out.println("Adding " + Static.getClient().getItemDefinition(aHVar.P()).getName() + " to herbs to loot");
                "".length();
                if ((-" ".length()) == ((121 ^ 114) ^ (56 ^ 55))) {
                }
            }
        } else if (lIlIllllIll(Static.getClient().getItemDefinition(aHVar.P()).getName().contains(llIIlIIIl[llIIlIIlI[4]]) ? 1 : 0)) {
            if (lIlIllllIll(this.ew.lootHeads() ? 1 : 0)) {
                this.er.add(aHVar);
                "".length();
                System.out.println("Adding " + Static.getClient().getItemDefinition(aHVar.P()).getName() + " to heads to loot");
                "".length();
                if (0 != 0) {
                }
            }
        } else if (lIlIlllllII(Prices.getItemPrice(item.getId()) * item.getQuantity(), this.ew.lootValue()) && lIlIllllIIl(Static.getClient().getItemDefinition(item.getId()).getName().contains(llIIlIIIl[llIIlIIlI[5]]) ? 1 : 0) && lIlIllllIIl(Static.getClient().getItemDefinition(item.getId()).getName().toLowerCase().contains(llIIlIIIl[llIIlIIlI[6]]) ? 1 : 0) && lIlIllllIIl(Static.getClient().getItemDefinition(item.getId()).getName().contains(llIIlIIIl[llIIlIIlI[7]]) ? 1 : 0)) {
        } else {
            this.F.add(aHVar);
            "".length();
            System.out.println("Adding " + Static.getClient().getItemDefinition(aHVar.P()).getName() + " to items to loot");
        }
    }
}
