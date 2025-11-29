/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameState
 *  net.runelite.api.World
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.game.Worlds
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.World;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Worlds;

/* TASK: Hopping worlds -> HoppingworldsTask */
@TaskDesc(name="Hopping worlds", priority=2147470310, register=true)
public class HoppingWorldsTask
extends Task {
    private /* synthetic */ boolean an;
    private static /* synthetic */ String[] llllll;
    private static /* synthetic */ int[] lIIIIll;

    @Inject
    public l() {
        this.an = lIIIIll[0];
    }

    private static boolean lIIIIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIlIlI(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (l.lIIIIlIII(this.an ? 1 : 0)) {
            return lIIIIll[0];
        }
        World world = Worlds.getCurrentWorld();
        Worlds.hopTo((World)Worlds.getRandom(world2 -> {
            int n2;
            if (l.lIIIIlIlI(world2.isNormal() ? 1 : 0) && l.lIIIIllII(world2.getLocation(), world.getLocation()) && l.lIIIIllIl(world2.getId(), world.getId()) && l.lIIIIlIlI(world2.isMembers() ? 1 : 0)) {
                n2 = lIIIIll[1];
                0;
                if (3 < 0) {
                    return ((0xB ^ 7 ^ (0x6F ^ 0x64)) & (0x73 ^ 0x1D ^ (0x27 ^ 0x4E) ^ -1) & ((0x2E ^ 0x3D ^ (0x6D ^ 0x65)) & (0xC6 ^ 0xB2 ^ (0x45 ^ 0x2A) ^ -1) ^ -1)) != 0;
                }
            } else {
                n2 = lIIIIll[0];
            }
            return n2 != 0;
        }));
        return lIIIIll[1];
    }

    private static boolean lIIIIlIll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        void llllIIlIIIlllll;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (l.lIIIIlIIl(chatMessageType, ChatMessageType.GAMEMESSAGE) && l.lIIIIlIIl(chatMessageType, ChatMessageType.SPAM)) {
            return;
        }
        String llllIIlIIIlllIl = llllIIlIIIlllll.getMessage();
        if (l.lIIIIlIlI(llllIIlIIIlllIl.contains(llllll[lIIIIll[0]]) ? 1 : 0)) {
            llllIIlIIlIIIII.an = lIIIIll[1];
        }
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        Log.info((String)("Game state changed to " + gameStateChanged.getGameState()));
        if (l.lIIIIlIll(gameStateChanged.getGameState(), GameState.HOPPING)) {
            this.an = lIIIIll[0];
        }
    }

    private static boolean lIIIIlIIl(Object object, Object object2) {
        return object != object2;
    }

    static {
        l.lIIIIIlll();
        l.lIIIIIllI();
    }

    private static void lIIIIIlll() {
        lIIIIll = new int[3];
        l.lIIIIll[0] = (21 + 62 - -24 + 69 ^ 178 + 63 - 70 + 18) & (0x3C ^ 0x7E ^ (0xC ^ 0x43) ^ -1);
        l.lIIIIll[1] = 1;
        l.lIIIIll[2] = 2;
    }

    private static void lIIIIIllI() {
        llllll = new String[lIIIIll[1]];
        l.llllll[l.lIIIIll[0]] = l."Cerberus is already dealing";
    }

    private static String llllIIIl(String llllIIlIIIIllIl, String llllIIlIIIIllII) {
        try {
            SecretKeySpec llllIIlIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIIlIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIIlIIIIllll = Cipher.getInstance("Blowfish");
            llllIIlIIIIllll.init(lIIIIll[2], llllIIlIIIlIIII);
            return new String(llllIIlIIIIllll.doFinal(Base64.getDecoder().decode(llllIIlIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIIlIIIIlllI) {
            llllIIlIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIllII(int n2, int n3) {
        return n2 == n3;
    }
}

