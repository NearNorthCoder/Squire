/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.client.Static;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum80;

@TaskDesc(name="Handling baba prayers", priority=0x7FFFFFFF, register=true)
public class HandlingBabaPrayersTask
extends AutotoaTaskBase {
    private  int dF;

    private static boolean lIIllIllllIlIl(Object object) {
        return object != null;
    }

    @Override
    public boolean aS() {
        return lIlllllllII[1];
    }

    private static boolean lIIllIlllllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIllllIllI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public List<Prayer> aN() {
        aH var1;
        String[] stringArray = new String[lIlllllllII[1]];
        stringArray[aH.lIlllllllII[0]] = lIllllllIll[lIlllllllII[0]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (aH.lIIllIllllIlIl(nPC) && aH.lIIllIllllIllI(nPC.getId(), lIlllllllII[2])) {
            return List.of(this.aQ());
        }
        String[] stringArray2 = new String[lIlllllllII[1]];
        stringArray2[aH.lIlllllllII[0]] = lIllllllIll[lIlllllllII[1]];
        NPC var2 = NPCs.getNearest((String[])stringArray2);
        if (aH.lIIllIllllIlll(var1.dF, Static.getClient().getTickCount()) && aH.lIIllIllllIlIl(var2)) {
            return List.of(Prayer.PROTECT_FROM_MISSILES, var1.aQ());
        }
        return List.of(Prayer.PROTECT_FROM_MELEE, this.aQ());
    }

    @Inject
    public HandlingBabaPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dF = lIlllllllII[0];
    }

    static {
        aH.lIIllIllllIlII();
        aH.lIIllIllllIIll();
    }

    private static boolean lIIllIllllIlll(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static boolean lIIllIlllllIII(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[lIlllllllII[4]];
        nArray[aH.lIlllllllII[0]] = lIlllllllII[5];
        nArray[aH.lIlllllllII[1]] = lIlllllllII[6];
        nArray[aH.lIlllllllII[7]] = lIlllllllII[2];
        return this.cm.a(nArray);
    }

    private static boolean lIIllIlllllIIl(Object object) {
        return object == null;
    }

        return String.valueOf(var3);
    }

    @Override
    public int aO() {
        return lIlllllllII[3];
    }

    /*
     * WARNING - void declaration
     */
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        void var4;
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        if (aH.lIIllIlllllIII(graphicsObjectCreated.getGraphicsObject().getId(), lIlllllllII[8])) {
            return;
        }
        LocalPoint var5 = var4.getLocation();
        WorldPoint var6 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var5);
        String[] stringArray = new String[lIlllllllII[1]];
        stringArray[aH.lIlllllllII[0]] = lIllllllIll[lIlllllllII[7]];
        NPC var7 = NPCs.getNearest((String[])stringArray);
        if (aH.lIIllIlllllIIl(var7)) {
            return;
        }
        if (aH.lIIllIlllllIlI(var7.getWorldArea().contains(var6) ? 1 : 0)) {
            var8.dF = Static.getClient().getTickCount() + lIlllllllII[9];
        }
    }

    private static void lIIllIllllIIll() {
        lIllllllIll = new String[lIlllllllII[4]];
        aH.lIllllllIll[aH.lIlllllllII[0]] = "Ba-Ba";
        aH.lIllllllIll[aH.lIlllllllII[1]] = "Baboon";
        aH.lIllllllIll[aH.lIlllllllII[7]] = "Ba-Ba";
    }
}

