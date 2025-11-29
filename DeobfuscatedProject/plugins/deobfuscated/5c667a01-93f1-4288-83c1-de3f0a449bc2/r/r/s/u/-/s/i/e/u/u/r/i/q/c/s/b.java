/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.scurrius.SquireScurrius;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d;

@Singleton
public class b {
    private static /* synthetic */ String[] lIIlIllIllIlI;
    final /* synthetic */ Client u;
    final /* synthetic */ SquireScurrius t;
    private static /* synthetic */ int[] lIIlIllIllIll;

    private static boolean lIlIllIlIlllIII(int n2) {
        return n2 != 0;
    }

    @Subscribe(priority=-2.1474836E9f)
    public void a(GameTick gameTick) {
    }

    private static String lIlIllIlIllIIll(String llllllllllllllIllllIlIIllIIIllll, String llllllllllllllIllllIlIIllIIIlllI) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIllIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIllIIIlllI.getBytes(StandardCharsets.UTF_8)), lIIlIllIllIll[6]), "DES");
            Cipher llllllllllllllIllllIlIIllIIlIIll = Cipher.getInstance("DES");
            llllllllllllllIllllIlIIllIIlIIll.init(lIIlIllIllIll[2], llllllllllllllIllllIlIIllIIlIlII);
            return new String(llllllllllllllIllllIlIIllIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIIllIIlIIlI) {
            llllllllllllllIllllIlIIllIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIlIllIllI() {
        lIIlIllIllIll = new int[7];
        b.lIIlIllIllIll[0] = (102 + 65 - 15 + 50 ^ 52 + 193 - 205 + 157) & (4 ^ 0x20 ^ (0xA8 ^ 0x83) ^ -1);
        b.lIIlIllIllIll[1] = 1;
        b.lIIlIllIllIll[2] = 2;
        b.lIIlIllIllIll[3] = 0xFFFF97FB & 0x7FD7;
        b.lIIlIllIllIll[4] = 0xB3 ^ 0xB6;
        b.lIIlIllIllIll[5] = 3;
        b.lIIlIllIllIll[6] = 5 + 93 - 84 + 128 ^ 103 + 128 - 220 + 123;
    }

    private static boolean lIlIllIlIlllIIl(Object object) {
        return object == null;
    }

    static {
        b.lIlIllIlIllIllI();
        b.lIlIllIlIllIlIl();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=2.1474836E9f)
    public void a(ChatMessage chatMessage) {
        b llllllllllllllIllllIlIIllIIlllIl;
        void llllllllllllllIllllIlIIllIIllIll;
        String string = chatMessage.getMessage();
        if (b.lIlIllIlIllIlll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && b.lIlIllIlIllIlll(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (b.lIlIllIlIlllIII(llllllllllllllIllllIlIIllIIllIll.contains(lIIlIllIllIlI[lIIlIllIllIll[0]]) ? 1 : 0)) {
            llllllllllllllIllllIlIIllIIlllIl.o();
            System.out.println(lIIlIllIllIlI[lIIlIllIllIll[1]]);
            llllllllllllllIllllIlIIllIIlllIl.t.e();
        }
        if (b.lIlIllIlIlllIII(llllllllllllllIllllIlIIllIIllIll.contains(lIIlIllIllIlI[lIIlIllIllIll[2]]) ? 1 : 0)) {
            llllllllllllllIllllIlIIllIIlllIl.t.d(lIIlIllIllIll[1]);
            llllllllllllllIllllIlIIllIIlllIl.o();
        }
    }

    private static String lIlIllIlIllIlII(String llllllllllllllIllllIlIIllIIIIlII, String llllllllllllllIllllIlIIllIIIIIIl) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIIllIIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIIllIIIIllI.init(lIIlIllIllIll[2], llllllllllllllIllllIlIIllIIIIlll);
            return new String(llllllllllllllIllllIlIIllIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIlIIllIIIIlIl) {
            llllllllllllllIllllIlIIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private WorldPoint b() {
        int[] nArray = new int[lIIlIllIllIll[1]];
        nArray[b.lIIlIllIllIll[0]] = d.A;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (b.lIlIllIlIlllIIl(tileObject)) {
            return new WorldPoint(lIIlIllIllIll[0], lIIlIllIllIll[0], lIIlIllIllIll[0]);
        }
        return tileObject.getWorldLocation().dx(lIIlIllIllIll[2]).dy(lIIlIllIllIll[4]);
    }

    private static boolean lIlIllIlIllIlll(Object object, Object object2) {
        return object != object2;
    }

    public void o() {
        this.t.d();
    }

    public int p() {
        return Vars.getBit((int)lIIlIllIllIll[3]);
    }

    private static void lIlIllIlIllIlIl() {
        lIIlIllIllIlI = new String[lIIlIllIllIll[5]];
        b.lIIlIllIllIlI[b.lIIlIllIllIll[0]] = b."Your Scurrius kill count is";
        b.lIIlIllIllIlI[b.lIIlIllIllIll[1]] = b."Finishing kill";
        b.lIIlIllIllIlI[b.lIIlIllIllIll[2]] = b."Oh dear, you are dead!";
    }

    @Subscribe(priority=2.1474836E9f)
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
    }

    @Inject
    public b(SquireScurrius squireScurrius, Client client) {
        this.t = squireScurrius;
        this.u = client;
    }
}

