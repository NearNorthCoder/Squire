/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.WorldType
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.PlayerCompositionChanged
 *  net.runelite.api.events.PlayerDespawned
 *  net.runelite.api.kit.KitType
 *  net.runelite.http.api.item.ItemEquipmentStats
 *  net.runelite.http.api.item.ItemStats
 */
package com.openosrs.client.game;

import com.openosrs.client.events.AttackStyleChanged;
import com.openosrs.client.game.AttackStyle;
import com.openosrs.client.game.CombatStats;
import com.openosrs.client.game.ItemReclaimCost;
import com.openosrs.client.game.PlayerContainer;
import com.openosrs.client.game.WorldLocation;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.ItemComposition;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.WorldType;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.PlayerCompositionChanged;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.kit.KitType;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemMapping;
import net.runelite.client.hiscore.HiscoreClient;
import net.runelite.client.hiscore.HiscoreResult;
import net.runelite.client.hiscore.HiscoreSkill;
import net.runelite.client.util.PvPUtil;
import net.runelite.http.api.item.ItemEquipmentStats;
import net.runelite.http.api.item.ItemStats;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
public class PlayerManager {
    private static final Logger log = LoggerFactory.getLogger(PlayerManager.class);
    private final HiscoreClient hiscoreClient;
    private final Client client;
    private final ItemManager itemManager;
    private final EventBus eventBus;
    private final Map<String, PlayerContainer> playerMap = new ConcurrentHashMap<String, PlayerContainer>();
    private final Map<String, HiscoreResult> resultCache = new ConcurrentHashMap<String, HiscoreResult>();
    private final ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);

    @Inject
    PlayerManager(Client client, EventBus eventBus, ItemManager itemManager, OkHttpClient okHttpClient, HiscoreClient hiscoreClient) {
        this.client = client;
        this.itemManager = itemManager;
        this.eventBus = eventBus;
        this.hiscoreClient = hiscoreClient;
        eventBus.register(this);
    }

    public Set<PlayerContainer> getAllAttackers() {
        HashSet<PlayerContainer> result = new HashSet<PlayerContainer>();
        for (PlayerContainer playerContainer : this.playerMap.values()) {
            if (!playerContainer.isAttacking()) continue;
            result.add(playerContainer);
        }
        return Collections.unmodifiableSet(result);
    }

    public Collection<PlayerContainer> getPlayerContainers() {
        return this.playerMap.values();
    }

    @Nullable
    public PlayerContainer getPlayer(String name) {
        return this.playerMap.get(name);
    }

    @Nullable
    public PlayerContainer getPlayer(Player player) {
        if (player == null) {
            return null;
        }
        return this.playerMap.get(player.getName());
    }

    public void updateStats(String name) {
        PlayerContainer p = this.playerMap.get(name);
        if (p == null) {
            return;
        }
        this.updateStats(p.getPlayer());
    }

    public void updateStats(Player requestedPlayer) {
        if (requestedPlayer == null) {
            return;
        }
        PlayerContainer player = this.playerMap.get(requestedPlayer.getName());
        if (player == null) {
            return;
        }
        if (this.resultCache.containsKey(player.getName())) {
            player.setSkills(this.resultCache.get(player.getName()));
            player.setPrayerLevel(player.getSkills().getSkill(HiscoreSkill.PRAYER).getLevel());
            player.setHpLevel(player.getSkills().getSkill(HiscoreSkill.HITPOINTS).getLevel());
            return;
        }
        if (player.isHiscoresRequested() && !player.isHttpRetry()) {
            return;
        }
        player.setHiscoresRequested(true);
        this.executorService.submit(() -> {
            HiscoreResult result;
            int timeout = 0;
            do {
                try {
                    result = this.hiscoreClient.lookup(player.getName());
                }
                catch (IOException ex) {
                    if (timeout == 10) {
                        log.error("HiScore Lookup timed out on: {}", (Object)player.getName());
                        player.setHttpRetry(true);
                        return;
                    }
                    result = null;
                    ++timeout;
                    try {
                        Thread.sleep(1000L);
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                }
            } while (result == null);
            this.resultCache.put(player.getName(), result);
            player.setSkills(result);
            player.setPrayerLevel(player.getSkills().getSkill(HiscoreSkill.PRAYER).getLevel());
            player.setHpLevel(player.getSkills().getSkill(HiscoreSkill.HITPOINTS).getLevel());
            player.setHttpRetry(false);
            player.setHiscoresRequested(false);
        });
    }

    @Subscribe
    private void onAppearenceChanged(PlayerCompositionChanged event) {
        PlayerContainer player = this.playerMap.computeIfAbsent(event.getPlayer().getName(), s -> new PlayerContainer(event.getPlayer()));
        this.update(player);
        player.setFriend(this.client.isFriended(player.getName(), false));
        player.setClan(event.getPlayer().isFriendsChatMember());
    }

    @Subscribe
    private void onPlayerDespawned(PlayerDespawned event) {
        this.playerMap.remove(event.getPlayer().getName());
    }

    @Subscribe
    private void onAnimationChanged(AnimationChanged event) {
        Actor actor = event.getActor();
        if (actor.getInteracting() != this.client.getLocalPlayer() || !(actor instanceof Player) || actor.getAnimation() == -1) {
            return;
        }
        PlayerContainer player = this.playerMap.get(actor.getName());
        if (player == null) {
            return;
        }
        assert (player.getPlayer() == actor);
        if (player.getSkills() == null) {
            this.updateStats(player.getPlayer());
        }
        player.setAttacking(true);
        player.setTimer(8);
    }

    private void update(PlayerContainer player) {
        player.setRisk(0);
        this.updatePlayerGear(player);
        this.updateAttackStyle(player);
        this.updateWeakness(player);
        player.setLocation(WorldLocation.location(player.getPlayer().getWorldLocation()));
        player.setWildyLevel(PvPUtil.getWildernessLevelFrom(player.getPlayer().getWorldLocation()));
        player.setTargetString(this.targetStringBuilder(player));
    }

    private void updatePlayerGear(PlayerContainer player) {
        HashMap<Integer, Integer> prices = new HashMap<Integer, Integer>();
        if (player.getPlayer().getPlayerComposition() == null) {
            return;
        }
        int magicAttack = 0;
        int magicDefence = 0;
        int magicStr = 0;
        int meleeAtkCrush = 0;
        int meleeAtkStab = 0;
        int meleeAtkSlash = 0;
        int meleeDefCrush = 0;
        int meleeDefStab = 0;
        int meleeDefSlash = 0;
        int meleeStr = 0;
        int rangeAttack = 0;
        int rangeDefence = 0;
        int rangeStr = 0;
        int speed = 0;
        for (KitType kitType : KitType.values()) {
            int id = player.getPlayer().getPlayerComposition().getEquipmentId(kitType);
            if (id == -1) continue;
            if (kitType.equals((Object)KitType.WEAPON)) {
                player.setWeapon(id);
                switch (id) {
                    case 19478: 
                    case 19481: 
                    case 23630: {
                        rangeStr += 150;
                        break;
                    }
                    case 851: 
                    case 853: {
                        rangeStr += 31;
                        break;
                    }
                    case 861: 
                    case 12788: 
                    case 20558: {
                        rangeStr += 55;
                        break;
                    }
                    case 11235: 
                    case 12765: 
                    case 12766: 
                    case 12767: 
                    case 12768: 
                    case 20408: {
                        rangeStr += 60;
                        break;
                    }
                    case 9185: 
                    case 23601: {
                        rangeStr += 117;
                        break;
                    }
                    case 11785: 
                    case 21902: 
                    case 23611: {
                        rangeStr += 122;
                    }
                }
            }
            ItemStats item = this.itemManager.getItemStats(id, false);
            ItemComposition itemComposition = this.itemManager.getItemComposition(id);
            if (item == null) {
                log.debug("Item is null: {}", (Object)id);
                continue;
            }
            ItemEquipmentStats stats = item.getEquipment();
            speed += stats.getAspeed();
            meleeAtkCrush += stats.getAcrush();
            meleeAtkStab += stats.getAstab();
            meleeAtkSlash += stats.getAslash();
            meleeDefCrush += stats.getDcrush();
            meleeDefStab += stats.getDstab();
            meleeDefSlash += stats.getDslash();
            magicAttack += stats.getAmagic();
            rangeAttack += stats.getArange();
            magicDefence += stats.getDmagic();
            rangeDefence += stats.getDrange();
            rangeStr += stats.getRstr();
            meleeStr += stats.getStr();
            magicStr += stats.getMdmg();
            if (ItemReclaimCost.breaksOnDeath(id)) continue;
            if (!itemComposition.isTradeable() && ItemMapping.map(id) == null) {
                prices.put(id, itemComposition.getPrice());
                continue;
            }
            if (!itemComposition.isTradeable()) continue;
            prices.put(id, this.itemManager.getItemPrice(id));
        }
        player.setCombatStats(new CombatStats(magicAttack, magicDefence, magicStr, meleeAtkCrush, meleeAtkSlash, meleeAtkStab, (meleeAtkCrush + meleeAtkSlash + meleeAtkStab) / 3, meleeDefCrush, (meleeDefCrush + meleeDefSlash + meleeDefStab) / 3, meleeDefSlash, meleeDefStab, meleeStr, rangeAttack, rangeDefence, rangeStr, speed));
        this.updateGear(player, prices);
        this.updateMeleeStyle(player);
    }

    private void updateGear(PlayerContainer player, Map<Integer, Integer> prices) {
        player.setGear(prices.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new)));
        player.setRiskedGear(prices.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new)));
        if (this.client.getWorldType().stream().noneMatch(x -> x == WorldType.HIGH_RISK)) {
            if (player.getPlayer().getSkullIcon() == null) {
                PlayerManager.removeEntries(player.getRiskedGear(), player.getPrayerLevel() < 25 ? 3 : 4);
            } else {
                PlayerManager.removeEntries(player.getRiskedGear(), player.getPrayerLevel() < 25 ? 0 : 1);
            }
        }
        int risk = 0;
        for (int val : player.getRiskedGear().values()) {
            risk += val;
        }
        player.setRisk(risk);
    }

    private void updateMeleeStyle(PlayerContainer player) {
        CombatStats stats = player.getCombatStats();
        if (stats.getMeleeAtkCrush() >= stats.getMeleeAtkSlash() && stats.getMeleeAtkCrush() >= stats.getMeleeAtkStab()) {
            player.setMeleeStyle(PlayerContainer.MeleeStyle.CRUSH);
        } else if (stats.getMeleeAtkSlash() >= stats.getMeleeAtkCrush() && stats.getMeleeAtkSlash() >= stats.getMeleeAtkStab()) {
            player.setMeleeStyle(PlayerContainer.MeleeStyle.SLASH);
        } else {
            player.setMeleeStyle(PlayerContainer.MeleeStyle.STAB);
        }
    }

    private void updateAttackStyle(PlayerContainer player) {
        AttackStyle oldStyle = player.getAttackStyle();
        boolean staff = false;
        for (int id : player.getGear().keySet()) {
            ItemComposition def = this.itemManager.getItemComposition(id);
            if (!def.getName().toLowerCase().contains("staff")) continue;
            player.setAttackStyle(AttackStyle.MAGE);
            if (oldStyle != player.getAttackStyle()) {
                this.eventBus.post(new AttackStyleChanged(player.getPlayer(), oldStyle, player.getAttackStyle()));
            }
            return;
        }
        CombatStats stats = player.getCombatStats();
        if (stats.getMagicStr() >= stats.getRangeStr() && stats.getMagicStr() >= stats.getMeleeStr()) {
            player.setAttackStyle(AttackStyle.MAGE);
        } else if (stats.getRangeStr() >= stats.getMagicStr() && stats.getRangeStr() >= stats.getMeleeStr()) {
            player.setAttackStyle(AttackStyle.RANGE);
        } else {
            player.setAttackStyle(AttackStyle.MELEE);
        }
        if (oldStyle != player.getAttackStyle()) {
            this.eventBus.post(new AttackStyleChanged(player.getPlayer(), oldStyle, player.getAttackStyle()));
        }
    }

    private void updateWeakness(PlayerContainer player) {
        CombatStats stats = player.getCombatStats();
        if (stats.getMagicDefence() <= stats.getRangeDefence() && stats.getMagicDefence() <= stats.getMeleeDefence()) {
            player.setWeakness(AttackStyle.MAGE);
        } else if (stats.getRangeDefence() <= stats.getMagicDefence() && stats.getRangeDefence() <= stats.getMeleeDefence()) {
            player.setWeakness(AttackStyle.RANGE);
        } else {
            player.setWeakness(AttackStyle.MELEE);
        }
    }

    private static void removeEntries(LinkedHashMap<Integer, Integer> map, int quantity) {
        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        for (int i = 0; it.hasNext() && i < quantity; ++i) {
            it.next();
            it.remove();
        }
    }

    private String targetStringBuilder(PlayerContainer player) {
        if (player.getPlayer().getInteracting() != null) {
            Actor actor = player.getPlayer().getInteracting();
            if (actor instanceof Player) {
                return "(Player) " + actor.getName();
            }
            if (actor instanceof NPC) {
                return "(NPC) " + actor.getName();
            }
        }
        return "No Target Detected";
    }
}

