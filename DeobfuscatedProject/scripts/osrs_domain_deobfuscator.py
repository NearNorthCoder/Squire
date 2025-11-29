#!/usr/bin/env python3
"""
OSRS Domain-Aware Squire Plugin Deobfuscator
Uses knowledge of OSRS mechanics to intelligently name classes and understand code flow.

This is for ANALYSIS PURPOSES ONLY.
"""

import os
import re
import json
import shutil
import base64
import hashlib
from pathlib import Path
from collections import defaultdict
from typing import Dict, List, Tuple, Set, Optional

try:
    from Crypto.Cipher import DES, Blowfish
except ImportError:
    import subprocess
    import sys
    subprocess.check_call([sys.executable, "-m", "pip", "install", "pycryptodome"])
    from Crypto.Cipher import DES, Blowfish


# ============================================================================
# OSRS DOMAIN KNOWLEDGE
# ============================================================================

# Boss-specific class naming based on mechanics
BOSS_MECHANICS = {
    'zulrah': {
        'phases': ['MAGMA', 'TANZANITE', 'JAD', 'MELEE', 'RANGE', 'MAGE'],
        'mechanics': {
            'Prayer': 'PrayerSwitchHandler',  # Switching between mage/range protection
            'Projectile': 'ProjectileHandler',  # Tracking incoming projectiles
            'Phase': 'PhaseManager',  # Managing boss phase transitions
            'Gear': 'GearSwitcher',  # Switching between mage/range gear
            'Safespot': 'SafespotNavigator',  # Moving to correct safespot per phase
            'Boat': 'BoatHandler',  # Boarding boat to fight
            'Teleport': 'TeleportHandler',  # Fairy ring or teleport to Zul-Andra
            'Death': 'DeathRecoveryHandler',  # Handling deaths, collecting items
            'Venom': 'VenomCureHandler',  # Anti-venom handling
            'Heart': 'ImbuedHeartHandler',  # Imbued heart timing
        },
        'states': ['BANKING', 'TELEPORTING', 'FIGHTING', 'LOOTING', 'DEATH_WALKING'],
        'items': ['Zulrah teleport', 'Antivenom', 'Serpentine helm', 'Toxic blowpipe', 'Trident']
    },
    'vorkath': {
        'phases': ['NORMAL', 'ACID', 'SPAWN', 'FIREBALL'],
        'mechanics': {
            'Spawn': 'ZombifiedSpawnKiller',  # Killing the undead spawn
            'Acid': 'AcidPoolDodger',  # Woox walking or avoiding acid
            'Fireball': 'FireballDodger',  # Avoiding the fireball special
            'Poke': 'VorkathWaker',  # Waking Vorkath to start fight
            'Bolt': 'BoltSwitcher',  # Ruby/Diamond bolt switching
            'Antifire': 'AntifireHandler',  # Extended super antifire
            'Spec': 'SpecialAttackHandler',  # BGS/DWH spec
        },
        'states': ['BANKING', 'TELEPORTING', 'FIGHTING', 'LOOTING', 'SPAWNING'],
        'items': ['Dragonfire ward', 'Blowpipe', 'BGS', 'Ruby bolts', 'Diamond bolts']
    },
    'hydra': {
        'phases': ['GREEN', 'BLUE', 'RED', 'BLACK'],  # Color phases
        'mechanics': {
            'Lightning': 'LightningDodger',  # Avoiding lightning attack
            'Fire': 'FireSkipper',  # Fire skip mechanic
            'Phase': 'HydraPhaseTracker',  # Tracking 3 attacks per phase
            'Spec': 'BlowpipeSpecHandler',  # Spec healing
        },
        'states': ['BANKING', 'ENTERING', 'FIGHTING', 'LOOTING'],
        'items': ['Twisted bow', 'Blowpipe', 'Antidote++']
    },
    'bandos': {
        'phases': ['NORMAL'],
        'mechanics': {
            'Minion': 'MinionKiller',  # Killing Steelwill, Grimspike, Strongstack
            'Cannon': 'CannonPlacer',  # Dwarf cannon for KC
            'B2P': 'BonesToPeaches',  # Bones to peaches spell
            'KC': 'KillcountGetter',  # Getting 40 KC to enter
            'Tile': 'TileNavigator',  # Moving to safe tiles
            'Bowfa': 'BowfaSwitcher',  # Bowfa gear
        },
        'states': ['BANKING', 'GETTING_KC', 'ENTERING', 'FIGHTING', 'LOOTING'],
    },
    'zammy': {
        'phases': ['NORMAL'],
        'mechanics': {
            'Minion': 'MinionKiller',  # Balfrug, Tstanon, Zakl'n
            'Mage': 'MageGearHandler',  # Blood barrage setup
            'Barrage': 'BloodBarrageRestorer',  # Healing with blood barrage
        },
        'states': ['BANKING', 'GETTING_KC', 'FIGHTING', 'LOOTING'],
    },
    'saradomin': {
        'phases': ['NORMAL'],
        'mechanics': {
            'Minion': 'MinionKiller',  # Growler, Bree, Starlight
            'Altar': 'AltarPrayer',  # Using altar for prayer
            'Kiting': 'ZilyanaKiter',  # Kiting Sara
        },
        'states': ['BANKING', 'GETTING_KC', 'FIGHTING', 'LOOTING'],
    },
    'cox': {  # Chambers of Xeric
        'rooms': ['TEKTON', 'VASA', 'VANGUARDS', 'MUTTADILES', 'SHAMANS', 'MYSTICS', 'OLM'],
        'mechanics': {
            'Scout': 'RaidScout',  # Scouting for good layouts
            'Prep': 'PrepRoom',  # Preparing potions
            'Olm': 'OlmFighter',  # Final boss
        }
    },
    'gauntlet': {
        'phases': ['PREP', 'HUNLLEF'],
        'mechanics': {
            'Gather': 'ResourceGatherer',  # Gathering during prep
            'Craft': 'GearCrafter',  # Crafting t3 gear
            'Hunllef': 'HunllefFighter',  # Boss fight
            'Tornado': 'TornadoDodger',  # Avoiding tornadoes
        }
    },
    'nightmare': {
        'phases': ['PHASE1', 'PHASE2', 'PHASE3', 'PHASE4'],
        'mechanics': {
            'Parasite': 'ParasiteHandler',
            'Sleepwalker': 'SleepwalkerKiller',
            'Spore': 'SporeAvoider',
            'Totem': 'TotemDestroyer',
        }
    },
}

# Skilling plugin naming
SKILLING_MECHANICS = {
    'herblore': {
        'activities': ['Clean herb', 'Make potion', 'Make unfinished'],
        'classes': {
            'Clean': 'HerbCleaner',
            'Potion': 'PotionMaker',
            'Unfinished': 'UnfinishedPotionMaker',
        }
    },
    'woodcutting': {
        'activities': ['Chop', 'Bank', 'Drop'],
        'classes': {
            'Chop': 'TreeChopper',
            'Bank': 'LogBanker',
            'Drop': 'LogDropper',
        }
    },
    'fishing': {
        'activities': ['Fish', 'Bank', 'Drop', 'Cook'],
        'classes': {
            'Fish': 'Fisher',
            'Bank': 'FishBanker',
        }
    },
    'mining': {
        'activities': ['Mine', 'Bank', 'Drop', 'Powermining'],
        'classes': {
            'Mine': 'OreMiner',
            'Bank': 'OreBanker',
        }
    },
    'agility': {
        'activities': ['Rooftop', 'Obstacle', 'Mark of grace'],
        'classes': {
            'Course': 'AgilityCourseRunner',
            'Mark': 'MarkCollector',
        }
    },
    'thieving': {
        'activities': ['Pickpocket', 'Stall', 'Blackjack'],
        'classes': {
            'Pickpocket': 'PickpocketHandler',
            'Stall': 'StallThief',
            'Eat': 'FoodEater',
        }
    },
    'hunter': {
        'activities': ['Trap', 'Birdhouse', 'Herbiboar'],
        'classes': {
            'Trap': 'TrapPlacer',
            'Check': 'TrapChecker',
            'Birdhouse': 'BirdhouseRunner',
        }
    },
    'runecrafting': {
        'activities': ['Craft', 'Run', 'Altar'],
        'classes': {
            'Craft': 'RunecrAfter',
            'Altar': 'AltarHandler',
        }
    },
    'farming': {
        'activities': ['Plant', 'Harvest', 'Compost', 'Pay'],
        'classes': {
            'Plant': 'SeedPlanter',
            'Harvest': 'CropHarvester',
        }
    },
    'construction': {
        'activities': ['Build', 'Remove', 'Butler'],
        'classes': {
            'Build': 'FurnitureBuilder',
            'Butler': 'ButlerHandler',
        }
    },
}

# Minigame naming
MINIGAME_MECHANICS = {
    'wintertodt': {
        'activities': ['Light brazier', 'Chop roots', 'Fletch', 'Feed brazier'],
        'classes': {
            'Brazier': 'BrazierHandler',
            'Root': 'RootChopper',
            'Fletch': 'KindlingFletcher',
            'Heal': 'PyromancerHealer',
        }
    },
    'tempoross': {
        'activities': ['Fish', 'Cook', 'Fire cannon', 'Douse fires'],
        'classes': {
            'Fish': 'HarpoonFisher',
            'Cook': 'FishCooker',
            'Cannon': 'CannonFirer',
            'Fire': 'FireDouser',
        }
    },
    'gotr': {  # Guardians of the Rift
        'activities': ['Mine', 'Craft', 'Power guardian', 'Portal'],
        'classes': {
            'Mine': 'GuardianMiner',
            'Craft': 'GuardianCrafter',
            'Portal': 'PortalHandler',
        }
    },
    'mta': {  # Mage Training Arena
        'activities': ['Telekinetic', 'Enchantment', 'Graveyard', 'Alchemist'],
        'classes': {
            'Telekinetic': 'TelekineticRoom',
            'Enchantment': 'EnchantmentRoom',
            'Graveyard': 'GraveyardRoom',
            'Alchemist': 'AlchemistRoom',
        }
    },
    'sepulchre': {  # Hallowed Sepulchre
        'activities': ['Floor', 'Coffin', 'Obstacle', 'Arrow'],
        'classes': {
            'Floor': 'FloorRunner',
            'Coffin': 'CoffinLooter',
            'Arrow': 'ArrowDodger',
        }
    },
    'blastfurnace': {
        'activities': ['Load', 'Collect', 'Coffer'],
        'classes': {
            'Load': 'OreLoader',
            'Collect': 'BarCollector',
            'Coffer': 'CofferPayer',
        }
    },
    'giantsfoundry': {
        'activities': ['Heat', 'Trip', 'Polish', 'Grind'],
        'classes': {
            'Heat': 'SwordHeater',
            'Trip': 'HammerHandler',
            'Polish': 'SwordPolisher',
        }
    },
}

# Common task pattern recognition
TASK_PATTERNS = {
    # Combat patterns
    r'attack': 'AttackHandler',
    r'pray': 'PrayerHandler',
    r'flick': 'PrayerFlicker',
    r'eat|food': 'FoodEater',
    r'pot|drink': 'PotionDrinker',
    r'spec': 'SpecialAttacker',
    r'dodge|avoid': 'MechanicDodger',
    r'loot': 'LootCollector',
    r'gear|equip|switch': 'GearSwitcher',

    # Movement patterns
    r'walk|run|move': 'MovementHandler',
    r'teleport|tp': 'TeleportHandler',
    r'traverse': 'PathTraverser',
    r'enter|portal|door': 'AreaEnterHandler',

    # Banking patterns
    r'bank': 'BankHandler',
    r'withdraw': 'ItemWithdrawer',
    r'deposit': 'ItemDepositer',
    r'loadout': 'LoadoutHandler',

    # State patterns
    r'idle|wait': 'IdleHandler',
    r'death|die': 'DeathHandler',
    r'heal': 'HealingHandler',
    r'poison|venom': 'PoisonCurer',
}


# ============================================================================
# STRING DECRYPTION
# ============================================================================

def decrypt_xor(encrypted_b64: str, key: str) -> Optional[str]:
    try:
        decoded = base64.b64decode(encrypted_b64).decode('utf-8')
        result = []
        for i, char in enumerate(decoded):
            result.append(chr(ord(char) ^ ord(key[i % len(key)])))
        return ''.join(result)
    except:
        return None

def decrypt_des(encrypted_b64: str, key_string: str) -> Optional[str]:
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()[:8]
        cipher = DES.new(key, DES.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        return decrypted.decode('utf-8')
    except:
        return None

def decrypt_blowfish(encrypted_b64: str, key_string: str) -> Optional[str]:
    try:
        key = hashlib.md5(key_string.encode('utf-8')).digest()
        cipher = Blowfish.new(key, Blowfish.MODE_ECB)
        decrypted = cipher.decrypt(base64.b64decode(encrypted_b64))
        pad_len = decrypted[-1]
        if pad_len <= 8:
            decrypted = decrypted[:-pad_len]
        return decrypted.decode('utf-8')
    except:
        return None

def decrypt_string(encrypted: str, key: str) -> Optional[str]:
    for method in [decrypt_des, decrypt_blowfish, decrypt_xor]:
        result = method(encrypted, key)
        if result and all(c.isprintable() or c in '\n\r\t' for c in result):
            return result
    return None

def escape_java_string(s: str) -> str:
    return s.replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '\\r').replace('\t', '\\t')

def decrypt_all_strings(content: str) -> str:
    pattern = r'(?:\w+\.)?([lL][lLiI]+)\s*\(\s*"([^"]*)"\s*,\s*"([^"]{4,6})"\s*\)'

    def replace_encrypted(match):
        encrypted = match.group(2)
        key = match.group(3)
        decrypted = decrypt_string(encrypted, key)
        if decrypted:
            return f'"{escape_java_string(decrypted)}"'
        return match.group(0)

    return re.sub(pattern, replace_encrypted, content)


# ============================================================================
# CODE CLEANUP
# ============================================================================

def remove_dead_code(content: str) -> str:
    """Remove dead code that never executes"""

    # Remove if (constant == 0) blocks where constant is never 0
    content = re.sub(r'if\s*\(\s*\d+\s*==\s*0\s*\)\s*\{[^}]*\}', '', content)
    content = re.sub(r'if\s*\(\s*\d+\s*==\s*0\s*\)\s*return[^;]*;', '', content)
    content = re.sub(r'if\s*\(\s*\d+\s*==\s*0\s*\)\s*continue\s*;', '', content)

    # Remove if (2 >= -1) continue; - always true condition leading to useless continue
    content = re.sub(r'if\s*\(\s*\d+\s*>=\s*-?\d+\s*\)\s*continue\s*;', '', content)

    # Remove XOR expressions that evaluate to constant
    content = re.sub(
        r'\(\s*\(\s*0x[0-9A-Fa-f]+\s*\^\s*0x[0-9A-Fa-f]+[^)]*\)\s*&\s*[^)]+\)\s*!=\s*0',
        'false',
        content
    )

    # Remove null == null checks
    content = re.sub(r'if\s*\(\s*null\s*==\s*null\s*\)\s*continue\s*;', '', content)
    content = re.sub(r'if\s*\(\s*null\s*!=\s*null\s*\)\s*[^;]+;', '', content)

    return content


def inline_helper_methods(content: str) -> str:
    """Replace helper method calls with their actual logic"""

    # Find helper method patterns
    helper_methods = {}
    method_def_pattern = r'private\s+static\s+boolean\s+(ll[IlI]+)\s*\(\s*([^)]*)\s*\)\s*\{\s*return\s+([^;]+)\s*;\s*\}'

    for match in re.finditer(method_def_pattern, content):
        method_name = match.group(1)
        params = match.group(2)
        body = match.group(3).strip()

        param_list = []
        if params.strip():
            for p in params.split(','):
                parts = p.strip().split()
                if len(parts) >= 2:
                    param_list.append(parts[-1])

        helper_methods[method_name] = {'params': param_list, 'body': body}

    # Inline the calls
    for method_name, info in helper_methods.items():
        params = info['params']
        body = info['body']

        if len(params) == 1:
            call_pattern = rf'\b(?:\w+\.)?{re.escape(method_name)}\s*\(\s*([^)]+)\s*\)'

            def make_replacer(p, b):
                def replace_single(m):
                    arg = m.group(1).strip()
                    result = b.replace(p[0], arg)
                    return f'({result})'
                return replace_single

            content = re.sub(call_pattern, make_replacer(params, body), content)

        elif len(params) == 2:
            call_pattern = rf'\b(?:\w+\.)?{re.escape(method_name)}\s*\(\s*([^,]+)\s*,\s*([^)]+)\s*\)'

            def make_replacer2(p, b):
                def replace_double(m):
                    arg1 = m.group(1).strip()
                    arg2 = m.group(2).strip()
                    result = b.replace(p[0], arg1).replace(p[1], arg2)
                    return f'({result})'
                return replace_double

            content = re.sub(call_pattern, make_replacer2(params, body), content)

    # Remove the method definitions
    content = re.sub(
        r'\n\s*private\s+static\s+boolean\s+ll[IlI]+\s*\([^)]*\)\s*\{[^}]+\}\n',
        '\n',
        content
    )

    # Simplify expressions
    content = re.sub(r'\(\s*(\w+)\s*!=\s*null\s*\)', r'\1 != null', content)
    content = re.sub(r'\(\s*(\w+)\s*==\s*null\s*\)', r'\1 == null', content)
    content = re.sub(r'\(\s*(\w+)\s*!=\s*0\s*\)', r'\1', content)

    return content


def clean_control_flow(content: str) -> str:
    """Clean control flow obfuscation"""

    # Replace "".length() patterns
    content = re.sub(r'""\s*\.\s*length\s*\(\s*\)', '0', content)
    content = re.sub(r'" "\s*\.\s*length\s*\(\s*\)', '1', content)
    content = re.sub(r'"  "\s*\.\s*length\s*\(\s*\)', '2', content)
    content = re.sub(r'"   "\s*\.\s*length\s*\(\s*\)', '3', content)
    content = re.sub(r'"    "\s*\.\s*length\s*\(\s*\)', '4', content)

    # Simplify ternary
    content = re.sub(r'(\w+)\s*\?\s*1\s*:\s*0', r'\1', content)

    # Clean up whitespace
    content = re.sub(r'\n\s*\n\s*\n+', '\n\n', content)

    return content


def remove_encryption_boilerplate(content: str) -> str:
    """Remove encryption/decryption boilerplate code"""

    # Remove static initializer blocks
    content = re.sub(
        r'static\s*\{\s*\w+\.ll[IlI]+\s*\(\s*\)\s*;\s*\w+\.ll[IlI]+\s*\(\s*\)\s*;\s*\}',
        '',
        content
    )
    content = re.sub(
        r'static\s*\{\s*ll[IlI]+\s*\(\s*\)\s*;\s*ll[IlI]+\s*\(\s*\)\s*;\s*\}',
        '',
        content
    )

    # Remove encryption method declarations
    content = re.sub(
        r'\n\s*private\s+static\s+void\s+ll[IlI]+\s*\(\s*\)\s*\{[^}]*\}\n',
        '\n',
        content,
        flags=re.DOTALL
    )

    # Remove obfuscated array declarations
    content = re.sub(r'private\s+static\s+String\[\]\s+l[IlI]+\s*;', '', content)
    content = re.sub(r'private\s+static\s+int\[\]\s+l[IlI]+\s*;', '', content)

    # Remove /* synthetic */
    content = re.sub(r'/\*\s*synthetic\s*\*/', '', content)

    # Remove unused crypto imports
    if 'Cipher' not in content or 'encrypt' not in content.lower():
        content = re.sub(r'import\s+javax\.crypto\.[^;]+;\n', '', content)
        content = re.sub(r'import\s+java\.security\.MessageDigest;\n', '', content)
        content = re.sub(r'import\s+java\.util\.Base64;\n', '', content)

    return content


def rename_obfuscated_variables(content: str) -> str:
    """Rename obfuscated variables to readable names"""

    var_counter = [0]
    var_map = {}

    # Find long l/I patterns
    for match in re.finditer(r'\b([lI]{10,})\b', content):
        old_name = match.group(1)
        if old_name not in var_map:
            var_counter[0] += 1
            var_map[old_name] = f"var{var_counter[0]}"

    for old_name, new_name in var_map.items():
        content = re.sub(rf'\b{re.escape(old_name)}\b', new_name, content)

    return content


# ============================================================================
# DOMAIN-AWARE CLASS NAMING
# ============================================================================

def extract_task_desc(content: str) -> Optional[str]:
    match = re.search(r'@TaskDesc\s*\(\s*name\s*=\s*"([^"]+)"', content)
    return match.group(1) if match else None


def task_name_to_class_name(task_name: str) -> str:
    words = re.sub(r'[^\w\s]', '', task_name).split()
    class_name = ''.join(word.capitalize() for word in words)
    if not class_name.endswith('Task'):
        class_name += 'Task'
    return class_name


def infer_class_from_content(content: str, plugin_type: str) -> Optional[str]:
    """Use content analysis and domain knowledge to infer class purpose"""

    content_lower = content.lower()

    # Check for boss-specific patterns
    if plugin_type in BOSS_MECHANICS:
        boss = BOSS_MECHANICS[plugin_type]
        for key, class_name in boss.get('mechanics', {}).items():
            if key.lower() in content_lower:
                return class_name

    # Check for skilling patterns
    for skill, info in SKILLING_MECHANICS.items():
        if skill in plugin_type.lower():
            for key, class_name in info.get('classes', {}).items():
                if key.lower() in content_lower:
                    return class_name

    # Check for minigame patterns
    for minigame, info in MINIGAME_MECHANICS.items():
        if minigame in plugin_type.lower():
            for key, class_name in info.get('classes', {}).items():
                if key.lower() in content_lower:
                    return class_name

    # Check generic patterns
    for pattern, class_name in TASK_PATTERNS.items():
        if re.search(pattern, content_lower):
            return class_name

    return None


def analyze_class_purpose(content: str, plugin_name: str) -> Dict:
    """Analyze class to determine its purpose"""

    analysis = {
        'is_task': '@TaskDesc' in content,
        'is_enum': 'extends Enum<' in content or bool(re.search(r'\benum\s+\w+', content)),
        'is_abstract': 'abstract class' in content,
        'has_subscribe': '@Subscribe' in content,
        'has_inject': '@Inject' in content,
        'purpose': None,
    }

    # Check for OSRS API usage
    if 'Prayer' in content:
        analysis['purpose'] = 'prayer_handler'
    elif 'Projectile' in content:
        analysis['purpose'] = 'projectile_handler'
    elif 'NPC' in content and ('attack' in content.lower() or 'interact' in content.lower()):
        analysis['purpose'] = 'combat_handler'
    elif 'Bank' in content:
        analysis['purpose'] = 'banking_handler'
    elif 'WorldPoint' in content and 'walk' in content.lower():
        analysis['purpose'] = 'movement_handler'
    elif 'Equipment' in content:
        analysis['purpose'] = 'gear_handler'
    elif 'Inventory' in content and 'eat' in content.lower():
        analysis['purpose'] = 'food_handler'

    return analysis


class DomainAwareAnalyzer:
    def __init__(self, plugin_dir: Path):
        self.plugin_dir = plugin_dir
        self.plugin_name = None
        self.plugin_type = None  # boss, skilling, minigame
        self.class_mappings = {}
        self.files = {}

    def analyze(self):
        """Analyze plugin with domain awareness"""

        for java_file in self.plugin_dir.glob('**/*.java'):
            with open(java_file, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()

            self.files[java_file] = content

            # Find main plugin class
            if 'extends SquirePlugin' in content:
                pkg_match = re.search(r'package\s+([\w.]+)\s*;', content)
                if pkg_match:
                    parts = pkg_match.group(1).split('.')
                    self.plugin_name = parts[-1] if parts else 'plugin'

        if not self.plugin_name:
            self.plugin_name = self.plugin_dir.name

        # Determine plugin type
        self._determine_plugin_type()

        # Build intelligent class mappings
        self._build_class_mappings()

    def _determine_plugin_type(self):
        """Determine if this is a boss, skilling, or minigame plugin"""

        name_lower = self.plugin_name.lower()

        # Check boss plugins
        for boss in BOSS_MECHANICS:
            if boss in name_lower:
                self.plugin_type = boss
                return

        # Check minigames
        for minigame in MINIGAME_MECHANICS:
            if minigame in name_lower:
                self.plugin_type = minigame
                return

        # Check skilling
        for skill in SKILLING_MECHANICS:
            if skill in name_lower:
                self.plugin_type = skill
                return

        self.plugin_type = 'general'

    def _build_class_mappings(self):
        """Build class mappings using domain knowledge"""

        # First pass: map @TaskDesc classes
        for file_path, content in self.files.items():
            class_match = re.search(r'class\s+(\w+)', content)
            if not class_match:
                continue

            old_name = class_match.group(1)

            # Skip well-named classes
            if len(old_name) > 3:
                continue

            task_name = extract_task_desc(content)
            if task_name:
                self.class_mappings[old_name] = task_name_to_class_name(task_name)
                continue

            # Check if enum
            if 'extends Enum<' in content:
                self.class_mappings[old_name] = self._infer_enum_name(content)
                continue

            # Use domain knowledge
            inferred = infer_class_from_content(content, self.plugin_type)
            if inferred:
                self.class_mappings[old_name] = inferred
                continue

            # Analyze class purpose
            analysis = analyze_class_purpose(content, self.plugin_name)
            if analysis['is_abstract']:
                prefix = ''.join(w.capitalize() for w in self.plugin_name.split('_'))
                self.class_mappings[old_name] = f"{prefix}TaskBase"
            elif analysis['has_subscribe'] and not analysis['is_task']:
                prefix = ''.join(w.capitalize() for w in self.plugin_name.split('_'))
                self.class_mappings[old_name] = f"{prefix}EventHandler"
            elif analysis['purpose']:
                prefix = ''.join(w.capitalize() for w in self.plugin_name.split('_'))
                self.class_mappings[old_name] = f"{prefix}{analysis['purpose'].replace('_', ' ').title().replace(' ', '')}"
            else:
                self.class_mappings[old_name] = f"{old_name.upper()}Helper"

    def _infer_enum_name(self, content: str) -> str:
        """Infer enum name from content"""

        values = []
        values.extend(re.findall(r'public static final.*?enum.*?(\w+)\s*=', content))
        values.extend(re.findall(r'public static final\s+/\*\s*enum\s*\*/\s+\w+\s+(\w+)', content))

        values_str = ' '.join(values).upper()

        if any(x in values_str for x in ['BANKING', 'TRANSPORTING', 'FIGHTING', 'LOOTING']):
            return 'PluginState'
        if any(x in values_str for x in ['PHASE', 'STAGE', 'GREEN', 'BLUE', 'RED']):
            return 'BossPhase'
        if any(x in values_str for x in ['MELEE', 'RANGE', 'MAGE']):
            return 'CombatStyle'
        if any(x in values_str for x in ['NORTH', 'SOUTH', 'EAST', 'WEST']):
            return 'Direction'

        count = sum(1 for n in self.class_mappings.values() if n.startswith('GameEnum'))
        return f"GameEnum{count + 1}" if count else 'GameEnum'

    def get_new_package(self, old_package: str) -> str:
        if old_package.startswith('gg.squire'):
            return old_package
        return f"gg.squire.{self.plugin_name.lower()}.tasks"

    def deobfuscate_file(self, file_path: Path, content: str) -> Tuple[str, str]:
        """Full deobfuscation with domain awareness"""

        class_match = re.search(r'class\s+(\w+)', content)
        if not class_match:
            return content, file_path.name

        old_class_name = class_match.group(1)
        new_class_name = self.class_mappings.get(old_class_name, old_class_name)

        # Update package
        pkg_match = re.search(r'package\s+([\w.\-]+)\s*;', content)
        if pkg_match:
            old_package = pkg_match.group(1)
            new_package = self.get_new_package(old_package)
            content = content.replace(f'package {old_package};', f'package {new_package};')

        # Apply all deobfuscation
        content = decrypt_all_strings(content)
        content = inline_helper_methods(content)
        content = remove_dead_code(content)
        content = clean_control_flow(content)
        content = remove_encryption_boilerplate(content)
        content = rename_obfuscated_variables(content)

        # Rename class
        if old_class_name != new_class_name:
            content = re.sub(rf'\bclass\s+{re.escape(old_class_name)}\b', f'class {new_class_name}', content)
            content = re.sub(rf'\b{re.escape(old_class_name)}\s*\(', f'{new_class_name}(', content)

        # Update references
        for old_name, new_name in self.class_mappings.items():
            content = re.sub(rf'\bextends\s+{re.escape(old_name)}\b', f'extends {new_name}', content)
            if len(old_name) <= 2:
                content = re.sub(rf'\b{re.escape(old_name)}\.class\b', f'{new_name}.class', content)
                content = re.sub(rf'\bnew\s+{re.escape(old_name)}\s*\(', f'new {new_name}(', content)

        # Update imports
        for old_name, new_name in self.class_mappings.items():
            old_import = rf'import\s+[\w.\-]+\.{re.escape(old_name)}\s*;'
            if pkg_match:
                new_package = self.get_new_package(pkg_match.group(1))
                content = re.sub(old_import, f'import {new_package}.{new_name};', content)

        content = re.sub(r'\n\s*\n\s*\n+', '\n\n', content)

        return content, f"{new_class_name}.java"


# ============================================================================
# MAIN PROCESSING
# ============================================================================

def process_plugin(plugin_dir: Path, output_dir: Path) -> Dict:
    analyzer = DomainAwareAnalyzer(plugin_dir)
    analyzer.analyze()

    stats = {
        'files_processed': 0,
        'classes_renamed': len(analyzer.class_mappings),
        'plugin_name': analyzer.plugin_name,
        'plugin_type': analyzer.plugin_type,
    }

    plugin_output = output_dir / analyzer.plugin_name.lower().replace('-', '_')

    for file_path, original_content in analyzer.files.items():
        try:
            new_content, new_filename = analyzer.deobfuscate_file(file_path, original_content)

            rel_path = file_path.relative_to(plugin_dir)

            if str(rel_path).count('/') > 5:
                out_path = plugin_output / 'tasks' / new_filename
            else:
                out_path = plugin_output / rel_path.parent / new_filename

            out_path.parent.mkdir(parents=True, exist_ok=True)

            with open(out_path, 'w', encoding='utf-8') as f:
                f.write(new_content)

            stats['files_processed'] += 1

        except Exception as e:
            print(f"  Error: {e}")

    # Save mappings
    mappings_file = plugin_output / 'CLASS_MAPPINGS.json'
    with open(mappings_file, 'w') as f:
        json.dump(analyzer.class_mappings, f, indent=2)

    return stats


def main():
    print("=" * 70)
    print("OSRS DOMAIN-AWARE SQUIRE PLUGIN DEOBFUSCATOR")
    print("Using OSRS game knowledge for intelligent deobfuscation")
    print("=" * 70)

    base_dir = Path(__file__).parent.parent
    source_dir = base_dir / "plugins" / "src"
    output_dir = base_dir / "plugins" / "readable"

    if not source_dir.exists():
        print(f"ERROR: Source not found: {source_dir}")
        return

    if output_dir.exists():
        shutil.rmtree(output_dir)
    output_dir.mkdir(parents=True)

    total_files = 0
    total_classes = 0

    plugin_dirs = sorted(source_dir.iterdir())

    for i, plugin_dir in enumerate(plugin_dirs):
        if not plugin_dir.is_dir():
            continue

        print(f"\n[{i+1}/{len(plugin_dirs)}] Processing {plugin_dir.name}...")

        try:
            stats = process_plugin(plugin_dir, output_dir)
            print(f"  Plugin: {stats['plugin_name']} ({stats['plugin_type']})")
            print(f"  Files: {stats['files_processed']}, Classes renamed: {stats['classes_renamed']}")

            total_files += stats['files_processed']
            total_classes += stats['classes_renamed']
        except Exception as e:
            print(f"  ERROR: {e}")
            import traceback
            traceback.print_exc()

    print("\n" + "=" * 70)
    print(f"Total files processed: {total_files}")
    print(f"Total classes renamed: {total_classes}")
    print(f"Output: {output_dir}")
    print("=" * 70)


if __name__ == "__main__":
    main()
