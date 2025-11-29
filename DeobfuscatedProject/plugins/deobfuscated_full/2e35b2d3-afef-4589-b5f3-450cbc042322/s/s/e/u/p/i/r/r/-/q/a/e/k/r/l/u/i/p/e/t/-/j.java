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

/* TASK: Getting Hunting Task -> GettinghuntingtaskTask */
@TaskDesc(name="Getting Hunting Task", priority=10, register=true, blocking=true)
public class j
extends Task {
    private final /* synthetic */ SquireSkipperPlugin E;
    private final /* synthetic */ SquireSkipperConfig D;
    private static /* synthetic */ int[] lIlIIlIlIIIIl;
    private static /* synthetic */ String[] lIlIIlIlIIIII;

    private static String lIlllIlIllIllII(String var2, String var6) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var16 = var6.toCharArray();
        int var25 = lIlIIlIlIIIIl[0];
        char[] var10 = var2.toCharArray();
        int var26 = var10.length;
        int var8 = lIlIIlIlIIIIl[0];
        while (j.lIlllIlIlllIIll(var8, var26)) {
            char var19 = var10[var8];
            var20.append((char)(var19 ^ var16[var25 % var16.length]));
            0;
            ++var25;
            ++var8;
            0;
            if (2 != -1) continue;
            return null;
        }
        return String.valueOf(var20);
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

    private static String lIlllIlIllIllIl(String var22, String var18) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIlIIlIlIIIIl[3], var15);
            return new String(var5.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIllIlIll(String var1, String var23) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var23.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIIIIl[8]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIlIIlIlIIIIl[3], var17);
            return new String(var14.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
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
            void var27;
            String[] stringArray;
            String[] stringArray2 = stringArray = string2.split(lIlIIlIlIIIII[lIlIIlIlIIIIl[2]]);
            int n2 = stringArray2.length;
            int var11 = lIlIIlIlIIIIl[0];
            while (j.lIlllIlIlllIIll(var11, (int)var27)) {
                void var3;
                void var30;
                void var7 = var30[var11];
                if (j.lIlllIlIlllIIlI(var3.toLowerCase().contains(var7.trim().toLowerCase()) ? 1 : 0)) {
                    return lIlIIlIlIIIIl[1];
                }
                ++var11;
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
        j var28;
        void var21;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (j.lIlllIlIlllIlIl(chatMessageType, ChatMessageType.GAMEMESSAGE) && j.lIlllIlIlllIlIl(chatMessageType, ChatMessageType.SPAM)) {
            return;
        }
        String var29 = Text.removeTags((String)var21.getMessage());
        Log.info((String)("Actual message: " + var29));
        if (j.lIlllIlIlllIIlI(var29.contains(lIlIIlIlIIIII[lIlIIlIlIIIIl[5]]) ? 1 : 0)) {
            var28.E.a(lIlIIlIlIIIIl[1]);
            var28.E.b(lIlIIlIlIIIIl[1]);
        }
        if (j.lIlllIlIlllIIlI(var28.j(var29) ? 1 : 0)) {
            Log.info((String)lIlIIlIlIIIII[lIlIIlIlIIIIl[6]]);
            var28.E.forceStop();
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
        j var12;
        if (j.lIlllIlIlllIIII(this.D.huntTask() ? 1 : 0)) {
            return lIlIIlIlIIIIl[0];
        }
        if (j.lIlllIlIlllIIIl((Object)var12.E.b()) && j.lIlllIlIlllIIlI(var12.j(var12.E.b().m()) ? 1 : 0)) {
            Log.info((String)lIlIIlIlIIIII[lIlIIlIlIIIIl[0]]);
            var12.E.forceStop();
            return lIlIIlIlIIIIl[1];
        }
        if (j.lIlllIlIlllIIlI(var12.E.d() ? 1 : 0)) {
            return lIlIIlIlIIIIl[0];
        }
        if (j.lIlllIlIlllIIII(var12.E.c() ? 1 : 0)) {
            return lIlIIlIlIIIIl[0];
        }
        a var4 = var12.D.taskMaster();
        if (j.lIlllIlIlllIIll(var4.k().distanceTo((Locatable)Players.getLocal()), lIlIIlIlIIIIl[2])) {
            NPC var9 = NPCs.getNearest(nPC -> {
                String[] stringArray = new String[lIlIIlIlIIIIl[1]];
                stringArray[j.lIlIIlIlIIIIl[0]] = lIlIIlIlIIIII[lIlIIlIlIIIIl[7]];
                return nPC.hasAction(stringArray);
            });
            if (j.lIlllIlIlllIlII(var9)) {
                Log.info((String)lIlIIlIlIIIII[lIlIIlIlIIIIl[1]]);
                return lIlIIlIlIIIIl[0];
            }
            var9.interact(lIlIIlIlIIIII[lIlIIlIlIIIIl[3]]);
            var12.sleep(lIlIIlIlIIIIl[3]);
            return lIlIIlIlIIIIl[1];
        }
        if (j.lIlllIlIlllIIlI(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var4.k());
            0;
        }
        return lIlIIlIlIIIIl[1];
    }

    private static boolean lIlllIlIlllIIIl(Object object) {
        return object != null;
    }
}

