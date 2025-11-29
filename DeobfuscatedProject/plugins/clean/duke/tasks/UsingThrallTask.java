/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.magic.Thralls
 */
package gg.squire.duke.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.duke.tasks.DukeManager;
import gg.squire.duke.tasks.DukeManager;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.magic.Thralls;

@TaskDesc(name="Using thrall", priority=4999)
public class UsingThrallTask
extends Task {

    private final  a be;
    private final  SquireDukeSucellus bd;

        return String.valueOf(var1);
    }

    private static void lllIIllIIlIlII() {
        lIllIIllllIl = new String[lIllIIlllllI[4]];
        C.lIllIIllllIl[C.lIllIIlllllI[0]] = "Gate";
        C.lIllIIllllIl[C.lIllIIlllllI[1]] = "Quick-escape";
        C.lIllIIllllIl[C.lIllIIlllllI[2]] = "Duke Sucellus";
        C.lIllIIllllIl[C.lIllIIlllllI[3]] = "Attack";
    }

    private static boolean lllIIllIIlIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public UsingThrallTask(SquireDukeSucellus squireDukeSucellus, a a2) {
        this.bd = squireDukeSucellus;
        this.be = a2;
    }

    private static boolean lllIIllIIllIII(int n2) {
        return n2 != 0;
    }

    static {
        C.lllIIllIIlIlIl();
        C.lllIIllIIlIlII();
    }

    private static boolean lllIIllIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        if (C.lllIIllIIlIllI(Thralls.canUse() ? 1 : 0)) {
            return lIllIIlllllI[0];
        }
        NPC var2 = NPCs.getNearest(nPC -> {
            int n2;
            if (C.lllIIllIIllIII(nPC.getName().equals(lIllIIllllIl[lIllIIlllllI[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllllI[1]];
                stringArray[C.lIllIIlllllI[0]] = lIllIIllllIl[lIllIIlllllI[3]];
                if (C.lllIIllIIllIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllllI[1];

                    if (((0xA ^ 0x25) & ~(0x24 ^ 0xB)) == 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIllIIlllllI[0];
            return n2 != 0;
        });
        if (C.lllIIllIIlIlll(var2)) {
            return lIllIIlllllI[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (C.lllIIllIIllIII(tileObject.getName().equals(lIllIIllllIl[lIllIIlllllI[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIlllllI[1]];
                stringArray[C.lIllIIlllllI[0]] = lIllIIllllIl[lIllIIlllllI[1]];
                if (C.lllIIllIIllIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIlllllI[1];

                    if (((0x67 ^ 0x39 ^ (0x56 ^ 0x2A)) & (0xD8 ^ 0xC1 ^ (0x2B ^ 0x10) ^ -1)) <= (((0xF2 ^ 0xAF) & ~(0x66 ^ 0x3B) ^ (0x9E ^ 0xC4)) & (0x76 ^ 0x38 ^ (0 ^ 0x14) ^ -1))) return n2 != 0;
                    return ((11 + 53 - -20 + 96 ^ 35 + 87 - 24 + 64) & (0xBE ^ 0x9A ^ (0xA5 ^ 0x97) ^ -1)) != 0;
                }
            }
            n2 = lIllIIlllllI[0];
            return n2 != 0;
        });
        if (C.lllIIllIIlIlll(var3)) {
            return lIllIIlllllI[0];
        }
        Player var4 = Players.getLocal();
        if (C.lllIIllIIlIlll(var4)) {
            return lIllIIlllllI[0];
        }
        if (C.lllIIllIIlIllI(e.l(var3).contains((Locatable)var4) ? 1 : 0) && C.lllIIllIIlIllI(e.q(var3) ? 1 : 0) && C.lllIIllIIlIllI(e.r(var3) ? 1 : 0)) {
            return lIllIIlllllI[0];
        }
        return Thralls.useBestThrall();
    }

    private static boolean lllIIllIIlIlll(Object object) {
        return object == null;
    }
}

