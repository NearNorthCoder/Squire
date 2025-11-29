/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameState
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;

@TaskDesc(name="Teleporting out", priority=8, register=true)
public class z
extends Task {
    private final /* synthetic */ SquireShamansPlugin aH;
    private final /* synthetic */ SquireShamanConfig aI;
    private static final /* synthetic */ Logger aF;
    private static final /* synthetic */ WorldPoint aG;
    private static /* synthetic */ String[] lIIlIlllIlIll;
    private final /* synthetic */ c aJ;
    private static /* synthetic */ int[] lIIlIlllIllII;

    private static boolean lIlIllIllllIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIllIlllIIlll() {
        lIIlIlllIlIll = new String[lIIlIlllIllII[9]];
        z.lIIlIlllIlIll[z.lIIlIlllIllII[1]] = z.lIlIllIlllIIlII("AwY1LSUrAi4idzwHLiE2IQ==", "OoOLW");
        z.lIIlIlllIlIll[z.lIIlIlllIllII[0]] = z.lIlIllIlllIIlIl("2HHJsE62lOqRuocVeKHcdKC42NcBuQybMetvRAO/sp4=", "pLhjS");
        z.lIIlIlllIlIll[z.lIIlIlllIllII[2]] = z.lIlIllIlllIIlII("NgdVHBwYHVlYABYaVRkLHE8RHRgdTg==", "youxy");
        z.lIIlIlllIlIll[z.lIIlIlllIllII[3]] = z.lIlIllIlllIIllI("GOn4Mq3W3DIYjZuwPQXQNfBQC99WFTTad2D3SFem8ls=", "lPpCh");
        z.lIIlIlllIlIll[z.lIIlIlllIllII[4]] = z.lIlIllIlllIIlIl("8likwta6wXU=", "oJOdf");
        z.lIIlIlllIlIll[z.lIIlIlllIllII[5]] = z.lIlIllIlllIIlII("Nh0aKw==", "WsnBA");
        z.lIIlIlllIlIll[z.lIIlIlllIllII[6]] = z.lIlIllIlllIIlII("AzQsKi0=", "GFEDF");
    }

    static {
        z.lIlIllIlllIlllI();
        z.lIlIllIlllIIlll();
        aF = LoggerFactory.getLogger(z.class);
        aG = new WorldPoint(lIIlIlllIllII[7], lIIlIlllIllII[8], lIIlIlllIllII[1]);
    }

    private static String lIlIllIlllIIlII(String llllllllllllllIllllIlIIIIIlIIIlI, String llllllllllllllIllllIlIIIIIIlllII) {
        llllllllllllllIllllIlIIIIIlIIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIIIIIlIIIII = new StringBuilder();
        char[] llllllllllllllIllllIlIIIIIIlllll = llllllllllllllIllllIlIIIIIIlllII.toCharArray();
        int llllllllllllllIllllIlIIIIIIllllI = lIIlIlllIllII[1];
        char[] llllllllllllllIllllIlIIIIIIllIII = llllllllllllllIllllIlIIIIIlIIIlI.toCharArray();
        int llllllllllllllIllllIlIIIIIIlIlll = llllllllllllllIllllIlIIIIIIllIII.length;
        int llllllllllllllIllllIlIIIIIIlIllI = lIIlIlllIllII[1];
        while (z.lIlIllIllllIllI(llllllllllllllIllllIlIIIIIIlIllI, llllllllllllllIllllIlIIIIIIlIlll)) {
            char llllllllllllllIllllIlIIIIIlIIIll = llllllllllllllIllllIlIIIIIIllIII[llllllllllllllIllllIlIIIIIIlIllI];
            llllllllllllllIllllIlIIIIIlIIIII.append((char)(llllllllllllllIllllIlIIIIIlIIIll ^ llllllllllllllIllllIlIIIIIIlllll[llllllllllllllIllllIlIIIIIIllllI % llllllllllllllIllllIlIIIIIIlllll.length]));
            "".length();
            ++llllllllllllllIllllIlIIIIIIllllI;
            ++llllllllllllllIllllIlIIIIIIlIllI;
            "".length();
            if (((0x69 ^ 0x30 ^ (0x2E ^ 0x61)) & (110 + 30 - 133 + 175 ^ 112 + 92 - 140 + 96 ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIlIIIIIlIIIII);
    }

    @Inject
    public z(SquireShamansPlugin squireShamansPlugin, SquireShamanConfig squireShamanConfig, c c2) {
        this.aH = squireShamansPlugin;
        this.aI = squireShamanConfig;
        this.aJ = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_4;
        z llllllllllllllIllllIlIIIIIlllIll;
        String[] stringArray = new String[lIIlIlllIllII[0]];
        stringArray[z.lIIlIlllIllII[1]] = lIIlIlllIlIll[lIIlIlllIllII[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (z.lIlIllIlllIllll(nPC)) {
            this.aH.f(lIIlIlllIllII[1]);
            return lIIlIlllIllII[1];
        }
        Item llllllllllllllIllllIlIIIIIlllIIl = Inventory.getFirst(item -> {
            int n2;
            if (z.lIlIllIllllIIll(item.getName().toLowerCase().contains(lIIlIlllIlIll[lIIlIlllIllII[5]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlIlllIllII[0]];
                stringArray[z.lIIlIlllIllII[1]] = lIIlIlllIlIll[lIIlIlllIllII[6]];
                if (z.lIlIllIllllIIll(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlIlllIllII[0];
                    "".length();
                    if ((0xA6 ^ 0xA2) > 0) return n2 != 0;
                    return ((0x18 ^ 0xE) & ~(0xA4 ^ 0xB2)) != 0;
                }
            }
            n2 = lIIlIlllIllII[1];
            return n2 != 0;
        });
        Item llllllllllllllIllllIlIIIIIlllIII = Inventory.getFirst(item -> item.hasAction(lIIlIlllIlIll[lIIlIlllIllII[4]]::equals));
        if (z.lIlIllIllllIIII(llllllllllllllIllllIlIIIIIlllIII) && z.lIlIllIllllIIII(llllllllllllllIllllIlIIIIIlllIIl) && z.lIlIllIllllIIIl(llllllllllllllIllllIlIIIIIlllIll.aH.i() ? 1 : 0) && z.lIlIllIllllIIlI(Prayers.getPoints())) {
            return lIIlIlllIllII[1];
        }
        Item llllllllllllllIllllIlIIIIIllIlll = Inventory.getFirst(llllllllllllllIllllIlIIIIIlllIll.aI.teleportItem().u());
        if (z.lIlIllIlllIllll(llllllllllllllIllllIlIIIIIllIlll)) {
            return lIIlIlllIllII[1];
        }
        llllllllllllllIllllIlIIIIIlllIll.aH.f(lIIlIlllIllII[0]);
        if (z.lIlIllIllllIIll(llllllllllllllIllllIlIIIIIlllIll.aJ.s() ? 1 : 0) && z.lIlIllIllllIIll(llllllllllllllIllllIlIIIIIlllIll.aI.teleportItem().E() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)aG);
            "".length();
            return lIIlIlllIllII[0];
        }
        this.aI.teleportItem().B().accept((Item)var4_4);
        return lIIlIlllIllII[0];
    }

    private static boolean lIlIllIllllIIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIllIllllIlII(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        z llllllllllllllIllllIlIIIIIllIlII;
        void llllllllllllllIllllIlIIIIIllIIll;
        if (z.lIlIllIllllIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (z.lIlIllIllllIIll(llllllllllllllIllllIlIIIIIllIIll.getMessage().contains(lIIlIlllIlIll[lIIlIlllIllII[0]]) ? 1 : 0)) {
            llllllllllllllIllllIlIIIIIllIlII.aH.e(lIIlIlllIllII[0]);
        }
        if (z.lIlIllIllllIIll(llllllllllllllIllllIlIIIIIllIIll.getMessage().contains(lIIlIlllIlIll[lIIlIlllIllII[2]]) ? 1 : 0)) {
            Log.info((String)lIIlIlllIlIll[lIIlIlllIllII[3]]);
            llllllllllllllIllllIlIIIIIllIlII.aH.forceStop();
        }
    }

    private static String lIlIllIlllIIlIl(String llllllllllllllIllllIIllllllllllI, String llllllllllllllIllllIIlllllllllIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIIIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlllllllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIIIIIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIIIIIIIIIlI.init(lIIlIlllIllII[2], llllllllllllllIllllIlIIIIIIIIIll);
            return new String(llllllllllllllIllllIlIIIIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIIllllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIIIIIIIIIIl) {
            llllllllllllllIllllIlIIIIIIIIIIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (z.lIlIllIllllIlIl(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.aH.f(lIIlIlllIllII[1]);
        }
    }

    private static boolean lIlIllIllllIIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlllIllll(Object object) {
        return object == null;
    }

    private static boolean lIlIllIllllIIII(Object object) {
        return object != null;
    }

    private static String lIlIllIlllIIllI(String llllllllllllllIllllIlIIIIIIIlIll, String llllllllllllllIllllIlIIIIIIIlIlI) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIIIIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lIIlIlllIllII[10]), "DES");
            Cipher llllllllllllllIllllIlIIIIIIIllll = Cipher.getInstance("DES");
            llllllllllllllIllllIlIIIIIIIllll.init(lIIlIlllIllII[2], llllllllllllllIllllIlIIIIIIlIIII);
            return new String(llllllllllllllIllllIlIIIIIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIIIIIIIlllI) {
            llllllllllllllIllllIlIIIIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIllllIIll(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIlllIlllI() {
        lIIlIlllIllII = new int[11];
        z.lIIlIlllIllII[0] = " ".length();
        z.lIIlIlllIllII[1] = (0x29 ^ 0x6C) & ~(0xDB ^ 0x9E);
        z.lIIlIlllIllII[2] = "  ".length();
        z.lIIlIlllIllII[3] = "   ".length();
        z.lIIlIlllIllII[4] = 0x7D ^ 0x3D ^ (0x14 ^ 0x50);
        z.lIIlIlllIllII[5] = 0x51 ^ 0x54;
        z.lIIlIlllIllII[6] = 0x92 ^ 0x94;
        z.lIIlIlllIllII[7] = 0xFFFFE70E & 0x1DFD;
        z.lIIlIlllIllII[8] = -(28 + 22 - 12 + 91) & (0xFFFFBFEE & 0x67FB);
        z.lIIlIlllIllII[9] = 0x3C ^ 0x3B;
        z.lIIlIlllIllII[10] = 0xBF ^ 0xB7;
    }

    private static boolean lIlIllIllllIllI(int n2, int n3) {
        return n2 < n3;
    }
}

