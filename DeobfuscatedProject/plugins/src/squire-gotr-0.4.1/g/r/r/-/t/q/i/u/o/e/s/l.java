/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.h;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Mining inital fragments", priority=12, register=true, blocking=true)
public class l
extends h {
    private static /* synthetic */ String[] llIIlllIlIII;
    private /* synthetic */ boolean bd;
    private static /* synthetic */ int[] llIIlllIlIIl;
    protected static final /* synthetic */ WorldPoint bc;

    @Override
    protected boolean aj() {
        if (l.lllllllIlIIIIl((Object)this.aV.m(), (Object)c.ACTIVATING)) {
            this.bd = llIIlllIlIIl[2];
        }
        return llIIlllIlIIl[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIlIIlIllllIIIllII;
        if (l.lllllllIlIIIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (l.lllllllIlIIIll(lllllllllllllllIlIIlIllllIIIllII.getMessage().contains(llIIlllIlIII[llIIlllIlIIl[2]]) ? 1 : 0)) {
            l lllllllllllllllIlIIlIllllIIIllIl;
            lllllllllllllllIlIIlIllllIIIllIl.sleep(Rand.nextInt((int)llIIlllIlIIl[7], (int)llIIlllIlIIl[8]));
        }
    }

    private static void lllllllIIlllll() {
        llIIlllIlIII = new String[llIIlllIlIIl[3]];
        l.llIIlllIlIII[l.llIIlllIlIIl[1]] = l.lllllllIIllllI("o7K8ZamEuFY=", "LQmfo");
        l.llIIlllIlIII[l.llIIlllIlIIl[2]] = l.lllllllIIllllI("au+Y+378OQmESvW1bUPWLA==", "ZeHIk");
    }

    private static void lllllllIlIIIII() {
        llIIlllIlIIl = new int[11];
        l.llIIlllIlIIl[0] = "   ".length();
        l.llIIlllIlIIl[1] = (0x1B ^ 0x48) & ~(0xEC ^ 0xBF);
        l.llIIlllIlIIl[2] = " ".length();
        l.llIIlllIlIIl[3] = "  ".length();
        l.llIIlllIlIIl[4] = 0x9C ^ 0xA4;
        l.llIIlllIlIIl[5] = 0xFFFFAAC7 & 0xFFFF;
        l.llIIlllIlIIl[6] = -(0xFFFFD32F & 0x6DFB) & (0xFFFFEBFF & 0xFFEF);
        l.llIIlllIlIIl[7] = 57 + 135 - 174 + 133 ^ 42 + 108 - 3 + 0;
        l.llIIlllIlIIl[8] = 9 ^ 1;
        l.llIIlllIlIIl[9] = -(0xFFFFF0C4 & 0x3FBF) & (0xFFFFFFAF & 0x3EFF);
        l.llIIlllIlIIl[10] = 0xFFFFBD3E & 0x67D5;
    }

    private static boolean lllllllIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        l.lllllllIlIIIII();
        l.lllllllIIlllll();
        bc = new WorldPoint(llIIlllIlIIl[9], llIIlllIlIIl[10], llIIlllIlIIl[1]);
    }

    @Inject
    public l(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[llIIlllIlIIl[0]];
        cArray[l.llIIlllIlIIl[1]] = c.ACTIVATING;
        cArray[l.llIIlllIlIIl[2]] = c.COUNTDOWN;
        cArray[l.llIIlllIlIIl[3]] = c.ACTIVE;
        super(squireGOTRPlugin, cArray);
    }

    private static boolean lllllllIlIIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllllIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lllllllIlIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllllIlIIIll(int n2) {
        return n2 != 0;
    }

    private static String lllllllIIllllI(String lllllllllllllllIlIIlIllllIIIIlII, String lllllllllllllllIlIIlIllllIIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllllIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllllIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllllIIIIllI.init(llIIlllIlIIl[3], lllllllllllllllIlIIlIllllIIIIlll);
            return new String(lllllllllllllllIlIIlIllllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllllIIIIlIl) {
            lllllllllllllllIlIIlIllllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllIlIIIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lllllllIlIIlll(Object object) {
        return object == null;
    }

    private static boolean lllllllIlIlIII(Object object) {
        return object != null;
    }

    @Override
    protected boolean ak() {
        TileObject lllllllllllllllIlIIlIllllIIlIIlI;
        TileObject tileObject;
        l lllllllllllllllIlIIlIllllIIlIIll;
        if (l.lllllllIlIIIlI(Game.getState(), GameState.LOGGED_IN)) {
            return llIIlllIlIIl[1];
        }
        if (l.lllllllIlIIIll(SquireGOTRPlugin.g.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIIlllIlIIl[1];
        }
        if (l.lllllllIlIIlII(lllllllllllllllIlIIlIllllIIlIIll.aV.g() ? 1 : 0)) {
            lllllllllllllllIlIIlIllllIIlIIll.bd = llIIlllIlIIl[1];
            return llIIlllIlIIl[1];
        }
        if (l.lllllllIlIIlIl(lllllllllllllllIlIIlIllllIIlIIll.aV.a(), lllllllllllllllIlIIlIllllIIlIIll.aW.fragmentAmount())) {
            lllllllllllllllIlIIlIllllIIlIIll.bd = llIIlllIlIIl[1];
            return llIIlllIlIIl[1];
        }
        if (l.lllllllIlIIlII(lllllllllllllllIlIIlIllllIIlIIll.bd ? 1 : 0)) {
            return llIIlllIlIIl[1];
        }
        if (l.lllllllIlIIllI(Skills.getLevel((Skill)Skill.AGILITY), llIIlllIlIIl[4])) {
            int[] nArray = new int[llIIlllIlIIl[2]];
            nArray[l.llIIlllIlIIl[1]] = llIIlllIlIIl[5];
            tileObject = TileObjects.getNearest((int[])nArray);
            "".length();
            if (((132 + 77 - 104 + 76 ^ 132 + 135 - 229 + 126) & (173 + 154 - 183 + 44 ^ 51 + 147 - 150 + 125 ^ -" ".length())) != 0) {
                return ((0xC0 ^ 0x9A ^ (0x1E ^ 0x7D)) & (81 + 107 - 138 + 95 ^ 119 + 19 - 105 + 135 ^ -" ".length())) != 0;
            }
        } else {
            int[] nArray = new int[llIIlllIlIIl[2]];
            nArray[l.llIIlllIlIIl[1]] = llIIlllIlIIl[6];
            tileObject = TileObjects.getNearest((int[])nArray);
        }
        if (l.lllllllIlIIlll(lllllllllllllllIlIIlIllllIIlIIlI = tileObject)) {
            if (l.lllllllIlIIlII(Movement.isWalking() ? 1 : 0)) {
                Movement.walkTo((WorldPoint)bc);
                "".length();
                return llIIlllIlIIl[2];
            }
            return llIIlllIlIIl[2];
        }
        Player lllllllllllllllIlIIlIllllIIlIIIl = Players.getLocal();
        int n2 = Reachable.isInteractable((Locatable)lllllllllllllllIlIIlIllllIIlIIlI);
        if (l.lllllllIlIIIll(lllllllllllllllIlIIlIllllIIlIIll.ah() ? 1 : 0) && l.lllllllIlIIlII(n2) && l.lllllllIlIIlII(lllllllllllllllIlIIlIllllIIlIIIl.isAnimating() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)lllllllllllllllIlIIlIllllIIlIIlI.getWorldLocation());
            "".length();
            return llIIlllIlIIl[2];
        }
        if (l.lllllllIlIIlII(n2)) {
            return llIIlllIlIIl[2];
        }
        if (l.lllllllIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && l.lllllllIlIIIll(lllllllllllllllIlIIlIllllIIlIIll.bd ? 1 : 0)) {
            return llIIlllIlIIl[2];
        }
        if (!l.lllllllIlIlIII(lllllllllllllllIlIIlIllllIIlIIll.aV.L()) || l.lllllllIlIIlII(lllllllllllllllIlIIlIllllIIlIIll.b((GameObject)lllllllllllllllIlIIlIllllIIlIIlI) ? 1 : 0)) {
            lllllllllllllllIlIIlIllllIIlIIlI.interact(llIIlllIlIII[llIIlllIlIIl[1]]);
            lllllllllllllllIlIIlIllllIIlIIll.sleep(llIIlllIlIIl[3]);
            return llIIlllIlIIl[2];
        }
        return llIIlllIlIIl[2];
    }
}

