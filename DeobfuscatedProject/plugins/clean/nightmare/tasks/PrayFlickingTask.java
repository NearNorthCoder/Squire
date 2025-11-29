/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.nightmare.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TaskDesc(name="Pray Flicking", priority=0x7FFFFFFF)
public class PrayFlickingTask
extends Task {
    private  ArrayList<Prayer> dO;
    private final  SquireNightmareConfig dM;
    private static final  Logger dK;
    
    private final  SquireNightmarePlugin dN;
    
    private final  Client dL;

    private static boolean lIIlIIIIlIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlIIIIllIIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIlIIIIllIIlII(int n2) {
        return n2 != 0;
    }

    private static void lIIlIIIIlIlIllI() {
        llllIlIIlllI = new String[llllIlIIllll[1]];
        ad.llllIlIIlllI[ad.llllIlIIllll[0]] = "husk";
    }

    private static boolean lIIlIIIIlIllIlI(Object object) {
        return object == null;
    }

    private static boolean lIIlIIIIllIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIlIIIIlIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIlIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        ad.lIIlIIIIlIlIlll();
        ad.lIIlIIIIlIlIllI();
        dK = LoggerFactory.getLogger(PrayFlickingTask.class);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ad var1;
        if (ad.lIIlIIIIlIllIII(Prayers.anyActive() ? 1 : 0) && ad.lIIlIIIIlIllIII(this.dL.isInInstancedRegion() ? 1 : 0)) {
            return llllIlIIllll[0];
        }
        if (ad.lIIlIIIIlIllIIl(Skills.getBoostedLevel((Skill)Skill.PRAYER))) {
            return llllIlIIllll[0];
        }
        NPC var2 = SquireNightmarePlugin.d();
        if (ad.lIIlIIIIlIllIII(var1.dL.isInInstancedRegion() ? 1 : 0)) {
            Prayers.disableAll();
            return llllIlIIllll[1];
        }
        if (ad.lIIlIIIIlIllIlI(var2)) {
            return llllIlIIllll[0];
        }
        List<Prayer> list = this.q(var1_1.getAnimation());
        Prayers.flick(list);

        return llllIlIIllll[1];
    }

    private static boolean lIIlIIIIlIlllII(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIIllIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public PrayFlickingTask(Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        this.dO = new ArrayList();
        this.dL = client;
        this.dM = squireNightmareConfig;
        this.dN = squireNightmarePlugin;
    }

    private static boolean lIIlIIIIlIllllI(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIIlIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private List<Prayer> q(int var3) {
        ArrayList<Prayer> arrayList;
        ad var4;
        Object var5;
        ArrayList<Prayer> var6 = new ArrayList<Prayer>();
        int[] var7 = SquireNightmarePlugin.q.stream().mapToInt(Integer::intValue).toArray();
        NPC var8 = NPCs.getAll((int[])var7).stream().filter(nPC -> {
            boolean bl;
            if (ad.lIIlIIIIlIllIII(nPC.isDead() ? 1 : 0)) {
                bl = llllIlIIllll[1];

            } else {
                bl = llllIlIIllll[0];
            }
            return bl;
        }).min(Comparator.comparingInt(nPC -> Players.getLocal().getWorldLocation().distanceTo(nPC.getWorldLocation()))).orElse(null);
        if (ad.lIIlIIIIlIllIlI(var8)) {
            if (ad.lIIlIIIIlIllIll(Static.getClient().getVarbitValue(llllIlIIllll[2]), llllIlIIllll[3])) {
                Prayer[] prayerArray = new Prayer[llllIlIIllll[4]];
                prayerArray[ad.llllIlIIllll[0]] = Prayer.INCREDIBLE_REFLEXES;
                prayerArray[ad.llllIlIIllll[1]] = Prayer.ULTIMATE_STRENGTH;
                prayerArray[ad.llllIlIIllll[5]] = Prayer.STEEL_SKIN;
                var5 = Arrays.asList(prayerArray);
                var6.addAll((Collection<Prayer>)var5);

                if (3 != 3) {
                    return null;
                }
            } else {
                var6.add(Prayer.PIETY);

                }
            }
        } else if (ad.lIIlIIIIlIlllII(Vars.getBit((int)llllIlIIllll[6])) && ad.lIIlIIIIlIlllIl(Skills.getLevel((Skill)Skill.PRAYER), llllIlIIllll[7])) {
            var6.add(Prayer.AUGURY);

            }
        } else {
            var6.add(Prayer.MYSTIC_MIGHT);

        }
        var5 = SquireNightmarePlugin.d();
        NPC var9 = NPCs.getNearest(nPC -> {
            int n2;
            if (ad.lIIlIIIIllIIlII(nPC.getName().equalsIgnoreCase(llllIlIIlllI[llllIlIIllll[0]]) ? 1 : 0) && ad.lIIlIIIIlIllIII(nPC.isDead() ? 1 : 0)) {
                n2 = llllIlIIllll[1];

                if (2 <= 0) {
                    return false;
                }
            } else {
                n2 = llllIlIIllll[0];
            }
            return n2 != 0;
        });
        if (ad.lIIlIIIIlIllllI(var9) && ad.lIIlIIIIlIlllll(var4.dN.Q(), llllIlIIllll[8]) && (!ad.lIIlIIIIllIIIII(var4.dN.R(), llllIlIIllll[9]) || ad.lIIlIIIIllIIIIl(var4.dN.R(), llllIlIIllll[8])) && (!ad.lIIlIIIIlIllIll(var3, llllIlIIllll[10]) || ad.lIIlIIIIllIIIlI(var4.dN.S(), Prayer.PROTECT_FROM_MELEE))) {
            var6.add(Prayer.PROTECT_FROM_MISSILES);

            if (((0x1E ^ 0x63 ^ (0x23 ^ 0x67)) & (110 + 78 - 65 + 52 ^ 61 + 140 - 51 + 0 ^ -1)) != 0) {
                return null;
            }
        } else if (ad.lIIlIIIIlIllllI(var9) && ad.lIIlIIIIlIlllll(var4.dN.Q(), llllIlIIllll[8]) && (!ad.lIIlIIIIllIIIII(var4.dN.R(), llllIlIIllll[9]) || ad.lIIlIIIIllIIIIl(var4.dN.R(), llllIlIIllll[4]))) {
            var6.add(Prayer.PROTECT_FROM_MISSILES);

        } else if (ad.lIIlIIIIlIllllI(var9) && (!ad.lIIlIIIIllIIIII(var4.dN.R(), llllIlIIllll[9]) || ad.lIIlIIIIllIIIIl(var4.dN.R(), llllIlIIllll[4]))) {
            var6.add(Prayer.PROTECT_FROM_MAGIC);

        } else if (ad.lIIlIIIIlIlllll(var5.getId(), llllIlIIllll[11])) {
            var6.add(Prayer.REDEMPTION);

            if (((0x11 ^ 0x44) & ~(0xEA ^ 0xBF)) != 0) {
                return null;
            }
        } else if (ad.lIIlIIIIlIllIII(var4.dN.al() ? 1 : 0)) {
            if (ad.lIIlIIIIlIlllll(var3, llllIlIIllll[12])) {
                var6.add(Prayer.PROTECT_FROM_MAGIC);

                var4.dN.a(Prayer.PROTECT_FROM_MAGIC);
            }
            if (ad.lIIlIIIIlIlllll(var3, llllIlIIllll[13])) {
                var6.add(Prayer.PROTECT_FROM_MISSILES);

                var4.dN.a(Prayer.PROTECT_FROM_MISSILES);
            }
            if (ad.lIIlIIIIlIlllll(var3, llllIlIIllll[10])) {
                var6.add(Prayer.PROTECT_FROM_MELEE);

                var4.dN.a(Prayer.PROTECT_FROM_MELEE);

                }
            }
        } else {
            if (ad.lIIlIIIIlIlllll(var3, llllIlIIllll[12])) {
                var6.add(Prayer.PROTECT_FROM_MELEE);

                var4.dN.a(Prayer.PROTECT_FROM_MELEE);
            }
            if (ad.lIIlIIIIlIlllll(var3, llllIlIIllll[13])) {
                var6.add(Prayer.PROTECT_FROM_MAGIC);

            }
            if (ad.lIIlIIIIlIlllll(var3, llllIlIIllll[10])) {
                var6.add(Prayer.PROTECT_FROM_MISSILES);

            }
        }
        if (ad.lIIlIIIIllIIIll(var6.size(), llllIlIIllll[1])) {
            var4.dO = var6;
        }
        if (ad.lIIlIIIIllIIIll(var6.size(), llllIlIIllll[1])) {
            arrayList = var6;

            if (((0x7D ^ 0x59) & ~(0x7A ^ 0x5E)) > 2) {
                return null;
            }
        } else {
            arrayList = var4.dO;
        }
        return arrayList;
    }

    private static boolean lIIlIIIIllIIIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIIIIlIllIIl(int n2) {
        return n2 <= 0;
    }
}

