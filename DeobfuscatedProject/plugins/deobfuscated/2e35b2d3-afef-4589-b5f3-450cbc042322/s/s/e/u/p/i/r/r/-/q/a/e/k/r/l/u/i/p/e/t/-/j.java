/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.util.Text
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.a;

@TaskDesc(name="Getting Hunting Task", priority=10, register=true, blocking=true)
public class j
extends Task {
    private final /* synthetic */ SquireSkipperPlugin E;
    private final /* synthetic */ SquireSkipperConfig D;
    private static /* synthetic */ int[] lIlIIlIlIIIIl;
    private static /* synthetic */ String[] lIlIIlIlIIIII;

    private static String lIlllIlIllIllII(String llllllllllllllIllIlllIIlllIlIIIl, String llllllllllllllIllIlllIIlllIIlIll) {
        llllllllllllllIllIlllIIlllIlIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIIlllIIllll = new StringBuilder();
        char[] llllllllllllllIllIlllIIlllIIlllI = llllllllllllllIllIlllIIlllIIlIll.toCharArray();
        int llllllllllllllIllIlllIIlllIIllIl = lIlIIlIlIIIIl[0];
        char[] llllllllllllllIllIlllIIlllIIIlll = llllllllllllllIllIlllIIlllIlIIIl.toCharArray();
        int llllllllllllllIllIlllIIlllIIIllI = llllllllllllllIllIlllIIlllIIIlll.length;
        int llllllllllllllIllIlllIIlllIIIlIl = lIlIIlIlIIIIl[0];
        while (j.lIlllIlIlllIIll(llllllllllllllIllIlllIIlllIIIlIl, llllllllllllllIllIlllIIlllIIIllI)) {
            char llllllllllllllIllIlllIIlllIlIIlI = llllllllllllllIllIlllIIlllIIIlll[llllllllllllllIllIlllIIlllIIIlIl];
            llllllllllllllIllIlllIIlllIIllll.append((char)(llllllllllllllIllIlllIIlllIlIIlI ^ llllllllllllllIllIlllIIlllIIlllI[llllllllllllllIllIlllIIlllIIllIl % llllllllllllllIllIlllIIlllIIlllI.length]));
            0;
            ++llllllllllllllIllIlllIIlllIIllIl;
            ++llllllllllllllIllIlllIIlllIIIlIl;
            0;
            if (2 != -1) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlllIIlllIIllll);
    }

    private static boolean lIlllIlIlllIIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public j(SquireSkipperConfig squireSkipperConfig, SquireSkipperPlugin squireSkipperPlugin) {
        this.D = squireSkipperConfig;
        this.E = squireSkipperPlugin;
    }

    private static boolean lIlllIlIlllIIlI(int n2) {
        return n2 != 0;
    }

    private static String lIlllIlIllIllIl(String llllllllllllllIllIlllIIllIllllII, String llllllllllllllIllIlllIIllIlllIll) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIllIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlllIIllIlllllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlllIIllIlllllI.init(lIlIIlIlIIIIl[3], llllllllllllllIllIlllIIllIllllll);
            return new String(llllllllllllllIllIlllIIllIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIIllIllllIl) {
            llllllllllllllIllIlllIIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIllIlIll(String llllllllllllllIllIlllIIllllIIIIl, String llllllllllllllIllIlllIIllllIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIllllIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIIIIl[8]), "DES");
            Cipher llllllllllllllIllIlllIIllllIIIll = Cipher.getInstance("DES");
            llllllllllllllIllIlllIIllllIIIll.init(lIlIIlIlIIIIl[3], llllllllllllllIllIlllIIllllIIlII);
            return new String(llllllllllllllIllIlllIIllllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlllIIllllIIIlI) {
            llllllllllllllIllIlllIIllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlllIIII(int n2) {
        return n2 == 0;
    }

    private static void lIlllIlIllIllll() {
        lIlIIlIlIIIIl = new int[9];
        j.lIlIIlIlIIIIl[0] = (12 + 139 - -30 + 0 ^ 81 + 92 - 117 + 98) & (114 + 60 - 142 + 97 ^ 125 + 114 - 170 + 105 ^ -1);
        j.lIlIIlIlIIIIl[1] = 1;
        j.lIlIIlIlIIIIl[2] = 0x51 ^ 0x55;
        j.lIlIIlIlIIIIl[3] = 2;
        j.lIlIIlIlIIIIl[4] = 3;
        j.lIlIIlIlIIIIl[5] = 91 + 46 - 45 + 56 ^ 101 + 82 - 91 + 53;
        j.lIlIIlIlIIIIl[6] = 0x61 ^ 0x67;
        j.lIlIIlIlIIIIl[7] = 24 + 83 - 66 + 101 ^ 70 + 120 - 90 + 37;
        j.lIlIIlIlIIIIl[8] = (0x1D ^ 0xF) & ~(0x67 ^ 0x75) ^ (0x27 ^ 0x2F);
    }

    /*
     * WARNING - void declaration
     */
    public boolean j(String string) {
        String string2 = this.D.huntTaskName();
        if (j.lIlllIlIlllIIlI(string2.contains(lIlIIlIlIIIII[lIlIIlIlIIIIl[4]]) ? 1 : 0)) {
            void llllllllllllllIllIlllIIlllllIIll;
            String[] stringArray;
            String[] stringArray2 = stringArray = string2.split(lIlIIlIlIIIII[lIlIIlIlIIIIl[2]]);
            int n2 = stringArray2.length;
            int llllllllllllllIllIlllIIlllllIIlI = lIlIIlIlIIIIl[0];
            while (j.lIlllIlIlllIIll(llllllllllllllIllIlllIIlllllIIlI, (int)llllllllllllllIllIlllIIlllllIIll)) {
                void llllllllllllllIllIlllIIlllllIlll;
                void llllllllllllllIllIlllIIlllllIlII;
                void llllllllllllllIllIlllIIlllllIIIl = llllllllllllllIllIlllIIlllllIlII[llllllllllllllIllIlllIIlllllIIlI];
                if (j.lIlllIlIlllIIlI(llllllllllllllIllIlllIIlllllIlll.toLowerCase().contains(llllllllllllllIllIlllIIlllllIIIl.trim().toLowerCase()) ? 1 : 0)) {
                    return lIlIIlIlIIIIl[1];
                }
                ++llllllllllllllIllIlllIIlllllIIlI;
                0;
                if (-2 <= 0) continue;
                return ((0xF0 ^ 0x83 ^ (0x60 ^ 0x73)) & (159 + 134 - 154 + 27 ^ 13 + 131 - 10 + 64 ^ -1)) != 0;
            }
        }
        return string.toLowerCase().contains(string2.trim().toLowerCase());
    }

    private static boolean lIlllIlIlllIlII(Object object) {
        return object == null;
    }

    static {
        j.lIlllIlIllIllll();
        j.lIlllIlIllIlllI();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        j llllllllllllllIllIlllIIllllIllII;
        void llllllllllllllIllIlllIIllllIlIll;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (j.lIlllIlIlllIlIl(chatMessageType, ChatMessageType.GAMEMESSAGE) && j.lIlllIlIlllIlIl(chatMessageType, ChatMessageType.SPAM)) {
            return;
        }
        String llllllllllllllIllIlllIIllllIlIIl = Text.removeTags((String)llllllllllllllIllIlllIIllllIlIll.getMessage());
        Log.info((String)("Actual message: " + llllllllllllllIllIlllIIllllIlIIl));
        if (j.lIlllIlIlllIIlI(llllllllllllllIllIlllIIllllIlIIl.contains(lIlIIlIlIIIII[lIlIIlIlIIIIl[5]]) ? 1 : 0)) {
            llllllllllllllIllIlllIIllllIllII.E.a(lIlIIlIlIIIIl[1]);
            llllllllllllllIllIlllIIllllIllII.E.b(lIlIIlIlIIIIl[1]);
        }
        if (j.lIlllIlIlllIIlI(llllllllllllllIllIlllIIllllIllII.j(llllllllllllllIllIlllIIllllIlIIl) ? 1 : 0)) {
            Log.info((String)lIlIIlIlIIIII[lIlIIlIlIIIIl[6]]);
            llllllllllllllIllIlllIIllllIllII.E.forceStop();
        }
    }

    private static void lIlllIlIllIlllI() {
        lIlIIlIlIIIII = new String[lIlIIlIlIIIIl[8]];
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[0]] = j."Stopping, found the hunted task!";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[1]] = j."Cant find hunting master";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[3]] = j."Assignment";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[4]] = j.",";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[2]] = j.",";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[5]] = j."Contact a Slayer Master to decide";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[6]] = j."Stopping, found the hunted task!";
        j.lIlIIlIlIIIII[j.lIlIIlIlIIIIl[7]] = j."Assignment";
    }

    private static boolean lIlllIlIlllIlIl(Object object, Object object2) {
        return object != object2;
    }

    public boolean run() {
        j llllllllllllllIllIlllIlIIIIIIIll;
        if (j.lIlllIlIlllIIII(this.D.huntTask() ? 1 : 0)) {
            return lIlIIlIlIIIIl[0];
        }
        if (j.lIlllIlIlllIIIl((Object)llllllllllllllIllIlllIlIIIIIIIll.E.b()) && j.lIlllIlIlllIIlI(llllllllllllllIllIlllIlIIIIIIIll.j(llllllllllllllIllIlllIlIIIIIIIll.E.b().m()) ? 1 : 0)) {
            Log.info((String)lIlIIlIlIIIII[lIlIIlIlIIIIl[0]]);
            llllllllllllllIllIlllIlIIIIIIIll.E.forceStop();
            return lIlIIlIlIIIIl[1];
        }
        if (j.lIlllIlIlllIIlI(llllllllllllllIllIlllIlIIIIIIIll.E.d() ? 1 : 0)) {
            return lIlIIlIlIIIIl[0];
        }
        if (j.lIlllIlIlllIIII(llllllllllllllIllIlllIlIIIIIIIll.E.c() ? 1 : 0)) {
            return lIlIIlIlIIIIl[0];
        }
        a llllllllllllllIllIlllIlIIIIIIIlI = llllllllllllllIllIlllIlIIIIIIIll.D.taskMaster();
        if (j.lIlllIlIlllIIll(llllllllllllllIllIlllIlIIIIIIIlI.k().distanceTo((Locatable)Players.getLocal()), lIlIIlIlIIIIl[2])) {
            NPC llllllllllllllIllIlllIlIIIIIIIIl = NPCs.getNearest(nPC -> {
                String[] stringArray = new String[lIlIIlIlIIIIl[1]];
                stringArray[j.lIlIIlIlIIIIl[0]] = lIlIIlIlIIIII[lIlIIlIlIIIIl[7]];
                return nPC.hasAction(stringArray);
            });
            if (j.lIlllIlIlllIlII(llllllllllllllIllIlllIlIIIIIIIIl)) {
                Log.info((String)lIlIIlIlIIIII[lIlIIlIlIIIIl[1]]);
                return lIlIIlIlIIIIl[0];
            }
            llllllllllllllIllIlllIlIIIIIIIIl.interact(lIlIIlIlIIIII[lIlIIlIlIIIIl[3]]);
            llllllllllllllIllIlllIlIIIIIIIll.sleep(lIlIIlIlIIIIl[3]);
            return lIlIIlIlIIIIl[1];
        }
        if (j.lIlllIlIlllIIlI(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)llllllllllllllIllIlllIlIIIIIIIlI.k());
            0;
        }
        return lIlIIlIlIIIIl[1];
    }

    private static boolean lIlllIlIlllIIIl(Object object) {
        return object != null;
    }
}

