/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.widgets.Dialog
 */
package gg.squire.farmer.tasks;

import gg.squire.farmer.tasks.DHelper;
import gg.squire.farmer.tasks.GameEnum60;
import gg.squire.farmer.tasks.GameEnum40;
import gg.squire.farmer.tasks.FarmerTaskBase;
import gg.squire.farmer.tasks.FarmerManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.widgets.Dialog;

@TaskDesc(name="Emptying birdhouse", priority=5)
public class EmptyingBirdhouseTask
extends FarmerTaskBase {

    private static boolean llllIlIIlIIIIl(Object object) {
        return object != null;
    }

    private static void llllIlIIIllllI() {
        llIIIlIIllll = new String[llIIIlIlIIII[3]];
        aH.llIIIlIIllll[aH.llIIIlIlIIII[1]] = "Empty";
        aH.llIIIlIIllll[aH.llIIIlIlIIII[0]] = "discard the birdhouse and contents";
    }

    @Inject
    protected EmptyingBirdhouseTask(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, j j2) {
        F[] fArray = new F[llIIIlIlIIII[0]];
        fArray[aH.llIIIlIlIIII[1]] = F.SEEDED;
        super(squireFarmer, squireFarmerConfig, j2, fArray);
    }

    private static boolean llllIlIIlIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llllIlIIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        aH.llllIlIIIlllll();
        aH.llllIlIIIllllI();
    }

    private static boolean llllIlIIlIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean f(E e2) {
        void var2_2;
        void var1;
        aH var2;
        if (aH.llllIlIIlIIIII(this.cu.c(e2) ? 1 : 0)) {
            return llIIIlIlIIII[1];
        }
        TileObject var3 = var2.cu.a((GameEnum60) ar1);
        if (!aH.llllIlIIlIIIIl(var3) || aH.llllIlIIlIIIlI(var3.distanceTo((Locatable)Players.getLocal()), llIIIlIlIIII[2])) {
            return llIIIlIlIIII[1];
        }
        if (aH.llllIlIIlIIIll(Dialog.isViewingOptions() ? 1 : 0) && aH.llllIlIIlIIIll(Dialog.hasOption(string -> string.contains(llIIIlIIllll[llIIIlIlIIII[0]])) ? 1 : 0)) {
            var2.cu.Q().add((GameEnum60) ar1);

            D var4 = (DHelper) ar2.cu.R().get(var1);
            var2.cu.R().replace((GameEnum60) ar1, new DHelper((GameEnum60) ar1, var4.ax(), var4.ay() + Duration.ofMinutes(5L).toSeconds()));

            return llIIIlIlIIII[0];
        }
        var2_2.interact(llIIIlIIllll[llIIIlIlIIII[1]]);
        return llIIIlIlIIII[0];
    }
}

