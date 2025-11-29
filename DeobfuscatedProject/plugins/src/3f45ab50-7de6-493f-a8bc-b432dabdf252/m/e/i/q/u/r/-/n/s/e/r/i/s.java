/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.ExperienceGained
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Dialog
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.mining.SquireMiner;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.i.q.u.r.-.n.s.e.r.i.a;
import m.e.i.q.u.r.-.n.s.e.r.i.c;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Mining", register=true)
public class s
extends Task {
    private /* synthetic */ boolean C;
    private static /* synthetic */ String[] lllllIllIIIl;
    private final /* synthetic */ int[] z;
    private /* synthetic */ int A;
    private static /* synthetic */ int[] lllllIllIIlI;
    private /* synthetic */ boolean B;
    private final /* synthetic */ SquireMinerConfig y;
    private final /* synthetic */ SquireMiner x;

    private static boolean lIIlIIllllllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIIllllllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIIlllllIIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIIlllllllII(Object object, Object object2) {
        return object == object2;
    }

    private WorldPoint s() {
        return Players.getLocal().getWorldLocation();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIIlIIlIIIlIllIlll;
        String string = chatMessage.getMessage();
        if (s.lIIlIIlllllIlII(string.contains(lllllIllIIIl[lllllIllIIlI[27]]) ? 1 : 0)) {
            this.B = lllllIllIIlI[3];
            if (s.lIIlIIlllllIlII(Movement.isRunEnabled() ? 1 : 0)) {
                this.sleep(lllllIllIIlI[3]);
                "".length();
                if (((158 + 108 - 91 + 68 ^ 35 + 114 - 76 + 96) & (176 + 177 - 235 + 122 ^ 66 + 74 - 35 + 65 ^ -" ".length())) < 0) {
                    return;
                }
            } else {
                s lllllllllllllllIIlIIlIIIlIlllIIl;
                lllllllllllllllIIlIIlIIIlIlllIIl.sleep(lllllIllIIlI[5]);
            }
        }
        if (s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIlIllIlll.contains(lllllIllIIIl[lllllIllIIlI[28]]) ? 1 : 0)) {
            lllllllllllllllIIlIIlIIIlIlllIIl.C = lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIlIllIlll.contains(lllllIllIIIl[lllllIllIIlI[29]]) ? 1 : 0)) {
            lllllllllllllllIIlIIlIIIlIlllIIl.C = lllllIllIIlI[3];
        }
    }

    public boolean run() {
        s lllllllllllllllIIlIIlIIIllIIlIlI;
        if (s.lIIlIIlllllIIll((Object)this.y.activity(), (Object)a.GRANITE)) {
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIllIIlIlI.y.waterskins()) && s.lIIlIIlllllIlIl(Inventory.contains((int[])lllllllllllllllIIlIIlIIIllIIlIlI.z) ? 1 : 0)) {
            int[] nArray = new int[lllllIllIIlI[3]];
            nArray[s.lllllIllIIlI[1]] = lllllIllIIlI[9];
            if (s.lIIlIIlllllIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                System.out.println(lllllIllIIIl[lllllIllIIlI[1]]);
                return lllllIllIIlI[1];
            }
        }
        int[] nArray = new int[lllllIllIIlI[3]];
        nArray[s.lllllIllIIlI[1]] = lllllIllIIlI[2];
        if (s.lIIlIIlllllIllI(Inventory.getCount((int[])nArray), lllllllllllllllIIlIIlIIIllIIlIlI.y.waterskins())) {
            int[] nArray2 = new int[lllllIllIIlI[3]];
            nArray2[s.lllllIllIIlI[1]] = lllllIllIIlI[2];
            Inventory.getFirst((int[])nArray2).interact(lllllIllIIIl[lllllIllIIlI[3]]);
            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlll(Inventory.getFreeSlots(), lllllIllIIlI[5]) && s.lIIlIIlllllIlII(Inventory.contains(item -> item.getName().contains(lllllIllIIIl[lllllIllIIlI[30]])) ? 1 : 0)) {
            Inventory.dropAll(item -> item.getName().contains(lllllIllIIIl[lllllIllIIlI[10]]));
            "".length();
        }
        if (s.lIIlIIlllllIlIl(Movement.isRunEnabled() ? 1 : 0) && s.lIIlIIlllllIllI(Movement.getRunEnergy(), lllllIllIIlI[10])) {
            Movement.toggleRun();
            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lllllIllIIlI[1];
        }
        Player lllllllllllllllIIlIIlIIIllIIlIIl = Players.getLocal();
        if (s.lIIlIIllllllIII(lllllllllllllllIIlIIlIIIllIIlIIl)) {
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIllllllIIl(lllllllllllllllIIlIIlIIIllIIlIlI.A, lllllIllIIlI[11]) && s.lIIlIIlllllIlll(lllllllllllllllIIlIIlIIIllIIlIIl.distanceTo(c.SOUTH_FOUR.d()), lllllIllIIlI[12])) {
            Log.info((String)lllllIllIIIl[lllllIllIIlI[5]]);
            lllllllllllllllIIlIIlIIIllIIlIlI.C = lllllIllIIlI[3];
        }
        if (!s.lIIlIIlllllIlIl(Inventory.isFull() ? 1 : 0) || s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIllIIlIIl.isAnimating() ? 1 : 0) && s.lIIlIIlllllIlIl(lllllllllllllllIIlIIlIIIllIIlIlI.a(lllllllllllllllIIlIIlIIIllIIlIIl) ? 1 : 0)) {
            return lllllIllIIlI[1];
        }
        int[] nArray3 = new int[lllllIllIIlI[3]];
        nArray3[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List lllllllllllllllIIlIIlIIIllIIlIII = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[14], lllllIllIIlI[1]), (int[])nArray3);
        int[] nArray4 = new int[lllllIllIIlI[3]];
        nArray4[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List lllllllllllllllIIlIIlIIIllIIIlll = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[16], lllllIllIIlI[1]), (int[])nArray4);
        int[] nArray5 = new int[lllllIllIIlI[3]];
        nArray5[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List lllllllllllllllIIlIIlIIIllIIIllI = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[13], lllllIllIIlI[17], lllllIllIIlI[1]), (int[])nArray5);
        int[] nArray6 = new int[lllllIllIIlI[3]];
        nArray6[s.lllllIllIIlI[1]] = lllllIllIIlI[15];
        List lllllllllllllllIIlIIlIIIllIIIlIl = TileObjects.getAt((WorldPoint)new WorldPoint(lllllIllIIlI[18], lllllIllIIlI[19], lllllIllIIlI[1]), (int[])nArray6);
        TileObject lllllllllllllllIIlIIlIIIllIIIlII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (s.lIIlIIllllllIlI(tileObject.getId(), lllllIllIIlI[15]) && s.lIIlIIlllllIlII(c.SOUTH_FOUR.a(tileObject.getWorldLocation()) ? 1 : 0)) {
                n2 = lllllIllIIlI[3];
                "".length();
                if (-"  ".length() >= 0) {
                    return ((0xEB ^ 0xA5) & ~(0xF7 ^ 0xB9)) != 0;
                }
            } else {
                n2 = lllllIllIIlI[1];
            }
            return n2 != 0;
        });
        if (s.lIIlIIllllllIII(lllllllllllllllIIlIIlIIIllIIIlII)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIllIIlI[20], lllllIllIIlI[21], lllllIllIIlI[1]));
            "".length();
            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlIl(Reachable.isInteractable((Locatable)lllllllllllllllIIlIIlIIIllIIIlII) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lllllIllIIlI[20], lllllIllIIlI[21], lllllIllIIlI[1]));
            "".length();
            return lllllIllIIlI[3];
        }
        if (s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIllIIlIlI.C ? 1 : 0) && s.lIIlIIlllllIlII(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lllllIllIIlI[1];
        }
        WorldPoint lllllllllllllllIIlIIlIIIllIIIIll = new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[14], lllllIllIIlI[1]);
        if (s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIllIIlIlI.s().equals((Object)lllllllllllllllIIlIIlIIIllIIIIll) ? 1 : 0) && !s.lIIlIIlllllIlIl(lllllllllllllllIIlIIlIIIllIIlIlI.B ? 1 : 0) || !s.lIIlIIlllllIlIl(lllllllllllllllIIlIIlIIIllIIlIlI.C ? 1 : 0) || s.lIIlIIlllllIllI(lllllllllllllllIIlIIlIIIllIIIIll.distanceTo2D(lllllllllllllllIIlIIlIIIllIIlIlI.s()), lllllIllIIlI[11])) {
            lllllllllllllllIIlIIlIIIllIIlIlI.sleep(lllllIllIIlI[23]);
            lllllllllllllllIIlIIlIIIllIIlIlI.B = lllllIllIIlI[1];
            lllllllllllllllIIlIIlIIIllIIlIlI.x.a();
            ((TileObject)lllllllllllllllIIlIIlIIIllIIIlll.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[7]]);
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIllIIlIlI.s().equals((Object)new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[16], lllllIllIIlI[1])) ? 1 : 0) && s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIllIIlIlI.B ? 1 : 0)) {
            lllllllllllllllIIlIIlIIIllIIlIlI.B = lllllIllIIlI[1];
            lllllllllllllllIIlIIlIIIllIIlIlI.C = lllllIllIIlI[1];
            lllllllllllllllIIlIIlIIIllIIlIlI.x.a();
            ((TileObject)lllllllllllllllIIlIIlIIIllIIIllI.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[0]]);
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIllIIlIlI.s().equals((Object)new WorldPoint(lllllIllIIlI[22], lllllIllIIlI[17], lllllIllIIlI[1])) ? 1 : 0) && s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIllIIlIlI.B ? 1 : 0)) {
            lllllllllllllllIIlIIlIIIllIIlIlI.B = lllllIllIIlI[1];
            lllllllllllllllIIlIIlIIIllIIlIlI.C = lllllIllIIlI[1];
            lllllllllllllllIIlIIlIIIllIIlIlI.x.a();
            ((TileObject)lllllllllllllllIIlIIlIIIllIIIlIl.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[23]]);
            return lllllIllIIlI[1];
        }
        if (s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIllIIlIlI.s().equals((Object)new WorldPoint(lllllIllIIlI[18], lllllIllIIlI[17], lllllIllIIlI[1])) ? 1 : 0) && s.lIIlIIlllllIlII(lllllllllllllllIIlIIlIIIllIIlIlI.B ? 1 : 0)) {
            lllllllllllllllIIlIIlIIIllIIlIlI.B = lllllIllIIlI[1];
            lllllllllllllllIIlIIlIIIllIIlIlI.C = lllllIllIIlI[1];
            lllllllllllllllIIlIIlIIIllIIlIlI.x.a();
            ((TileObject)lllllllllllllllIIlIIlIIIllIIlIII.get(lllllIllIIlI[1])).interact(lllllIllIIIl[lllllIllIIlI[24]]);
            return lllllIllIIlI[1];
        }
        return lllllIllIIlI[3];
    }

    private static boolean lIIlIIllllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIlIIlllIIlIll() {
        lllllIllIIIl = new String[lllllIllIIlI[11]];
        s.lllllIllIIIl[s.lllllIllIIlI[1]] = s.lIIlIIlllIIlIII("XuFJ5LQCgdlPkoaK43GGzxnHKQHV9okRK95kpgl5Rde/lABNc9QoBQjwAg2MrMmY29OXblVLyTb8LL/UBXCY346BxsgruXLZPdgF6zE3FIY=", "twBUM");
        s.lllllIllIIIl[s.lllllIllIIlI[3]] = s.lIIlIIlllIIlIIl("BiopJA==", "BXFTt");
        s.lllllIllIIIl[s.lllllIllIIlI[5]] = s.lIIlIIlllIIlIIl("GAo+OTQxQ3lqMiwAIS8idQojajB1ESI9fXURKDk0IRckJDZ7", "UcMJQ");
        s.lllllIllIIIl[s.lllllIllIIlI[7]] = s.lIIlIIlllIIlIlI("GvAH7YTRLk4=", "mZSWd");
        s.lllllIllIIIl[s.lllllIllIIlI[0]] = s.lIIlIIlllIIlIlI("HRZCv20C7MY=", "QhXyh");
        s.lllllIllIIIl[s.lllllIllIIlI[23]] = s.lIIlIIlllIIlIlI("l/A/mehUWMs=", "ssFyi");
        s.lllllIllIIIl[s.lllllIllIIlI[24]] = s.lIIlIIlllIIlIII("f7MGKb3GTyw=", "CLWtF");
        s.lllllIllIIIl[s.lllllIllIIlI[27]] = s.lIIlIIlllIIlIII("uAa6CyRuCMYgpdQPTm/oA04siAbsiw5XWqDt6ScqI5OgaMw+wlO1Sw==", "OpFyR");
        s.lllllIllIIIl[s.lllllIllIIlI[28]] = s.lIIlIIlllIIlIIl("CCgQQR4wKQQGFnEzCkECJCYXEwpxNAoMFnEgFwAdODMATw==", "QGeas");
        s.lllllIllIIIl[s.lllllIllIIlI[29]] = s.lIIlIIlllIIlIlI("aD7c7zdeSfD65LzyGW2PiA==", "TxFCZ");
        s.lllllIllIIIl[s.lllllIllIIlI[10]] = s.lIIlIIlllIIlIIl("Dj8xJRs9KA==", "IMPKr");
        s.lllllIllIIIl[s.lllllIllIIlI[30]] = s.lIIlIIlllIIlIlI("gv32LC9opBg=", "dBbyB");
    }

    private boolean a(Player player) {
        boolean bl;
        if (!s.lIIlIIllllllIlI(player.getAnimation(), lllllIllIIlI[25]) || s.lIIlIIllllllIll(player.getAnimation(), lllllIllIIlI[26])) {
            bl = lllllIllIIlI[3];
            "".length();
            if ("  ".length() <= 0) {
                return ((12 + 64 - -34 + 22 ^ 149 + 136 - 280 + 167) & (133 + 76 - 55 + 30 ^ 137 + 22 - 122 + 107 ^ -" ".length())) != 0;
            }
        } else {
            bl = lllllIllIIlI[1];
        }
        return bl;
    }

    private static boolean lIIlIIlllllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIIlllllllIl(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.A += lllllIllIIlI[3];
    }

    private static boolean lIIlIIlllllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIlIIlllIIlIlI(String lllllllllllllllIIlIIlIIIlIlIllIl, String lllllllllllllllIIlIIlIIIlIlIlIlI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlIIIlIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlIIIlIlIllll.init(lllllIllIIlI[5], lllllllllllllllIIlIIlIIIlIllIIII);
            return new String(lllllllllllllllIIlIIlIIIlIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIIIlIlIlllI) {
            lllllllllllllllIIlIIlIIIlIlIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlllIIlIII(String lllllllllllllllIIlIIlIIIlIIllllI, String lllllllllllllllIIlIIlIIIlIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlIIIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), lllllIllIIlI[28]), "DES");
            Cipher lllllllllllllllIIlIIlIIIlIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIlIIIlIlIIIlI.init(lllllIllIIlI[5], lllllllllllllllIIlIIlIIIlIlIIIll);
            return new String(lllllllllllllllIIlIIlIIIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlIIIlIlIIIIl) {
            lllllllllllllllIIlIIlIIIlIlIIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlllIIlIIl(String lllllllllllllllIIlIIlIIIlIIlIIII, String lllllllllllllllIIlIIlIIIlIIIlIlI) {
        lllllllllllllllIIlIIlIIIlIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlIIIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlIIIlIIIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIIlIIIlIIIllIl = lllllllllllllllIIlIIlIIIlIIIlIlI.toCharArray();
        int lllllllllllllllIIlIIlIIIlIIIllII = lllllIllIIlI[1];
        char[] lllllllllllllllIIlIIlIIIlIIIIllI = lllllllllllllllIIlIIlIIIlIIlIIII.toCharArray();
        int lllllllllllllllIIlIIlIIIlIIIIlIl = lllllllllllllllIIlIIlIIIlIIIIllI.length;
        int lllllllllllllllIIlIIlIIIlIIIIlII = lllllIllIIlI[1];
        while (s.lIIlIIlllllllIl(lllllllllllllllIIlIIlIIIlIIIIlII, lllllllllllllllIIlIIlIIIlIIIIlIl)) {
            char lllllllllllllllIIlIIlIIIlIIlIIIl = lllllllllllllllIIlIIlIIIlIIIIllI[lllllllllllllllIIlIIlIIIlIIIIlII];
            lllllllllllllllIIlIIlIIIlIIIlllI.append((char)(lllllllllllllllIIlIIlIIIlIIlIIIl ^ lllllllllllllllIIlIIlIIIlIIIllIl[lllllllllllllllIIlIIlIIIlIIIllII % lllllllllllllllIIlIIlIIIlIIIllIl.length]));
            "".length();
            ++lllllllllllllllIIlIIlIIIlIIIllII;
            ++lllllllllllllllIIlIIlIIIlIIIIlII;
            "".length();
            if (((0x40 ^ 0x5E) & ~(0x1D ^ 3)) == ((0xBE ^ 0x87) & ~(0x26 ^ 0x1F))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIlIIIlIIIlllI);
    }

    private static boolean lIIlIIlllllIlIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public s(SquireMiner squireMiner, SquireMinerConfig squireMinerConfig) {
        int[] nArray = new int[lllllIllIIlI[0]];
        nArray[s.lllllIllIIlI[1]] = lllllIllIIlI[2];
        nArray[s.lllllIllIIlI[3]] = lllllIllIIlI[4];
        nArray[s.lllllIllIIlI[5]] = lllllIllIIlI[6];
        nArray[s.lllllIllIIlI[7]] = lllllIllIIlI[8];
        this.z = nArray;
        this.A = lllllIllIIlI[1];
        this.C = lllllIllIIlI[3];
        this.x = squireMiner;
        this.y = squireMinerConfig;
    }

    private static boolean lIIlIIlllllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        s.lIIlIIlllllIIlI();
        s.lIIlIIlllIIlIll();
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (s.lIIlIIlllllllII(experienceGained.getSkill(), Skill.MINING)) {
            this.A = lllllIllIIlI[1];
        }
    }

    private static boolean lIIlIIllllllIII(Object object) {
        return object == null;
    }

    private static void lIIlIIlllllIIlI() {
        lllllIllIIlI = new int[31];
        s.lllllIllIIlI[0] = 0x49 ^ 0x4D;
        s.lllllIllIIlI[1] = (0x91 ^ 0x80) & ~(0x87 ^ 0x96);
        s.lllllIllIIlI[2] = -(0xFFFFDEF9 & 0x6147) & (0xFFFFEF7F & 0x57DF);
        s.lllllIllIIlI[3] = " ".length();
        s.lllllIllIIlI[4] = 0xFFFFB761 & 0x4FBF;
        s.lllllIllIIlI[5] = "  ".length();
        s.lllllIllIIlI[6] = -(0xFFFFE85D & 0x7FB7) & (0xFFFFFF37 & 0x6FFF);
        s.lllllIllIIlI[7] = "   ".length();
        s.lllllIllIIlI[8] = 0xFFFF8F37 & 0x77ED;
        s.lllllIllIIlI[9] = -(0xFFFF86F7 & 0x7DAF) & (0xFFFFEFFF & 0x7DFF);
        s.lllllIllIIlI[10] = 0x65 ^ 0x6F;
        s.lllllIllIIlI[11] = 1 ^ 0xD;
        s.lllllIllIIlI[12] = 66 + 94 - 35 + 22 ^ 83 + 26 - 6 + 53;
        s.lllllIllIIlI[13] = 0xFFFF9EDF & 0x6D7D;
        s.lllllIllIIlI[14] = 0xFFFF9B7E & 0x6FDD;
        s.lllllIllIIlI[15] = 0xFFFFECFF & 0x3F7B;
        s.lllllIllIIlI[16] = -(0xFFFFF4A3 & 0x2F7F) & (0xFFFFFF7F & 0x2FFF);
        s.lllllIllIIlI[17] = -(0xFFFFFDB7 & 0x726A) & (0xFFFFFFFF & 0x7B7F);
        s.lllllIllIIlI[18] = -" ".length() & (0xFFFFFCDF & 0xF7F);
        s.lllllIllIIlI[19] = -(0xFFFF9565 & 0x7EBB) & (0xFFFFFF7F & 0x1FFF);
        s.lllllIllIIlI[20] = -(0xFFFFE6FF & 0x5B91) & (0xFFFFCEF1 & 0x7FFE);
        s.lllllIllIIlI[21] = -(0x19 ^ 6) & (0xFFFF9F7E & 0x6BFF);
        s.lllllIllIIlI[22] = 0xFFFFFF7E & 0xCDF;
        s.lllllIllIIlI[23] = 0x4C ^ 0x49;
        s.lllllIllIIlI[24] = 78 + 145 - 169 + 107 ^ 31 + 49 - 76 + 163;
        s.lllllIllIIlI[25] = 0xFFFFDCB7 & 0x37C9;
        s.lllllIllIIlI[26] = -(0xFFFFB99F & 0x6F78) & (0xFFFFEDFF & 0x3FF7);
        s.lllllIllIIlI[27] = 0x42 ^ 0x45;
        s.lllllIllIIlI[28] = 0x34 ^ 0x3C;
        s.lllllIllIIlI[29] = 0xBE ^ 0xB7;
        s.lllllIllIIlI[30] = "   ".length() ^ (0xCC ^ 0xC4);
    }
}

