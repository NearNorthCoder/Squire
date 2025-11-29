/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 */
package gg.squire.vardorvis.tasks;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.vardorvis.tasks.GameEnum12;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i MELEE_DRAGON_WARHAMMER_SPEC;
    public static final  /* enum */ i MELEE_2H_CRUSH;
    public static final  /* enum */ i RANGED_DARTS;
    public static final  /* enum */ i MELEE_AHRIMS_STAFF_CRUSH;
    public final  int baseSpellDamage;
    public static final  /* enum */ i RANGED_RUNE_CROSSBOW;
    public static final  /* enum */ i RANGED_DRAGON_KNIFE_SPEC;
    public static final  /* enum */ i MELEE_INQUISITORS_MACE;
    public static final  /* enum */ i MELEE_ZAMORAK_GODSWORD_SPEC;
    public static final  /* enum */ i MAGIC_STANDARD_WAVE_STAFF;
    public static final  /* enum */ i RANGED_CROSSBOW_PVP;
    public static final  /* enum */ i MELEE_SPEAR_CRUSH;
    public static final  /* enum */ i RANGED_SHORTBOW;
    public static final  /* enum */ i RANGED_CHINCHOMPA;
    public static final  /* enum */ i MAGIC_STANDARD_BIND_STAFF;
    public static final  /* enum */ i MELEE_ABYSSAL_BLUDGEON_CRUSH;
    public static final  /* enum */ i MELEE_ABYSSAL_DAGGER_STAB;
    public static final  /* enum */ i MELEE_SCYTHE;
    public static final  /* enum */ i MELEE_VLS_SPEC;
    public static final  /* enum */ i MELEE_BATTLEAXE_CRUSH;
    public static final  /* enum */ i RANGED_BLOWPIPE;
    public static final  /* enum */ i RANGED_RUNE_KNIFE;
    public static final  /* enum */ i MELEE_VIGGORAS_CHAINMACE;
    public static final  /* enum */ i MELEE_SWORD_STAB;
    public static final  /* enum */ i MELEE_GODSWORD_DEFENSIVE;
    public static final  /* enum */ i MELEE_DAGGER_SLASH;
    public static final  /* enum */ i MELEE_BATTLEAXE_SLASH;
    public static final  /* enum */ i RANGED_ZARYTE_CROSSBOW;
    public static final  /* enum */ i MELEE_KICK;
    public static final  /* enum */ i MELEE_STAFF_CRUSH_3;
    public static final  /* enum */ i MELEE_PUNCH;
    public static final  /* enum */ i MELEE_ARMADYL_GODSWORD_SPEC;
    public static final  /* enum */ i MELEE_SCIM_SLASH;
    private static final  Map<Integer, i> DATA;
    public static final  /* enum */ i MAGIC_STANDARD_SURGE_STAFF;
    public static final  /* enum */ i MELEE_ARMADYL_GODSWORD_OR_SPEC;
    public static final  /* enum */ i MELEE_ZAMORAK_GODSWORD_OR_SPEC;
    public final  boolean isSpecial;
    public static final  /* enum */ i RANGED_BALLISTA;
    public static final  /* enum */ i MELEE_LEAF_BLADED_BATTLEAXE_CRUSH;
    public static final  /* enum */ i MAGIC_STANDARD_BIND;
    public static final  /* enum */ i MELEE_GRANITE_MAUL_SPEC;
    public static final  /* enum */ i MELEE_DRAGON_CLAWS_SPEC;
    public static final  /* enum */ i MELEE_FANG_SPEC;
    
    public static final  /* enum */ i RANGED_ZARYTE_CROSSBOW_PVP;
    public static final  /* enum */ i MELEE_SARADOMIN_GODSWORD_SPEC;
    public static final  /* enum */ i MELEE_MACE_STAB;
    public final  int animationId;
    public static final  /* enum */ i MAGIC_TUMEKENS_SHADOW;
    public static final  /* enum */ i MELEE_ABYSSAL_WHIP;
    public static final  /* enum */ i RANGED_DRAGON_KNIFE;
    public static final  /* enum */ i MAGIC_ANCIENT_MULTI_TARGET;
    public static final  /* enum */ i MELEE_GENERIC_SLASH;
    public static final  /* enum */ i MELEE_LANCE_SLASH;
    public static final  /* enum */ i MAGIC_STANDARD_STRIKE_BOLT_BLAST;
    public static final  /* enum */ i MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC;
    public static final  /* enum */ i MELEE_SPEAR_STAB;
    public static final  /* enum */ i MELEE_GODSWORD_CRUSH;
    public static final  /* enum */ i RANGED_MAGIC_SHORTBOW_SPEC;
    public static final  /* enum */ i MELEE_LEAF_BLADED_BATTLEAXE_SLASH;
    public static final  /* enum */ i MELEE_2H_SLASH;
    public static final  /* enum */ i RANGED_BALLISTA_2;
    public static final  /* enum */ i MELEE_SARADOMIN_GODSWORD_OR_SPEC;
    public static final  /* enum */ i MELEE_OBBY_MAUL_CRUSH;
    private static final  i[] $VALUES;
    public static final  /* enum */ i MELEE_CRYSTAL_HALBERD_SPEC;
    public static final  /* enum */ i RANGED_DRAGON_KNIFE_POISONED;
    public static final  /* enum */ i MELEE_DLONG_SPEC;
    public static final  /* enum */ i MELEE_GHAZI_RAPIER_STAB;
    public static final  /* enum */ i MELEE_GRANITE_MAUL;
    public static final  /* enum */ i MELEE_DHAROKS_GREATAXE_SLASH;
    public static final  /* enum */ i RANGED_DRAGON_THROWNAXE_SPEC;
    public static final  /* enum */ i MELEE_LANCE_STAB;
    public static final  /* enum */ i MELEE_ANCIENT_GODSWORD_SPEC;
    public static final  /* enum */ i MELEE_ELDER_MAUL;
    public static final  /* enum */ i MELEE_LANCE_CRUSH;
    public static final  /* enum */ i MELEE_STAFF_SLASH;
    public static final  /* enum */ i MELEE_STAFF_CRUSH_2;
    public static final  /* enum */ i MELEE_FANG_STAB;
    public static final  /* enum */ i MELEE_DRAGON_MACE_SPEC;
    public final  j attackStyle;
    public static final  /* enum */ i MELEE_BANDOS_GODSWORD_SPEC;
    public static final  /* enum */ i MELEE_STAFF_STAB;
    public static final  /* enum */ i MELEE_GODSWORD_SLASH;
    public static final  /* enum */ i MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF;
    public static final  /* enum */ i MELEE_STAFF_CRUSH;
    
    public static final  /* enum */ i RANGED_RUNE_KNIFE_PVP;
    public static final  /* enum */ i MAGIC_ANCIENT_SINGLE_TARGET;
    public static final  /* enum */ i MELEE_BARRELCHEST_ANCHOR_CRUSH;
    public static final  /* enum */ i MELEE_DHAROKS_GREATAXE_CRUSH;
    public static final  /* enum */ i MELEE_DRAGON_DAGGER_SPEC;
    public static final  /* enum */ i MELEE_BANDOS_GODSWORD_OR_SPEC;

    /*
     * WARNING - void declaration
     */
    static {
        block4: {
            void var1;
            i.lIllllIllIIllIl();
            i.lIllllIllIIllII();
            MELEE_VIGGORAS_CHAINMACE = new GameEnum(lIlIlIIIlllII[6], j.CRUSH);
            MELEE_DAGGER_SLASH = new GameEnum(lIlIlIIIlllII[8], j.SLASH);
            MELEE_SPEAR_STAB = new GameEnum(lIlIlIIIlllII[10], j.STAB);
            MELEE_SWORD_STAB = new GameEnum(lIlIlIIIlllII[12], j.STAB);
            MELEE_SCIM_SLASH = new GameEnum(lIlIlIIIlllII[14], j.SLASH);
            MELEE_LANCE_STAB = new GameEnum(lIlIlIIIlllII[16], j.STAB);
            MELEE_LANCE_CRUSH = new GameEnum(lIlIlIIIlllII[18], j.CRUSH);
            MELEE_LANCE_SLASH = new GameEnum(lIlIlIIIlllII[20], j.SLASH);
            MELEE_FANG_STAB = new GameEnum(lIlIlIIIlllII[22], j.STAB);
            MELEE_FANG_SPEC = new GameEnum(lIlIlIIIlllII[24], j.STAB, lIlIlIIIlllII[1]);
            MELEE_GENERIC_SLASH = new GameEnum(lIlIlIIIlllII[26], j.SLASH);
            MELEE_STAFF_CRUSH = new GameEnum(lIlIlIIIlllII[0], j.SLASH);
            MELEE_BATTLEAXE_SLASH = new GameEnum(lIlIlIIIlllII[29], j.SLASH);
            MELEE_MACE_STAB = new GameEnum(lIlIlIIIlllII[31], j.STAB);
            MELEE_BATTLEAXE_CRUSH = new GameEnum(lIlIlIIIlllII[33], j.CRUSH);
            MELEE_2H_CRUSH = new GameEnum(lIlIlIIIlllII[35], j.CRUSH);
            MELEE_2H_SLASH = new GameEnum(lIlIlIIIlllII[37], j.SLASH);
            MELEE_STAFF_CRUSH_2 = new GameEnum(lIlIlIIIlllII[39], j.CRUSH);
            MELEE_STAFF_CRUSH_3 = new GameEnum(lIlIlIIIlllII[41], j.CRUSH);
            MELEE_PUNCH = new GameEnum(lIlIlIIIlllII[43], j.CRUSH);
            MELEE_KICK = new GameEnum(lIlIlIIIlllII[45], j.CRUSH);
            MELEE_STAFF_STAB = new GameEnum(lIlIlIIIlllII[47], j.STAB);
            MELEE_SPEAR_CRUSH = new GameEnum(lIlIlIIIlllII[49], j.CRUSH);
            MELEE_STAFF_SLASH = new GameEnum(lIlIlIIIlllII[51], j.SLASH);
            MELEE_DLONG_SPEC = new GameEnum(lIlIlIIIlllII[53], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_DRAGON_MACE_SPEC = new GameEnum(lIlIlIIIlllII[55], j.CRUSH, lIlIlIIIlllII[1]);
            MELEE_DRAGON_DAGGER_SPEC = new GameEnum(lIlIlIIIlllII[57], j.STAB, lIlIlIIIlllII[1]);
            MELEE_DRAGON_WARHAMMER_SPEC = new GameEnum(lIlIlIIIlllII[59], j.CRUSH, lIlIlIIIlllII[1]);
            MELEE_ABYSSAL_WHIP = new GameEnum(lIlIlIIIlllII[61], j.SLASH);
            MELEE_GRANITE_MAUL = new GameEnum(lIlIlIIIlllII[63], j.CRUSH);
            MELEE_GRANITE_MAUL_SPEC = new GameEnum(lIlIlIIIlllII[65], j.CRUSH, lIlIlIIIlllII[1]);
            MELEE_DHAROKS_GREATAXE_CRUSH = new GameEnum(lIlIlIIIlllII[67], j.CRUSH);
            MELEE_DHAROKS_GREATAXE_SLASH = new GameEnum(lIlIlIIIlllII[69], j.SLASH);
            MELEE_AHRIMS_STAFF_CRUSH = new GameEnum(lIlIlIIIlllII[71], j.CRUSH);
            MELEE_OBBY_MAUL_CRUSH = new GameEnum(lIlIlIIIlllII[73], j.CRUSH);
            MELEE_ABYSSAL_DAGGER_STAB = new GameEnum(lIlIlIIIlllII[75], j.STAB);
            MELEE_ABYSSAL_BLUDGEON_CRUSH = new GameEnum(lIlIlIIIlllII[77], j.CRUSH);
            MELEE_LEAF_BLADED_BATTLEAXE_CRUSH = new GameEnum(lIlIlIIIlllII[79], j.CRUSH);
            MELEE_INQUISITORS_MACE = new GameEnum(lIlIlIIIlllII[81], j.CRUSH);
            MELEE_BARRELCHEST_ANCHOR_CRUSH = new GameEnum(lIlIlIIIlllII[83], j.CRUSH);
            MELEE_LEAF_BLADED_BATTLEAXE_SLASH = new GameEnum(lIlIlIIIlllII[85], j.SLASH);
            MELEE_GODSWORD_SLASH = new GameEnum(lIlIlIIIlllII[87], j.SLASH);
            MELEE_GODSWORD_CRUSH = new GameEnum(lIlIlIIIlllII[89], j.CRUSH);
            MELEE_GODSWORD_DEFENSIVE = new GameEnum(lIlIlIIIlllII[91], j.SLASH);
            MELEE_DRAGON_CLAWS_SPEC = new GameEnum(lIlIlIIIlllII[93], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_VLS_SPEC = new GameEnum(lIlIlIIIlllII[95], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_ELDER_MAUL = new GameEnum(lIlIlIIIlllII[97], j.CRUSH);
            MELEE_ZAMORAK_GODSWORD_SPEC = new GameEnum(lIlIlIIIlllII[99], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_ZAMORAK_GODSWORD_OR_SPEC = new GameEnum(lIlIlIIIlllII[101], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_SARADOMIN_GODSWORD_SPEC = new GameEnum(lIlIlIIIlllII[103], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_SARADOMIN_GODSWORD_OR_SPEC = new GameEnum(lIlIlIIIlllII[105], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_BANDOS_GODSWORD_SPEC = new GameEnum(lIlIlIIIlllII[107], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_BANDOS_GODSWORD_OR_SPEC = new GameEnum(lIlIlIIIlllII[109], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_ARMADYL_GODSWORD_SPEC = new GameEnum(lIlIlIIIlllII[111], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_ARMADYL_GODSWORD_OR_SPEC = new GameEnum(lIlIlIIIlllII[113], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_SCYTHE = new GameEnum(lIlIlIIIlllII[115], j.SLASH);
            MELEE_GHAZI_RAPIER_STAB = new GameEnum(lIlIlIIIlllII[117], j.STAB);
            MELEE_ANCIENT_GODSWORD_SPEC = new GameEnum(lIlIlIIIlllII[119], j.SLASH, lIlIlIIIlllII[1]);
            MELEE_CRYSTAL_HALBERD_SPEC = new GameEnum(lIlIlIIIlllII[121], j.SLASH, lIlIlIIIlllII[1]);
            RANGED_CHINCHOMPA = new GameEnum(lIlIlIIIlllII[123], j.RANGED);
            RANGED_SHORTBOW = new GameEnum(lIlIlIIIlllII[125], j.RANGED);
            RANGED_RUNE_KNIFE_PVP = new GameEnum(lIlIlIIIlllII[127], j.RANGED);
            RANGED_MAGIC_SHORTBOW_SPEC = new GameEnum(lIlIlIIIlllII[129], j.RANGED, lIlIlIIIlllII[1]);
            RANGED_CROSSBOW_PVP = new GameEnum(lIlIlIIIlllII[131], j.RANGED);
            RANGED_BLOWPIPE = new GameEnum(lIlIlIIIlllII[133], j.RANGED);
            RANGED_DARTS = new GameEnum(lIlIlIIIlllII[135], j.RANGED);
            RANGED_BALLISTA = new GameEnum(lIlIlIIIlllII[137], j.RANGED);
            RANGED_DRAGON_THROWNAXE_SPEC = new GameEnum(lIlIlIIIlllII[139], j.RANGED, lIlIlIIIlllII[1]);
            RANGED_RUNE_CROSSBOW = new GameEnum(lIlIlIIIlllII[141], j.RANGED);
            RANGED_BALLISTA_2 = new GameEnum(lIlIlIIIlllII[143], j.RANGED);
            RANGED_RUNE_KNIFE = new GameEnum(lIlIlIIIlllII[145], j.RANGED);
            RANGED_DRAGON_KNIFE = new GameEnum(lIlIlIIIlllII[147], j.RANGED);
            RANGED_DRAGON_KNIFE_POISONED = new GameEnum(lIlIlIIIlllII[149], j.RANGED);
            RANGED_DRAGON_KNIFE_SPEC = new GameEnum(lIlIlIIIlllII[151], j.RANGED, lIlIlIIIlllII[1]);
            RANGED_ZARYTE_CROSSBOW = new GameEnum(lIlIlIIIlllII[153], j.RANGED);
            RANGED_ZARYTE_CROSSBOW_PVP = new GameEnum(lIlIlIIIlllII[155], j.RANGED);
            MAGIC_STANDARD_BIND = new GameEnum(lIlIlIIIlllII[157], j.MAGIC);
            MAGIC_STANDARD_STRIKE_BOLT_BLAST = new GameEnum(lIlIlIIIlllII[159], j.MAGIC, lIlIlIIIlllII[27]);
            MAGIC_STANDARD_BIND_STAFF = new GameEnum(lIlIlIIIlllII[161], j.MAGIC);
            MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF = new GameEnum(lIlIlIIIlllII[163], j.MAGIC, lIlIlIIIlllII[27]);
            MAGIC_STANDARD_WAVE_STAFF = new GameEnum(lIlIlIIIlllII[165], j.MAGIC, lIlIlIIIlllII[34]);
            MAGIC_STANDARD_SURGE_STAFF = new GameEnum(lIlIlIIIlllII[167], j.MAGIC, lIlIlIIIlllII[42]);
            MAGIC_ANCIENT_SINGLE_TARGET = new GameEnum(lIlIlIIIlllII[169], j.MAGIC, lIlIlIIIlllII[46]);
            MAGIC_ANCIENT_MULTI_TARGET = new GameEnum(lIlIlIIIlllII[171], j.MAGIC, lIlIlIIIlllII[54]);
            MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC = new GameEnum(lIlIlIIIlllII[173], j.MAGIC, lIlIlIIIlllII[126]);
            MAGIC_TUMEKENS_SHADOW = new GameEnum(lIlIlIIIlllII[175], j.MAGIC);
            i[] iArray = new i[lIlIlIIIlllII[166]];
            iArray[i.lIlIlIIIlllII[0]] = MELEE_VIGGORAS_CHAINMACE;
            iArray[i.lIlIlIIIlllII[1]] = MELEE_DAGGER_SLASH;
            iArray[i.lIlIlIIIlllII[2]] = MELEE_SPEAR_STAB;
            iArray[i.lIlIlIIIlllII[3]] = MELEE_SWORD_STAB;
            iArray[i.lIlIlIIIlllII[4]] = MELEE_SCIM_SLASH;
            iArray[i.lIlIlIIIlllII[5]] = MELEE_LANCE_STAB;
            iArray[i.lIlIlIIIlllII[7]] = MELEE_LANCE_CRUSH;
            iArray[i.lIlIlIIIlllII[9]] = MELEE_LANCE_SLASH;
            iArray[i.lIlIlIIIlllII[11]] = MELEE_FANG_STAB;
            iArray[i.lIlIlIIIlllII[13]] = MELEE_FANG_SPEC;
            iArray[i.lIlIlIIIlllII[15]] = MELEE_GENERIC_SLASH;
            iArray[i.lIlIlIIIlllII[17]] = MELEE_STAFF_CRUSH;
            iArray[i.lIlIlIIIlllII[19]] = MELEE_BATTLEAXE_SLASH;
            iArray[i.lIlIlIIIlllII[21]] = MELEE_MACE_STAB;
            iArray[i.lIlIlIIIlllII[23]] = MELEE_BATTLEAXE_CRUSH;
            iArray[i.lIlIlIIIlllII[25]] = MELEE_2H_CRUSH;
            iArray[i.lIlIlIIIlllII[27]] = MELEE_2H_SLASH;
            iArray[i.lIlIlIIIlllII[28]] = MELEE_STAFF_CRUSH_2;
            iArray[i.lIlIlIIIlllII[30]] = MELEE_STAFF_CRUSH_3;
            iArray[i.lIlIlIIIlllII[32]] = MELEE_PUNCH;
            iArray[i.lIlIlIIIlllII[34]] = MELEE_KICK;
            iArray[i.lIlIlIIIlllII[36]] = MELEE_STAFF_STAB;
            iArray[i.lIlIlIIIlllII[38]] = MELEE_SPEAR_CRUSH;
            iArray[i.lIlIlIIIlllII[40]] = MELEE_STAFF_SLASH;
            iArray[i.lIlIlIIIlllII[42]] = MELEE_DLONG_SPEC;
            iArray[i.lIlIlIIIlllII[44]] = MELEE_DRAGON_MACE_SPEC;
            iArray[i.lIlIlIIIlllII[46]] = MELEE_DRAGON_DAGGER_SPEC;
            iArray[i.lIlIlIIIlllII[48]] = MELEE_DRAGON_WARHAMMER_SPEC;
            iArray[i.lIlIlIIIlllII[50]] = MELEE_ABYSSAL_WHIP;
            iArray[i.lIlIlIIIlllII[52]] = MELEE_GRANITE_MAUL;
            iArray[i.lIlIlIIIlllII[54]] = MELEE_GRANITE_MAUL_SPEC;
            iArray[i.lIlIlIIIlllII[56]] = MELEE_DHAROKS_GREATAXE_CRUSH;
            iArray[i.lIlIlIIIlllII[58]] = MELEE_DHAROKS_GREATAXE_SLASH;
            iArray[i.lIlIlIIIlllII[60]] = MELEE_AHRIMS_STAFF_CRUSH;
            iArray[i.lIlIlIIIlllII[62]] = MELEE_OBBY_MAUL_CRUSH;
            iArray[i.lIlIlIIIlllII[64]] = MELEE_ABYSSAL_DAGGER_STAB;
            iArray[i.lIlIlIIIlllII[66]] = MELEE_ABYSSAL_BLUDGEON_CRUSH;
            iArray[i.lIlIlIIIlllII[68]] = MELEE_LEAF_BLADED_BATTLEAXE_CRUSH;
            iArray[i.lIlIlIIIlllII[70]] = MELEE_INQUISITORS_MACE;
            iArray[i.lIlIlIIIlllII[72]] = MELEE_BARRELCHEST_ANCHOR_CRUSH;
            iArray[i.lIlIlIIIlllII[74]] = MELEE_LEAF_BLADED_BATTLEAXE_SLASH;
            iArray[i.lIlIlIIIlllII[76]] = MELEE_GODSWORD_SLASH;
            iArray[i.lIlIlIIIlllII[78]] = MELEE_GODSWORD_CRUSH;
            iArray[i.lIlIlIIIlllII[80]] = MELEE_GODSWORD_DEFENSIVE;
            iArray[i.lIlIlIIIlllII[82]] = MELEE_DRAGON_CLAWS_SPEC;
            iArray[i.lIlIlIIIlllII[84]] = MELEE_VLS_SPEC;
            iArray[i.lIlIlIIIlllII[86]] = MELEE_ELDER_MAUL;
            iArray[i.lIlIlIIIlllII[88]] = MELEE_ZAMORAK_GODSWORD_SPEC;
            iArray[i.lIlIlIIIlllII[90]] = MELEE_ZAMORAK_GODSWORD_OR_SPEC;
            iArray[i.lIlIlIIIlllII[92]] = MELEE_SARADOMIN_GODSWORD_SPEC;
            iArray[i.lIlIlIIIlllII[94]] = MELEE_SARADOMIN_GODSWORD_OR_SPEC;
            iArray[i.lIlIlIIIlllII[96]] = MELEE_BANDOS_GODSWORD_SPEC;
            iArray[i.lIlIlIIIlllII[98]] = MELEE_BANDOS_GODSWORD_OR_SPEC;
            iArray[i.lIlIlIIIlllII[100]] = MELEE_ARMADYL_GODSWORD_SPEC;
            iArray[i.lIlIlIIIlllII[102]] = MELEE_ARMADYL_GODSWORD_OR_SPEC;
            iArray[i.lIlIlIIIlllII[104]] = MELEE_SCYTHE;
            iArray[i.lIlIlIIIlllII[106]] = MELEE_GHAZI_RAPIER_STAB;
            iArray[i.lIlIlIIIlllII[108]] = MELEE_ANCIENT_GODSWORD_SPEC;
            iArray[i.lIlIlIIIlllII[110]] = MELEE_CRYSTAL_HALBERD_SPEC;
            iArray[i.lIlIlIIIlllII[112]] = RANGED_CHINCHOMPA;
            iArray[i.lIlIlIIIlllII[114]] = RANGED_SHORTBOW;
            iArray[i.lIlIlIIIlllII[116]] = RANGED_RUNE_KNIFE_PVP;
            iArray[i.lIlIlIIIlllII[118]] = RANGED_MAGIC_SHORTBOW_SPEC;
            iArray[i.lIlIlIIIlllII[120]] = RANGED_CROSSBOW_PVP;
            iArray[i.lIlIlIIIlllII[122]] = RANGED_BLOWPIPE;
            iArray[i.lIlIlIIIlllII[124]] = RANGED_DARTS;
            iArray[i.lIlIlIIIlllII[126]] = RANGED_BALLISTA;
            iArray[i.lIlIlIIIlllII[128]] = RANGED_DRAGON_THROWNAXE_SPEC;
            iArray[i.lIlIlIIIlllII[130]] = RANGED_RUNE_CROSSBOW;
            iArray[i.lIlIlIIIlllII[132]] = RANGED_BALLISTA_2;
            iArray[i.lIlIlIIIlllII[134]] = RANGED_RUNE_KNIFE;
            iArray[i.lIlIlIIIlllII[136]] = RANGED_DRAGON_KNIFE;
            iArray[i.lIlIlIIIlllII[138]] = RANGED_DRAGON_KNIFE_POISONED;
            iArray[i.lIlIlIIIlllII[140]] = RANGED_DRAGON_KNIFE_SPEC;
            iArray[i.lIlIlIIIlllII[142]] = RANGED_ZARYTE_CROSSBOW;
            iArray[i.lIlIlIIIlllII[144]] = RANGED_ZARYTE_CROSSBOW_PVP;
            iArray[i.lIlIlIIIlllII[146]] = MAGIC_STANDARD_BIND;
            iArray[i.lIlIlIIIlllII[148]] = MAGIC_STANDARD_STRIKE_BOLT_BLAST;
            iArray[i.lIlIlIIIlllII[150]] = MAGIC_STANDARD_BIND_STAFF;
            iArray[i.lIlIlIIIlllII[152]] = MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF;
            iArray[i.lIlIlIIIlllII[154]] = MAGIC_STANDARD_WAVE_STAFF;
            iArray[i.lIlIlIIIlllII[156]] = MAGIC_STANDARD_SURGE_STAFF;
            iArray[i.lIlIlIIIlllII[158]] = MAGIC_ANCIENT_SINGLE_TARGET;
            iArray[i.lIlIlIIIlllII[160]] = MAGIC_ANCIENT_MULTI_TARGET;
            iArray[i.lIlIlIIIlllII[162]] = MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC;
            iArray[i.lIlIlIIIlllII[164]] = MAGIC_TUMEKENS_SHADOW;
            $VALUES = iArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            i[] iArray2 = i.values();
            int n2 = iArray2.length;
            int var2 = lIlIlIIIlllII[0];
            while (i.lIllllIllIlIIIl(var2, (int)var1)) {
                void var3;
                void var4 = var3[var2];
                if (i.lIllllIllIlIIlI(var4.animationId)) {

                    }
                } else {
                    void var5;
                    var5.put((Object)var4.animationId, (Object)var4);

                }
                ++var2;

                break block4;
            }
            DATA = builder.build();
        }
    }

        return String.valueOf(var6);
    }

    private static boolean lIllllIllIIlllI(Object object) {
        return object == null;
    }

    public String toString() {
        CharSequence[] charSequenceArray = super.toString().toLowerCase().split(lIlIlIIIlIlII[lIlIlIIIlllII[3]]);
        Arrays.stream(charSequenceArray).collect(Collectors.toList()).toArray(charSequenceArray);

        return String.join((CharSequence)lIlIlIIIlIlII[lIlIlIIIlllII[4]], charSequenceArray);
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static boolean lIllllIllIIllll(Object object, Object object2) {
        return object != object2;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private GameEnum(int n3, j j2, boolean bl) {
        if (i.lIllllIllIIlllI((Object)j2)) {
            throw new InvalidParameterException(lIlIlIIIlIlII[lIlIlIIIlllII[1]]);
        }
        this.animationId = n3;
        this.attackStyle = j2;
        this.isSpecial = bl;
        this.baseSpellDamage = lIlIlIIIlllII[0];
    }

    public static boolean b(i i2) {
        boolean bl;
        if (!i.lIllllIllIIllll((Object)i2, (Object)MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF) || !i.lIllllIllIIllll((Object)i2, (Object)MAGIC_STANDARD_STRIKE_BOLT_BLAST) || !i.lIllllIllIIllll((Object)i2, (Object)MAGIC_STANDARD_WAVE_STAFF) || i.lIllllIllIlIIII((Object)i2, (Object)MAGIC_STANDARD_SURGE_STAFF)) {
            bl = lIlIlIIIlllII[1];

            if (((0xB8 ^ 0xBC) & ~(0x80 ^ 0x84)) < 0) {
                return false;
            }
        } else {
            bl = lIlIlIIIlllII[0];
        }
        return bl;
    }

    private static void lIllllIllIIllII() {
        lIlIlIIIlIlII = new String[lIlIlIIIlllII[176]];
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[0]] = "Attack Style must be valid for AnimationData";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[1]] = "Attack Style must be valid for AnimationData";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[2]] = "Attack Style and Attack Type must be valid for AnimationData";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[3]] = "_";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[4]] = " ";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[5]] = "MELEE_VIGGORAS_CHAINMACE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[7]] = "MELEE_DAGGER_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[9]] = "MELEE_SPEAR_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[11]] = "MELEE_SWORD_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[13]] = "MELEE_SCIM_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[15]] = "MELEE_LANCE_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[17]] = "MELEE_LANCE_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[19]] = "MELEE_LANCE_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[21]] = "MELEE_FANG_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[23]] = "MELEE_FANG_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[25]] = "MELEE_GENERIC_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[27]] = "MELEE_STAFF_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[28]] = "MELEE_BATTLEAXE_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[30]] = "MELEE_MACE_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[32]] = "MELEE_BATTLEAXE_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[34]] = "MELEE_2H_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[36]] = "MELEE_2H_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[38]] = "MELEE_STAFF_CRUSH_2";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[40]] = "MELEE_STAFF_CRUSH_3";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[42]] = "MELEE_PUNCH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[44]] = "MELEE_KICK";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[46]] = "MELEE_STAFF_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[48]] = "MELEE_SPEAR_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[50]] = "MELEE_STAFF_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[52]] = "MELEE_DLONG_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[54]] = "MELEE_DRAGON_MACE_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[56]] = "MELEE_DRAGON_DAGGER_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[58]] = "MELEE_DRAGON_WARHAMMER_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[60]] = "MELEE_ABYSSAL_WHIP";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[62]] = "MELEE_GRANITE_MAUL";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[64]] = "MELEE_GRANITE_MAUL_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[66]] = "MELEE_DHAROKS_GREATAXE_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[68]] = "MELEE_DHAROKS_GREATAXE_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[70]] = "MELEE_AHRIMS_STAFF_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[72]] = "MELEE_OBBY_MAUL_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[74]] = "MELEE_ABYSSAL_DAGGER_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[76]] = "MELEE_ABYSSAL_BLUDGEON_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[78]] = "MELEE_LEAF_BLADED_BATTLEAXE_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[80]] = "MELEE_INQUISITORS_MACE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[82]] = "MELEE_BARRELCHEST_ANCHOR_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[84]] = "MELEE_LEAF_BLADED_BATTLEAXE_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[86]] = "MELEE_GODSWORD_SLASH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[88]] = "MELEE_GODSWORD_CRUSH";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[90]] = "MELEE_GODSWORD_DEFENSIVE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[92]] = "MELEE_DRAGON_CLAWS_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[94]] = "MELEE_VLS_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[96]] = "MELEE_ELDER_MAUL";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[98]] = "MELEE_ZAMORAK_GODSWORD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[100]] = "MELEE_ZAMORAK_GODSWORD_OR_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[102]] = "MELEE_SARADOMIN_GODSWORD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[104]] = "MELEE_SARADOMIN_GODSWORD_OR_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[106]] = "MELEE_BANDOS_GODSWORD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[108]] = "MELEE_BANDOS_GODSWORD_OR_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[110]] = "MELEE_ARMADYL_GODSWORD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[112]] = "MELEE_ARMADYL_GODSWORD_OR_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[114]] = "MELEE_SCYTHE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[116]] = "MELEE_GHAZI_RAPIER_STAB";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[118]] = "MELEE_ANCIENT_GODSWORD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[120]] = "MELEE_CRYSTAL_HALBERD_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[122]] = "RANGED_CHINCHOMPA";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[124]] = "RANGED_SHORTBOW";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[126]] = "RANGED_RUNE_KNIFE_PVP";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[128]] = "RANGED_MAGIC_SHORTBOW_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[130]] = "RANGED_CROSSBOW_PVP";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[132]] = "RANGED_BLOWPIPE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[134]] = "RANGED_DARTS";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[136]] = "RANGED_BALLISTA";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[138]] = "RANGED_DRAGON_THROWNAXE_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[140]] = "RANGED_RUNE_CROSSBOW";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[142]] = "RANGED_BALLISTA_2";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[144]] = "RANGED_RUNE_KNIFE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[146]] = "RANGED_DRAGON_KNIFE";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[148]] = "RANGED_DRAGON_KNIFE_POISONED";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[150]] = "RANGED_DRAGON_KNIFE_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[152]] = "RANGED_ZARYTE_CROSSBOW";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[154]] = "RANGED_ZARYTE_CROSSBOW_PVP";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[156]] = "MAGIC_STANDARD_BIND";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[158]] = "MAGIC_STANDARD_STRIKE_BOLT_BLAST";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[160]] = "MAGIC_STANDARD_BIND_STAFF";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[162]] = "MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[164]] = "MAGIC_STANDARD_WAVE_STAFF";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[166]] = "MAGIC_STANDARD_SURGE_STAFF";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[168]] = "MAGIC_ANCIENT_SINGLE_TARGET";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[170]] = "MAGIC_ANCIENT_MULTI_TARGET";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[172]] = "MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC";
        i.lIlIlIIIlIlII[i.lIlIlIIIlllII[174]] = "MAGIC_TUMEKENS_SHADOW";
    }

    private static boolean lIllllIllIlIIII(Object object, Object object2) {
        return object == object2;
    }

    private GameEnum(int n3, j j2, int n4) {
        if (i.lIllllIllIIlllI((Object)j2)) {
            throw new InvalidParameterException(lIlIlIIIlIlII[lIlIlIIIlllII[2]]);
        }
        this.animationId = n3;
        this.attackStyle = j2;
        this.isSpecial = lIlIlIIIlllII[0];
        this.baseSpellDamage = n4;
    }

    public static i d(int n2) {
        return DATA.get(n2);
    }

    public static boolean a(i i2) {
        int n2;
        if (!i.lIllllIllIIllll((Object)i2, (Object)MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF) || !i.lIllllIllIIllll((Object)i2, (Object)MAGIC_STANDARD_WAVE_STAFF) || i.lIllllIllIlIIII((Object)i2, (Object)MAGIC_STANDARD_SURGE_STAFF)) {
            n2 = lIlIlIIIlllII[1];

            }
        } else {
            n2 = lIlIlIIIlllII[0];
        }
        return n2 != 0;
    }

    private static boolean lIllllIllIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllllIllIlIIlI(int n2) {
        return n2 <= 0;
    }

    private GameEnum(int n3, j j2) {
        if (i.lIllllIllIIlllI((Object)j2)) {
            throw new InvalidParameterException(lIlIlIIIlIlII[lIlIlIIIlllII[0]]);
        }
        this.animationId = n3;
        this.attackStyle = j2;
        this.isSpecial = lIlIlIIIlllII[0];
        this.baseSpellDamage = lIlIlIIIlllII[0];
    }
}

