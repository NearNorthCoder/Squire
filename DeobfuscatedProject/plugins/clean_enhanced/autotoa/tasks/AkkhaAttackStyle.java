/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

/**
 * Represents the different attack styles Akkha uses during the boss fight.
 * Akkha cycles through different combat styles and can use two variations of melee and ranged.
 */
public enum AkkhaAttackStyle {
    /** No specific attack style (neutral phase) */
    NONE,

    /** First melee attack variant */
    MELEE_1,

    /** Second melee attack variant */
    MELEE_2,

    /** First ranged attack variant */
    RANGE_1,

    /** Second ranged attack variant */
    RANGE_2,

    /** Magic attack style */
    MAGE
}
