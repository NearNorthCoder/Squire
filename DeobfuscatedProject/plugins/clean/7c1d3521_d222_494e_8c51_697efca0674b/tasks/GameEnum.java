/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.7c1d3521-d222-494e-8c51-697efca0674b.tasks;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i DRAGON_1;
    public static final  /* enum */ i TERRORBIRD_1;
    public static final  /* enum */ i WYVERN_1;
    public static final  /* enum */ i DRAGON_3;
    public static final  /* enum */ i LIZARD_3;
    public static final  /* enum */ i LEECH_6;
    public static final  /* enum */ i SNAIL_4;
    public static final  /* enum */ i KALPHITE_2;
    public static final  /* enum */ i WYVERN_3;
    public static final  /* enum */ i LEECH_1;
    public static final  /* enum */ i SLUG_5;
    
    public static final  /* enum */ i SNAIL_5;
    public static final  /* enum */ i LEECH_5;
    public static final  /* enum */ i MOLE_4;
    public static final  /* enum */ i CAMEL_1;
    public static final  /* enum */ i WYVERN_6;
    public static final  /* enum */ i SNAKE_1;
    public static final  /* enum */ i WYVERN_2;
    public static final  /* enum */ i SLUG_2;
    public static final  /* enum */ i TORTOISE_1;
    public static final  /* enum */ i MONKEY_6;
    public static final  /* enum */ i SNAKE_3;
    public static final  /* enum */ i SNAIL_2;
    public static final  /* enum */ i MONKEY_3;
    public static final  /* enum */ i LIZARD_5;
    public static final  /* enum */ i MONKEY_2;
    public static final  /* enum */ i TORTOISE_3;
    public static final  /* enum */ i SNAKE_6;
    public static final  /* enum */ i MONKEY_4;
    public static final  /* enum */ i TORTOISE_6;
    public static final  /* enum */ i PENGUIN_1;
    
    public static final  /* enum */ i CAMEL_2;
    public static final  /* enum */ i PENGUIN_4;
    private final  String question;
    public static final  /* enum */ i MOLE_3;
    public static final  /* enum */ i LIZARD_2;
    public static final  /* enum */ i MONKEY_1;
    public static final  /* enum */ i TERRORBIRD_6;
    public static final  /* enum */ i SLUG_4;
    public static final  /* enum */ i TORTOISE_2;
    public static final  /* enum */ i KALPHITE_5;
    public static final  /* enum */ i DRAGON_4;
    public static final  /* enum */ i MOLE_6;
    public static final  /* enum */ i LEECH_2;
    public static final  /* enum */ i PENGUIN_3;
    public static final  /* enum */ i LEECH_4;
    public static final  /* enum */ i SLUG_1;
    public static final  /* enum */ i SNAKE_4;
    public static final  /* enum */ i KALPHITE_1;
    public static final  /* enum */ i PENGUIN_5;
    public static final  /* enum */ i SNAKE_5;
    public static final  /* enum */ i CAMEL_6;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ i MONKEY_5;
    public static final  /* enum */ i LEECH_3;
    public static final  /* enum */ i PENGUIN_6;
    public static final  /* enum */ i LIZARD_4;
    public static final  /* enum */ i SLUG_3;
    public static final  /* enum */ i MOLE_5;
    public static final  /* enum */ i TERRORBIRD_3;
    public static final  /* enum */ i DRAGON_2;
    public static final  /* enum */ i SNAIL_6;
    public static final  /* enum */ i PENGUIN_2;
    public static final  /* enum */ i TERRORBIRD_2;
    public static final  /* enum */ i WYVERN_5;
    public static final  /* enum */ i WYVERN_4;
    public static final  /* enum */ i TORTOISE_5;
    public static final  /* enum */ i TERRORBIRD_4;
    public static final  /* enum */ i CAMEL_4;
    public static final  /* enum */ i SNAIL_1;
    public static final  /* enum */ i DRAGON_5;
    private static final  i[] $VALUES;
    public static final  /* enum */ i DRAGON_6;
    public static final  /* enum */ i KALPHITE_3;
    public static final  /* enum */ i KALPHITE_6;
    public static final  /* enum */ i CAMEL_3;
    public static final  /* enum */ i SNAIL_3;
    public static final  /* enum */ i SNAKE_2;
    public static final  /* enum */ i LIZARD_6;
    public static final  /* enum */ i TORTOISE_4;
    public static final  /* enum */ i KALPHITE_4;
    public static final  /* enum */ i MOLE_2;
    public static final  /* enum */ i TERRORBIRD_5;
    public static final  /* enum */ i LIZARD_1;
    public static final  /* enum */ i CAMEL_5;
    public static final  /* enum */ i SLUG_6;
    public static final  /* enum */ i MOLE_1;
    private final  String answer;

    public String ab() {
        return this.answer;
    }

    private static void lIlIIIlIlIlIl() {
        llIIIIIIII = new String[llIIIIIIll[252]];
        i.llIIIIIIII[i.llIIIIIIll[0]] = "LIZARD_1";
        i.llIIIIIIII[i.llIIIIIIll[1]] = "How does a lizard regulate body heat?";
        i.llIIIIIIII[i.llIIIIIIll[2]] = "Sunlight.";
        i.llIIIIIIII[i.llIIIIIIll[3]] = "LIZARD_2";
        i.llIIIIIIII[i.llIIIIIIll[4]] = "Who discovered how to kill lizards?";
        i.llIIIIIIII[i.llIIIIIIll[5]] = "The Slayer Masters.";
        i.llIIIIIIII[i.llIIIIIIll[6]] = "LIZARD_3";
        i.llIIIIIIII[i.llIIIIIIll[7]] = "How many eyes does a lizard have?";
        i.llIIIIIIII[i.llIIIIIIll[8]] = "Three.";
        i.llIIIIIIII[i.llIIIIIIll[9]] = "LIZARD_4";
        i.llIIIIIIII[i.llIIIIIIll[10]] = "What order do lizards belong to?";
        i.llIIIIIIII[i.llIIIIIIll[11]] = "Squamata.";
        i.llIIIIIIII[i.llIIIIIIll[12]] = "LIZARD_5";
        i.llIIIIIIII[i.llIIIIIIll[13]] = "What happens when a lizard becomes cold?";
        i.llIIIIIIII[i.llIIIIIIll[14]] = "It becomes sleepy.";
        i.llIIIIIIII[i.llIIIIIIll[15]] = "LIZARD_6";
        i.llIIIIIIII[i.llIIIIIIll[16]] = "Lizard skin is made of the same substance as?";
        i.llIIIIIIII[i.llIIIIIIll[17]] = "Hair.";
        i.llIIIIIIII[i.llIIIIIIll[18]] = "TORTOISE_1";
        i.llIIIIIIII[i.llIIIIIIll[19]] = "What is the name of the oldest tortoise ever recorded?";
        i.llIIIIIIII[i.llIIIIIIll[20]] = "Mibbiwocket.";
        i.llIIIIIIII[i.llIIIIIIll[21]] = "TORTOISE_2";
        i.llIIIIIIII[i.llIIIIIIll[22]] = "What is a tortoise's favourite food?";
        i.llIIIIIIII[i.llIIIIIIll[23]] = "Vegetables.";
        i.llIIIIIIII[i.llIIIIIIll[24]] = "TORTOISE_3";
        i.llIIIIIIII[i.llIIIIIIll[25]] = "Name the explorer who discovered the world's oldest tortoise.";
        i.llIIIIIIII[i.llIIIIIIll[26]] = "Admiral Bake.";
        i.llIIIIIIII[i.llIIIIIIll[27]] = "TORTOISE_4";
        i.llIIIIIIII[i.llIIIIIIll[28]] = "How does the tortoise protect itself?";
        i.llIIIIIIII[i.llIIIIIIll[29]] = "Hard shell.";
        i.llIIIIIIII[i.llIIIIIIll[30]] = "TORTOISE_5";
        i.llIIIIIIII[i.llIIIIIIll[31]] = "If a tortoise had twenty rings on its shell, how old would it be?";
        i.llIIIIIIII[i.llIIIIIIll[32]] = "Twenty years.";
        i.llIIIIIIII[i.llIIIIIIll[33]] = "TORTOISE_6";
        i.llIIIIIIII[i.llIIIIIIll[34]] = "Which race breeds tortoises for battle?";
        i.llIIIIIIII[i.llIIIIIIll[35]] = "Gnomes.";
        i.llIIIIIIII[i.llIIIIIIll[36]] = "DRAGON_1";
        i.llIIIIIIII[i.llIIIIIIll[37]] = "What is considered a delicacy by dragons?";
        i.llIIIIIIII[i.llIIIIIIll[38]] = "Runite.";
        i.llIIIIIIII[i.llIIIIIIll[39]] = "DRAGON_2";
        i.llIIIIIIII[i.llIIIIIIll[40]] = "What is the best defence against a dragon's attack?";
        i.llIIIIIIII[i.llIIIIIIll[41]] = "Anti dragon-breath shield.";
        i.llIIIIIIII[i.llIIIIIIll[42]] = "DRAGON_3";
        i.llIIIIIIII[i.llIIIIIIll[43]] = "How long do dragons live?";
        i.llIIIIIIII[i.llIIIIIIll[44]] = "Unknown.";
        i.llIIIIIIII[i.llIIIIIIll[45]] = "DRAGON_4";
        i.llIIIIIIII[i.llIIIIIIll[46]] = "Which of these is not a type of dragon?";
        i.llIIIIIIII[i.llIIIIIIll[47]] = "Elemental.";
        i.llIIIIIIII[i.llIIIIIIll[48]] = "DRAGON_5";
        i.llIIIIIIII[i.llIIIIIIll[49]] = "What is the favoured territory of a dragon?";
        i.llIIIIIIII[i.llIIIIIIll[50]] = "Old battle sites.";
        i.llIIIIIIII[i.llIIIIIIll[51]] = "DRAGON_6";
        i.llIIIIIIII[i.llIIIIIIll[52]] = "Approximately how many feet tall do dragons stand?";
        i.llIIIIIIII[i.llIIIIIIll[53]] = "Twelve.";
        i.llIIIIIIII[i.llIIIIIIll[54]] = "WYVERN_1";
        i.llIIIIIIII[i.llIIIIIIll[55]] = "How did the wyverns die out?";
        i.llIIIIIIII[i.llIIIIIIll[56]] = "Climate change.";
        i.llIIIIIIII[i.llIIIIIIll[57]] = "WYVERN_2";
        i.llIIIIIIII[i.llIIIIIIll[58]] = "How many legs does a wyvern have?";
        i.llIIIIIIII[i.llIIIIIIll[59]] = "Two.";
        i.llIIIIIIII[i.llIIIIIIll[60]] = "WYVERN_3";
        i.llIIIIIIII[i.llIIIIIIll[61]] = "Where have wyvern bones been found?";
        i.llIIIIIIII[i.llIIIIIIll[62]] = "Asgarnia.";
        i.llIIIIIIII[i.llIIIIIIll[63]] = "WYVERN_4";
        i.llIIIIIIII[i.llIIIIIIll[64]] = "Which genus does the wyvern theoretically belong to?";
        i.llIIIIIIII[i.llIIIIIIll[65]] = "Reptiles.";
        i.llIIIIIIII[i.llIIIIIIll[66]] = "WYVERN_5";
        i.llIIIIIIII[i.llIIIIIIll[67]] = "What are the wyverns' closest relations?";
        i.llIIIIIIII[i.llIIIIIIll[68]] = "Dragons.";
        i.llIIIIIIII[i.llIIIIIIll[69]] = "WYVERN_6";
        i.llIIIIIIII[i.llIIIIIIll[70]] = "What is the ambient temperature of wyvern bones?";
        i.llIIIIIIII[i.llIIIIIIll[71]] = "Below room temperature.";
        i.llIIIIIIII[i.llIIIIIIll[72]] = "SNAIL_1";
        i.llIIIIIIII[i.llIIIIIIll[73]] = "What is special about the shell of the giant Morytanian snail?";
        i.llIIIIIIII[i.llIIIIIIll[74]] = "It is resistant to acid.";
        i.llIIIIIIII[i.llIIIIIIll[75]] = "SNAIL_2";
        i.llIIIIIIII[i.llIIIIIIll[76]] = "How do Morytanian snails capture their prey?";
        i.llIIIIIIII[i.llIIIIIIll[77]] = "Spitting acid.";
        i.llIIIIIIII[i.llIIIIIIll[78]] = "SNAIL_3";
        i.llIIIIIIII[i.llIIIIIIll[79]] = "Which of these is a snail byproduct?";
        i.llIIIIIIII[i.llIIIIIIll[80]] = "Fireproof oil.";
        i.llIIIIIIII[i.llIIIIIIll[81]] = "SNAIL_4";
        i.llIIIIIIII[i.llIIIIIIll[82]] = "What does 'Achatina Acidia' mean?";
        i.llIIIIIIII[i.llIIIIIIll[83]] = "Acid-spitting snail.";
        i.llIIIIIIII[i.llIIIIIIll[84]] = "SNAIL_5";
        i.llIIIIIIII[i.llIIIIIIll[85]] = "How do snails move?";
        i.llIIIIIIII[i.llIIIIIIll[86]] = "Contracting and stretching.";
        i.llIIIIIIII[i.llIIIIIIll[87]] = "SNAIL_6";
        i.llIIIIIIII[i.llIIIIIIll[88]] = "What is the 'trapdoor', which snails use to cover the entrance to their shells called?";
        i.llIIIIIIII[i.llIIIIIIll[89]] = "An operculum.";
        i.llIIIIIIII[i.llIIIIIIll[90]] = "SNAKE_1";
        i.llIIIIIIII[i.llIIIIIIll[91]] = "What is snake venom adapted from?";
        i.llIIIIIIII[i.llIIIIIIll[92]] = "Stomach acid.";
        i.llIIIIIIII[i.llIIIIIIll[93]] = "SNAKE_2";
        i.llIIIIIIII[i.llIIIIIIll[94]] = "Aside from their noses, what do snakes use to smell?";
        i.llIIIIIIII[i.llIIIIIIll[95]] = "Tongue.";
        i.llIIIIIIII[i.llIIIIIIll[96]] = "SNAKE_3";
        i.llIIIIIIII[i.llIIIIIIll[97]] = "If a snake sticks its tongue out at you, what is it doing?";
        i.llIIIIIIII[i.llIIIIIIll[98]] = "Seeing how you smell.";
        i.llIIIIIIII[i.llIIIIIIll[99]] = "SNAKE_4";
        i.llIIIIIIII[i.llIIIIIIll[100]] = "If some snakes use venom to kill their prey, what do other snakes use?";
        i.llIIIIIIII[i.llIIIIIIll[101]] = "Constriction.";
        i.llIIIIIIII[i.llIIIIIIll[102]] = "SNAKE_5";
        i.llIIIIIIII[i.llIIIIIIll[103]] = "Lizards and snakes belong to the same order - what is it?";
        i.llIIIIIIII[i.llIIIIIIll[104]] = "Squamata.";
        i.llIIIIIIII[i.llIIIIIIll[105]] = "SNAKE_6";
        i.llIIIIIIII[i.llIIIIIIll[106]] = "Which habitat do snakes prefer?";
        i.llIIIIIIII[i.llIIIIIIll[107]] = "Anywhere.";
        i.llIIIIIIII[i.llIIIIIIll[108]] = "SLUG_1";
        i.llIIIIIIII[i.llIIIIIIll[109]] = "We assume that sea slugs have a stinging organ on their soft skin - what is it called?";
        i.llIIIIIIII[i.llIIIIIIll[110]] = "Nematocysts.";
        i.llIIIIIIII[i.llIIIIIIll[111]] = "SLUG_2";
        i.llIIIIIIII[i.llIIIIIIll[112]] = "Why has the museum never examined a live sea slug?";
        i.llIIIIIIII[i.llIIIIIIll[113]] = "The researchers keep vanishing.";
        i.llIIIIIIII[i.llIIIIIIll[114]] = "SLUG_3";
        i.llIIIIIIII[i.llIIIIIIll[115]] = "What do we think the sea slug feeds upon?";
        i.llIIIIIIII[i.llIIIIIIll[116]] = "Seaweed.";
        i.llIIIIIIII[i.llIIIIIIll[117]] = "SLUG_4";
        i.llIIIIIIII[i.llIIIIIIll[118]] = "What are the two fangs presumed to be used for?";
        i.llIIIIIIII[i.llIIIIIIll[119]] = "Defense or display.";
        i.llIIIIIIII[i.llIIIIIIll[120]] = "SLUG_5";
        i.llIIIIIIII[i.llIIIIIIll[121]] = "Off of which coastline would you find sea slugs?";
        i.llIIIIIIII[i.llIIIIIIll[122]] = "Ardougne.";
        i.llIIIIIIII[i.llIIIIIIll[123]] = "SLUG_6";
        i.llIIIIIIII[i.llIIIIIIll[124]] = "In what way are sea slugs similar to snails?";
        i.llIIIIIIII[i.llIIIIIIll[125]] = "They have a hard shell.";
        i.llIIIIIIII[i.llIIIIIIll[126]] = "MONKEY_1";
        i.llIIIIIIII[i.llIIIIIIll[127]] = "Which type of primates do monkeys belong to?";
        i.llIIIIIIII[i.llIIIIIIll[128]] = "Simian.";
        i.llIIIIIIII[i.llIIIIIIll[129]] = "MONKEY_2";
        i.llIIIIIIII[i.llIIIIIIll[130]] = "Which have the lighter colour: Karamjan or Harmless monkeys?";
        i.llIIIIIIII[i.llIIIIIIll[131]] = "Harmless.";
        i.llIIIIIIII[i.llIIIIIIll[132]] = "MONKEY_3";
        i.llIIIIIIII[i.llIIIIIIll[133]] = "Monkeys love bananas. What else do they like to eat?";
        i.llIIIIIIII[i.llIIIIIIll[134]] = "Bitternuts.";
        i.llIIIIIIII[i.llIIIIIIll[135]] = "MONKEY_4";
        i.llIIIIIIII[i.llIIIIIIll[136]] = "There are two known families of monkeys. One is Karamjan, the other is...?";
        i.llIIIIIIII[i.llIIIIIIll[137]] = "Harmless.";
        i.llIIIIIIII[i.llIIIIIIll[138]] = "MONKEY_5";
        i.llIIIIIIII[i.llIIIIIIll[139]] = "What colour mohawk do Karamjan monkeys have?";
        i.llIIIIIIII[i.llIIIIIIll[140]] = "Red.";
        i.llIIIIIIII[i.llIIIIIIll[141]] = "MONKEY_6";
        i.llIIIIIIII[i.llIIIIIIll[142]] = "What have Karamjan monkeys taken a deep dislike to?";
        i.llIIIIIIII[i.llIIIIIIll[143]] = "Seaweed.";
        i.llIIIIIIII[i.llIIIIIIll[144]] = "KALPHITE_1";
        i.llIIIIIIII[i.llIIIIIIll[145]] = "Kalphites are ruled by a...?";
        i.llIIIIIIII[i.llIIIIIIll[146]] = "Pasha.";
        i.llIIIIIIII[i.llIIIIIIll[147]] = "KALPHITE_2";
        i.llIIIIIIII[i.llIIIIIIll[148]] = "What is the lowest caste in kalphite society?";
        i.llIIIIIIII[i.llIIIIIIll[149]] = "Worker.";
        i.llIIIIIIII[i.llIIIIIIll[150]] = "KALPHITE_3";
        i.llIIIIIIII[i.llIIIIIIll[151]] = "What are the armoured plates on a kalphite called?";
        i.llIIIIIIII[i.llIIIIIIll[152]] = "Lamellae.";
        i.llIIIIIIII[i.llIIIIIIll[153]] = "KALPHITE_4";
        i.llIIIIIIII[i.llIIIIIIll[154]] = "Are kalphites carnivores, herbivores or omnivores?";
        i.llIIIIIIII[i.llIIIIIIll[155]] = "Carnivores.";
        i.llIIIIIIII[i.llIIIIIIll[156]] = "KALPHITE_5";
        i.llIIIIIIII[i.llIIIIIIll[157]] = "What are kalphites assumed to have evolved from?";
        i.llIIIIIIII[i.llIIIIIIll[158]] = "Scarab beetles.";
        i.llIIIIIIII[i.llIIIIIIll[159]] = "KALPHITE_6";
        i.llIIIIIIII[i.llIIIIIIll[160]] = "Name the prominent figure in kalphite mythology?";
        i.llIIIIIIII[i.llIIIIIIll[161]] = "Scabaras.";
        i.llIIIIIIII[i.llIIIIIIll[162]] = "TERRORBIRD_1";
        i.llIIIIIIII[i.llIIIIIIll[163]] = "What is a terrorbird's preferred food?";
        i.llIIIIIIII[i.llIIIIIIll[164]] = "Anything.";
        i.llIIIIIIII[i.llIIIIIIll[165]] = "TERRORBIRD_2";
        i.llIIIIIIII[i.llIIIIIIll[166]] = "Who use terrorbirds as mounts?";
        i.llIIIIIIII[i.llIIIIIIll[167]] = "Gnomes.";
        i.llIIIIIIII[i.llIIIIIIll[168]] = "TERRORBIRD_3";
        i.llIIIIIIII[i.llIIIIIIll[169]] = "Where do terrorbirds get most of their water?";
        i.llIIIIIIII[i.llIIIIIIll[170]] = "Eating plants.";
        i.llIIIIIIII[i.llIIIIIIll[171]] = "TERRORBIRD_4";
        i.llIIIIIIII[i.llIIIIIIll[172]] = "How many claws do terrorbirds have?";
        i.llIIIIIIII[i.llIIIIIIll[173]] = "Four.";
        i.llIIIIIIII[i.llIIIIIIll[174]] = "TERRORBIRD_5";
        i.llIIIIIIII[i.llIIIIIIll[175]] = "What do terrorbirds eat to aid digestion?";
        i.llIIIIIIII[i.llIIIIIIll[176]] = "Stones.";
        i.llIIIIIIII[i.llIIIIIIll[177]] = "TERRORBIRD_6";
        i.llIIIIIIII[i.llIIIIIIll[178]] = "How many teeth do terrorbirds have?";
        i.llIIIIIIII[i.llIIIIIIll[179]] = "0.";
        i.llIIIIIIII[i.llIIIIIIll[180]] = "PENGUIN_1";
        i.llIIIIIIII[i.llIIIIIIll[181]] = "Which sense do penguins rely on when hunting?";
        i.llIIIIIIII[i.llIIIIIIll[182]] = "Sight.";
        i.llIIIIIIII[i.llIIIIIIll[183]] = "PENGUIN_2";
        i.llIIIIIIII[i.llIIIIIIll[184]] = "Which skill seems unusual for the penguins to possess?";
        i.llIIIIIIII[i.llIIIIIIll[185]] = "Planning.";
        i.llIIIIIIII[i.llIIIIIIll[186]] = "PENGUIN_3";
        i.llIIIIIIII[i.llIIIIIIll[187]] = "How do penguins keep warm?";
        i.llIIIIIIII[i.llIIIIIIll[188]] = "A layer of fat.";
        i.llIIIIIIII[i.llIIIIIIll[189]] = "PENGUIN_4";
        i.llIIIIIIII[i.llIIIIIIll[190]] = "What is the preferred climate for penguins?";
        i.llIIIIIIII[i.llIIIIIIll[191]] = "Cold.";
        i.llIIIIIIII[i.llIIIIIIll[192]] = "PENGUIN_5";
        i.llIIIIIIII[i.llIIIIIIll[193]] = "Describe the behaviour of penguins?";
        i.llIIIIIIII[i.llIIIIIIll[194]] = "Social.";
        i.llIIIIIIII[i.llIIIIIIll[195]] = "PENGUIN_6";
        i.llIIIIIIII[i.llIIIIIIll[196]] = "When do penguins fast?";
        i.llIIIIIIII[i.llIIIIIIll[197]] = "During breeding.";
        i.llIIIIIIII[i.llIIIIIIll[198]] = "MOLE_1";
        i.llIIIIIIII[i.llIIIIIIll[199]] = "What habitat do moles prefer?";
        i.llIIIIIIII[i.llIIIIIIll[200]] = "Subterranean.";
        i.llIIIIIIII[i.llIIIIIIll[201]] = "MOLE_2";
        i.llIIIIIIII[i.llIIIIIIll[202]] = "Why are moles considered to be an agricultural pest?";
        i.llIIIIIIII[i.llIIIIIIll[203]] = "They dig holes.";
        i.llIIIIIIII[i.llIIIIIIll[204]] = "MOLE_3";
        i.llIIIIIIII[i.llIIIIIIll[205]] = "Who discovered giant moles?";
        i.llIIIIIIII[i.llIIIIIIll[206]] = "Wyson the Gardener.";
        i.llIIIIIIII[i.llIIIIIIll[207]] = "MOLE_4";
        i.llIIIIIIII[i.llIIIIIIll[208]] = "What would you call a group of young moles?";
        i.llIIIIIIII[i.llIIIIIIll[209]] = "A labour.";
        i.llIIIIIIII[i.llIIIIIIll[210]] = "MOLE_5";
        i.llIIIIIIII[i.llIIIIIIll[211]] = "What is a mole's favourite food?";
        i.llIIIIIIII[i.llIIIIIIll[212]] = "Insects and other invertebrates.";
        i.llIIIIIIII[i.llIIIIIIll[213]] = "MOLE_6";
        i.llIIIIIIII[i.llIIIIIIll[214]] = "Which family do moles belong to?";
        i.llIIIIIIII[i.llIIIIIIll[215]] = "The Talpidae family.";
        i.llIIIIIIII[i.llIIIIIIll[216]] = "CAMEL_1";
        i.llIIIIIIII[i.llIIIIIIll[217]] = "What is produced by feeding chilli to a camel?";
        i.llIIIIIIII[i.llIIIIIIll[218]] = "Toxic dung.";
        i.llIIIIIIII[i.llIIIIIIll[219]] = "CAMEL_2";
        i.llIIIIIIII[i.llIIIIIIll[220]] = "If an ugthanki has one, how many does a bactrian have?";
        i.llIIIIIIII[i.llIIIIIIll[221]] = "Two.";
        i.llIIIIIIII[i.llIIIIIIll[222]] = "CAMEL_3";
        i.llIIIIIIII[i.llIIIIIIll[223]] = "Camels: herbivore, carnivore or omnivore?";
        i.llIIIIIIII[i.llIIIIIIll[224]] = "Omnivore.";
        i.llIIIIIIII[i.llIIIIIIll[225]] = "CAMEL_4";
        i.llIIIIIIII[i.llIIIIIIll[226]] = "What is the usual mood for a camel?";
        i.llIIIIIIII[i.llIIIIIIll[227]] = "Annoyed.";
        i.llIIIIIIII[i.llIIIIIIll[228]] = "CAMEL_5";
        i.llIIIIIIII[i.llIIIIIIll[229]] = "Where would you find an ugthanki?";
        i.llIIIIIIII[i.llIIIIIIll[230]] = "Al Kharid.";
        i.llIIIIIIII[i.llIIIIIIll[231]] = "CAMEL_6";
        i.llIIIIIIII[i.llIIIIIIll[232]] = "Which camel byproduct is known to be very nutritious?";
        i.llIIIIIIII[i.llIIIIIIll[233]] = "Milk.";
        i.llIIIIIIII[i.llIIIIIIll[234]] = "LEECH_1";
        i.llIIIIIIII[i.llIIIIIIll[235]] = "What is the favoured habitat of leeches?";
        i.llIIIIIIII[i.llIIIIIIll[236]] = "Water.";
        i.llIIIIIIII[i.llIIIIIIll[237]] = "LEECH_2";
        i.llIIIIIIII[i.llIIIIIIll[238]] = "What shape is the inside of a leech's mouth?";
        i.llIIIIIIII[i.llIIIIIIll[239]] = "'Y'-shaped.";
        i.llIIIIIIII[i.llIIIIIIll[240]] = "LEECH_3";
        i.llIIIIIIII[i.llIIIIIIll[241]] = "Which of these is not eaten by leeches?";
        i.llIIIIIIII[i.llIIIIIIll[242]] = "Apples.";
        i.llIIIIIIII[i.llIIIIIIll[243]] = "LEECH_4";
        i.llIIIIIIII[i.llIIIIIIll[244]] = "What contributed to the giant growth of Morytanian leeches?";
        i.llIIIIIIII[i.llIIIIIIll[245]] = "Environment.";
        i.llIIIIIIII[i.llIIIIIIll[246]] = "LEECH_5";
        i.llIIIIIIII[i.llIIIIIIll[247]] = "What is special about Morytanian leeches?";
        i.llIIIIIIII[i.llIIIIIIll[248]] = "They attack by jumping.";
        i.llIIIIIIII[i.llIIIIIIll[249]] = "LEECH_6";
        i.llIIIIIIII[i.llIIIIIIll[250]] = "How does a leech change when it feeds?";
        i.llIIIIIIII[i.llIIIIIIll[251]] = "It doubles in size.";
    }

    public String aa() {
        return this.question;
    }

        return String.valueOf(var1);
    }

    private static boolean lIlIIIlIllIII(Object object) {
        return object != null;
    }

    private static boolean lIlIIIlIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static boolean lIlIIIlIllIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    static {
        block1: {
            void var2;
            i.lIlIIIlIlIllI();
            i.lIlIIIlIlIlIl();
            LIZARD_1 = new GameEnum(llIIIIIIII[llIIIIIIll[1]], llIIIIIIII[llIIIIIIll[2]]);
            LIZARD_2 = new GameEnum(llIIIIIIII[llIIIIIIll[4]], llIIIIIIII[llIIIIIIll[5]]);
            LIZARD_3 = new GameEnum(llIIIIIIII[llIIIIIIll[7]], llIIIIIIII[llIIIIIIll[8]]);
            LIZARD_4 = new GameEnum(llIIIIIIII[llIIIIIIll[10]], llIIIIIIII[llIIIIIIll[11]]);
            LIZARD_5 = new GameEnum(llIIIIIIII[llIIIIIIll[13]], llIIIIIIII[llIIIIIIll[14]]);
            LIZARD_6 = new GameEnum(llIIIIIIII[llIIIIIIll[16]], llIIIIIIII[llIIIIIIll[17]]);
            TORTOISE_1 = new GameEnum(llIIIIIIII[llIIIIIIll[19]], llIIIIIIII[llIIIIIIll[20]]);
            TORTOISE_2 = new GameEnum(llIIIIIIII[llIIIIIIll[22]], llIIIIIIII[llIIIIIIll[23]]);
            TORTOISE_3 = new GameEnum(llIIIIIIII[llIIIIIIll[25]], llIIIIIIII[llIIIIIIll[26]]);
            TORTOISE_4 = new GameEnum(llIIIIIIII[llIIIIIIll[28]], llIIIIIIII[llIIIIIIll[29]]);
            TORTOISE_5 = new GameEnum(llIIIIIIII[llIIIIIIll[31]], llIIIIIIII[llIIIIIIll[32]]);
            TORTOISE_6 = new GameEnum(llIIIIIIII[llIIIIIIll[34]], llIIIIIIII[llIIIIIIll[35]]);
            DRAGON_1 = new GameEnum(llIIIIIIII[llIIIIIIll[37]], llIIIIIIII[llIIIIIIll[38]]);
            DRAGON_2 = new GameEnum(llIIIIIIII[llIIIIIIll[40]], llIIIIIIII[llIIIIIIll[41]]);
            DRAGON_3 = new GameEnum(llIIIIIIII[llIIIIIIll[43]], llIIIIIIII[llIIIIIIll[44]]);
            DRAGON_4 = new GameEnum(llIIIIIIII[llIIIIIIll[46]], llIIIIIIII[llIIIIIIll[47]]);
            DRAGON_5 = new GameEnum(llIIIIIIII[llIIIIIIll[49]], llIIIIIIII[llIIIIIIll[50]]);
            DRAGON_6 = new GameEnum(llIIIIIIII[llIIIIIIll[52]], llIIIIIIII[llIIIIIIll[53]]);
            WYVERN_1 = new GameEnum(llIIIIIIII[llIIIIIIll[55]], llIIIIIIII[llIIIIIIll[56]]);
            WYVERN_2 = new GameEnum(llIIIIIIII[llIIIIIIll[58]], llIIIIIIII[llIIIIIIll[59]]);
            WYVERN_3 = new GameEnum(llIIIIIIII[llIIIIIIll[61]], llIIIIIIII[llIIIIIIll[62]]);
            WYVERN_4 = new GameEnum(llIIIIIIII[llIIIIIIll[64]], llIIIIIIII[llIIIIIIll[65]]);
            WYVERN_5 = new GameEnum(llIIIIIIII[llIIIIIIll[67]], llIIIIIIII[llIIIIIIll[68]]);
            WYVERN_6 = new GameEnum(llIIIIIIII[llIIIIIIll[70]], llIIIIIIII[llIIIIIIll[71]]);
            SNAIL_1 = new GameEnum(llIIIIIIII[llIIIIIIll[73]], llIIIIIIII[llIIIIIIll[74]]);
            SNAIL_2 = new GameEnum(llIIIIIIII[llIIIIIIll[76]], llIIIIIIII[llIIIIIIll[77]]);
            SNAIL_3 = new GameEnum(llIIIIIIII[llIIIIIIll[79]], llIIIIIIII[llIIIIIIll[80]]);
            SNAIL_4 = new GameEnum(llIIIIIIII[llIIIIIIll[82]], llIIIIIIII[llIIIIIIll[83]]);
            SNAIL_5 = new GameEnum(llIIIIIIII[llIIIIIIll[85]], llIIIIIIII[llIIIIIIll[86]]);
            SNAIL_6 = new GameEnum(llIIIIIIII[llIIIIIIll[88]], llIIIIIIII[llIIIIIIll[89]]);
            SNAKE_1 = new GameEnum(llIIIIIIII[llIIIIIIll[91]], llIIIIIIII[llIIIIIIll[92]]);
            SNAKE_2 = new GameEnum(llIIIIIIII[llIIIIIIll[94]], llIIIIIIII[llIIIIIIll[95]]);
            SNAKE_3 = new GameEnum(llIIIIIIII[llIIIIIIll[97]], llIIIIIIII[llIIIIIIll[98]]);
            SNAKE_4 = new GameEnum(llIIIIIIII[llIIIIIIll[100]], llIIIIIIII[llIIIIIIll[101]]);
            SNAKE_5 = new GameEnum(llIIIIIIII[llIIIIIIll[103]], llIIIIIIII[llIIIIIIll[104]]);
            SNAKE_6 = new GameEnum(llIIIIIIII[llIIIIIIll[106]], llIIIIIIII[llIIIIIIll[107]]);
            SLUG_1 = new GameEnum(llIIIIIIII[llIIIIIIll[109]], llIIIIIIII[llIIIIIIll[110]]);
            SLUG_2 = new GameEnum(llIIIIIIII[llIIIIIIll[112]], llIIIIIIII[llIIIIIIll[113]]);
            SLUG_3 = new GameEnum(llIIIIIIII[llIIIIIIll[115]], llIIIIIIII[llIIIIIIll[116]]);
            SLUG_4 = new GameEnum(llIIIIIIII[llIIIIIIll[118]], llIIIIIIII[llIIIIIIll[119]]);
            SLUG_5 = new GameEnum(llIIIIIIII[llIIIIIIll[121]], llIIIIIIII[llIIIIIIll[122]]);
            SLUG_6 = new GameEnum(llIIIIIIII[llIIIIIIll[124]], llIIIIIIII[llIIIIIIll[125]]);
            MONKEY_1 = new GameEnum(llIIIIIIII[llIIIIIIll[127]], llIIIIIIII[llIIIIIIll[128]]);
            MONKEY_2 = new GameEnum(llIIIIIIII[llIIIIIIll[130]], llIIIIIIII[llIIIIIIll[131]]);
            MONKEY_3 = new GameEnum(llIIIIIIII[llIIIIIIll[133]], llIIIIIIII[llIIIIIIll[134]]);
            MONKEY_4 = new GameEnum(llIIIIIIII[llIIIIIIll[136]], llIIIIIIII[llIIIIIIll[137]]);
            MONKEY_5 = new GameEnum(llIIIIIIII[llIIIIIIll[139]], llIIIIIIII[llIIIIIIll[140]]);
            MONKEY_6 = new GameEnum(llIIIIIIII[llIIIIIIll[142]], llIIIIIIII[llIIIIIIll[143]]);
            KALPHITE_1 = new GameEnum(llIIIIIIII[llIIIIIIll[145]], llIIIIIIII[llIIIIIIll[146]]);
            KALPHITE_2 = new GameEnum(llIIIIIIII[llIIIIIIll[148]], llIIIIIIII[llIIIIIIll[149]]);
            KALPHITE_3 = new GameEnum(llIIIIIIII[llIIIIIIll[151]], llIIIIIIII[llIIIIIIll[152]]);
            KALPHITE_4 = new GameEnum(llIIIIIIII[llIIIIIIll[154]], llIIIIIIII[llIIIIIIll[155]]);
            KALPHITE_5 = new GameEnum(llIIIIIIII[llIIIIIIll[157]], llIIIIIIII[llIIIIIIll[158]]);
            KALPHITE_6 = new GameEnum(llIIIIIIII[llIIIIIIll[160]], llIIIIIIII[llIIIIIIll[161]]);
            TERRORBIRD_1 = new GameEnum(llIIIIIIII[llIIIIIIll[163]], llIIIIIIII[llIIIIIIll[164]]);
            TERRORBIRD_2 = new GameEnum(llIIIIIIII[llIIIIIIll[166]], llIIIIIIII[llIIIIIIll[167]]);
            TERRORBIRD_3 = new GameEnum(llIIIIIIII[llIIIIIIll[169]], llIIIIIIII[llIIIIIIll[170]]);
            TERRORBIRD_4 = new GameEnum(llIIIIIIII[llIIIIIIll[172]], llIIIIIIII[llIIIIIIll[173]]);
            TERRORBIRD_5 = new GameEnum(llIIIIIIII[llIIIIIIll[175]], llIIIIIIII[llIIIIIIll[176]]);
            TERRORBIRD_6 = new GameEnum(llIIIIIIII[llIIIIIIll[178]], llIIIIIIII[llIIIIIIll[179]]);
            PENGUIN_1 = new GameEnum(llIIIIIIII[llIIIIIIll[181]], llIIIIIIII[llIIIIIIll[182]]);
            PENGUIN_2 = new GameEnum(llIIIIIIII[llIIIIIIll[184]], llIIIIIIII[llIIIIIIll[185]]);
            PENGUIN_3 = new GameEnum(llIIIIIIII[llIIIIIIll[187]], llIIIIIIII[llIIIIIIll[188]]);
            PENGUIN_4 = new GameEnum(llIIIIIIII[llIIIIIIll[190]], llIIIIIIII[llIIIIIIll[191]]);
            PENGUIN_5 = new GameEnum(llIIIIIIII[llIIIIIIll[193]], llIIIIIIII[llIIIIIIll[194]]);
            PENGUIN_6 = new GameEnum(llIIIIIIII[llIIIIIIll[196]], llIIIIIIII[llIIIIIIll[197]]);
            MOLE_1 = new GameEnum(llIIIIIIII[llIIIIIIll[199]], llIIIIIIII[llIIIIIIll[200]]);
            MOLE_2 = new GameEnum(llIIIIIIII[llIIIIIIll[202]], llIIIIIIII[llIIIIIIll[203]]);
            MOLE_3 = new GameEnum(llIIIIIIII[llIIIIIIll[205]], llIIIIIIII[llIIIIIIll[206]]);
            MOLE_4 = new GameEnum(llIIIIIIII[llIIIIIIll[208]], llIIIIIIII[llIIIIIIll[209]]);
            MOLE_5 = new GameEnum(llIIIIIIII[llIIIIIIll[211]], llIIIIIIII[llIIIIIIll[212]]);
            MOLE_6 = new GameEnum(llIIIIIIII[llIIIIIIll[214]], llIIIIIIII[llIIIIIIll[215]]);
            CAMEL_1 = new GameEnum(llIIIIIIII[llIIIIIIll[217]], llIIIIIIII[llIIIIIIll[218]]);
            CAMEL_2 = new GameEnum(llIIIIIIII[llIIIIIIll[220]], llIIIIIIII[llIIIIIIll[221]]);
            CAMEL_3 = new GameEnum(llIIIIIIII[llIIIIIIll[223]], llIIIIIIII[llIIIIIIll[224]]);
            CAMEL_4 = new GameEnum(llIIIIIIII[llIIIIIIll[226]], llIIIIIIII[llIIIIIIll[227]]);
            CAMEL_5 = new GameEnum(llIIIIIIII[llIIIIIIll[229]], llIIIIIIII[llIIIIIIll[230]]);
            CAMEL_6 = new GameEnum(llIIIIIIII[llIIIIIIll[232]], llIIIIIIII[llIIIIIIll[233]]);
            LEECH_1 = new GameEnum(llIIIIIIII[llIIIIIIll[235]], llIIIIIIII[llIIIIIIll[236]]);
            LEECH_2 = new GameEnum(llIIIIIIII[llIIIIIIll[238]], llIIIIIIII[llIIIIIIll[239]]);
            LEECH_3 = new GameEnum(llIIIIIIII[llIIIIIIll[241]], llIIIIIIII[llIIIIIIll[242]]);
            LEECH_4 = new GameEnum(llIIIIIIII[llIIIIIIll[244]], llIIIIIIII[llIIIIIIll[245]]);
            LEECH_5 = new GameEnum(llIIIIIIII[llIIIIIIll[247]], llIIIIIIII[llIIIIIIll[248]]);
            LEECH_6 = new GameEnum(llIIIIIIII[llIIIIIIll[250]], llIIIIIIII[llIIIIIIll[251]]);
            i[] iArray = new i[llIIIIIIll[84]];
            iArray[i.llIIIIIIll[0]] = LIZARD_1;
            iArray[i.llIIIIIIll[1]] = LIZARD_2;
            iArray[i.llIIIIIIll[2]] = LIZARD_3;
            iArray[i.llIIIIIIll[3]] = LIZARD_4;
            iArray[i.llIIIIIIll[4]] = LIZARD_5;
            iArray[i.llIIIIIIll[5]] = LIZARD_6;
            iArray[i.llIIIIIIll[6]] = TORTOISE_1;
            iArray[i.llIIIIIIll[7]] = TORTOISE_2;
            iArray[i.llIIIIIIll[8]] = TORTOISE_3;
            iArray[i.llIIIIIIll[9]] = TORTOISE_4;
            iArray[i.llIIIIIIll[10]] = TORTOISE_5;
            iArray[i.llIIIIIIll[11]] = TORTOISE_6;
            iArray[i.llIIIIIIll[12]] = DRAGON_1;
            iArray[i.llIIIIIIll[13]] = DRAGON_2;
            iArray[i.llIIIIIIll[14]] = DRAGON_3;
            iArray[i.llIIIIIIll[15]] = DRAGON_4;
            iArray[i.llIIIIIIll[16]] = DRAGON_5;
            iArray[i.llIIIIIIll[17]] = DRAGON_6;
            iArray[i.llIIIIIIll[18]] = WYVERN_1;
            iArray[i.llIIIIIIll[19]] = WYVERN_2;
            iArray[i.llIIIIIIll[20]] = WYVERN_3;
            iArray[i.llIIIIIIll[21]] = WYVERN_4;
            iArray[i.llIIIIIIll[22]] = WYVERN_5;
            iArray[i.llIIIIIIll[23]] = WYVERN_6;
            iArray[i.llIIIIIIll[24]] = SNAIL_1;
            iArray[i.llIIIIIIll[25]] = SNAIL_2;
            iArray[i.llIIIIIIll[26]] = SNAIL_3;
            iArray[i.llIIIIIIll[27]] = SNAIL_4;
            iArray[i.llIIIIIIll[28]] = SNAIL_5;
            iArray[i.llIIIIIIll[29]] = SNAIL_6;
            iArray[i.llIIIIIIll[30]] = SNAKE_1;
            iArray[i.llIIIIIIll[31]] = SNAKE_2;
            iArray[i.llIIIIIIll[32]] = SNAKE_3;
            iArray[i.llIIIIIIll[33]] = SNAKE_4;
            iArray[i.llIIIIIIll[34]] = SNAKE_5;
            iArray[i.llIIIIIIll[35]] = SNAKE_6;
            iArray[i.llIIIIIIll[36]] = SLUG_1;
            iArray[i.llIIIIIIll[37]] = SLUG_2;
            iArray[i.llIIIIIIll[38]] = SLUG_3;
            iArray[i.llIIIIIIll[39]] = SLUG_4;
            iArray[i.llIIIIIIll[40]] = SLUG_5;
            iArray[i.llIIIIIIll[41]] = SLUG_6;
            iArray[i.llIIIIIIll[42]] = MONKEY_1;
            iArray[i.llIIIIIIll[43]] = MONKEY_2;
            iArray[i.llIIIIIIll[44]] = MONKEY_3;
            iArray[i.llIIIIIIll[45]] = MONKEY_4;
            iArray[i.llIIIIIIll[46]] = MONKEY_5;
            iArray[i.llIIIIIIll[47]] = MONKEY_6;
            iArray[i.llIIIIIIll[48]] = KALPHITE_1;
            iArray[i.llIIIIIIll[49]] = KALPHITE_2;
            iArray[i.llIIIIIIll[50]] = KALPHITE_3;
            iArray[i.llIIIIIIll[51]] = KALPHITE_4;
            iArray[i.llIIIIIIll[52]] = KALPHITE_5;
            iArray[i.llIIIIIIll[53]] = KALPHITE_6;
            iArray[i.llIIIIIIll[54]] = TERRORBIRD_1;
            iArray[i.llIIIIIIll[55]] = TERRORBIRD_2;
            iArray[i.llIIIIIIll[56]] = TERRORBIRD_3;
            iArray[i.llIIIIIIll[57]] = TERRORBIRD_4;
            iArray[i.llIIIIIIll[58]] = TERRORBIRD_5;
            iArray[i.llIIIIIIll[59]] = TERRORBIRD_6;
            iArray[i.llIIIIIIll[60]] = PENGUIN_1;
            iArray[i.llIIIIIIll[61]] = PENGUIN_2;
            iArray[i.llIIIIIIll[62]] = PENGUIN_3;
            iArray[i.llIIIIIIll[63]] = PENGUIN_4;
            iArray[i.llIIIIIIll[64]] = PENGUIN_5;
            iArray[i.llIIIIIIll[65]] = PENGUIN_6;
            iArray[i.llIIIIIIll[66]] = MOLE_1;
            iArray[i.llIIIIIIll[67]] = MOLE_2;
            iArray[i.llIIIIIIll[68]] = MOLE_3;
            iArray[i.llIIIIIIll[69]] = MOLE_4;
            iArray[i.llIIIIIIll[70]] = MOLE_5;
            iArray[i.llIIIIIIll[71]] = MOLE_6;
            iArray[i.llIIIIIIll[72]] = CAMEL_1;
            iArray[i.llIIIIIIll[73]] = CAMEL_2;
            iArray[i.llIIIIIIll[74]] = CAMEL_3;
            iArray[i.llIIIIIIll[75]] = CAMEL_4;
            iArray[i.llIIIIIIll[76]] = CAMEL_5;
            iArray[i.llIIIIIIll[77]] = CAMEL_6;
            iArray[i.llIIIIIIll[78]] = LEECH_1;
            iArray[i.llIIIIIIll[79]] = LEECH_2;
            iArray[i.llIIIIIIll[80]] = LEECH_3;
            iArray[i.llIIIIIIll[81]] = LEECH_4;
            iArray[i.llIIIIIIll[82]] = LEECH_5;
            iArray[i.llIIIIIIll[83]] = LEECH_6;
            $VALUES = iArray;
            ImmutableMap.Builder builder = new ImmutableMap.Builder();
            i[] iArray2 = i.values();
            int n2 = iArray2.length;
            int var3 = llIIIIIIll[0];
            while (i.lIlIIIlIlIlll(var3, (int)var2)) {
                void var4;
                void var5;
                void var6 = var5[var3];
                var4.put((Object)var6.question, (Object)var6.answer);

                ++var3;

                break block1;
            }
            MATCHES = builder.build();
        }
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void var7;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int var8 = llIIIIIIll[0];
        while (i.lIlIIIlIlIlll(var8, (int)var7)) {
            void var9;
            void var10;
            void var11 = var10[var8];
            Widget var12 = Widgets.get((WidgetInfo)var11);
            if (i.lIlIIIlIllIII(var12) && i.lIlIIIlIllIIl(var12.getText().equals(var9) ? 1 : 0)) {
                return var12;
            }
            ++var8;

            if (2 < (98 + 4 - -36 + 33 ^ 28 + 34 - -59 + 54)) continue;
            return null;
        }
        return null;
    }
}

