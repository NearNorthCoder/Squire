/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.Thralls
 */
package gg.squire.vardorvis.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Thralls;
import gg.squire.vardorvis.tasks.VardorvisTaskBase;
import gg.squire.vardorvis.tasks.VardorvisManager;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Using thrall", priority=4999)
public class UsingThrallTask
extends VardorvisTaskBase {

    private static void lIlllllIIlIIIII() {
        lIlIlIIllllII = new String[lIlIlIIllllIl[2]];
        D.lIlIlIIllllII[D.lIlIlIIllllIl[0]] = "Vardorvis";
        D.lIlIlIIllllII[D.lIlIlIIllllIl[1]] = "Attack";
    }

    @Inject
    protected UsingThrallTask(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    static {
        D.lIlllllIIlIIIIl();
        D.lIlllllIIlIIIII();
    }

    @Override
    public boolean l() {
        if (D.lIlllllIIlIIIlI(Thralls.canUse() ? 1 : 0)) {
            return lIlIlIIllllIl[0];
        }
        NPC var1 = NPCs.getNearest(nPC -> {
            int n2;
            if (D.lIlllllIIlIIlII(nPC.getName().equalsIgnoreCase(lIlIlIIllllII[lIlIlIIllllIl[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIllllIl[1]];
                stringArray[D.lIlIlIIllllIl[0]] = lIlIlIIllllII[lIlIlIIllllIl[1]];
                if (D.lIlllllIIlIIlII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIllllIl[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIlIIllllIl[0];
            return n2 != 0;
        });
        if (D.lIlllllIIlIIIll(var1)) {
            return lIlIlIIllllIl[0];
        }
        Player var2 = Players.getLocal();
        if (D.lIlllllIIlIIIll(var2)) {
            return lIlIlIIllllIl[0];
        }
        return Thralls.useBestThrall();
    }

    private static boolean lIlllllIIlIIIll(Object object) {
        return object == null;
    }

    private static boolean lIlllllIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllIIlIIIlI(int n2) {
        return n2 == 0;
    }
}

