#!/usr/bin/env python3
"""
Analyze decrypted strings to find most interesting OSRS bot-related content
"""

import json
from pathlib import Path
from collections import defaultdict

def main():
    tools_dir = Path(__file__).parent.parent / "tools"
    dict_file = tools_dir / "string_dictionary.json"

    print("=" * 70)
    print("OSRS BOTTING STRING ANALYSIS")
    print("=" * 70)

    with open(dict_file, 'r', encoding='utf-8') as f:
        string_dict = json.load(f)

    # Extract all unique decrypted strings
    all_strings = set()
    for entry in string_dict.values():
        all_strings.add(entry['decrypted'])

    all_strings = sorted(all_strings)

    # Category searches
    categories = {
        'Items - Weapons': ['sword', 'scimitar', 'staff', 'bow', 'arrow', 'dagger', 'mace', 'axe', 'whip', 'godsword'],
        'Items - Armor': ['platebody', 'platelegs', 'helmet', 'boots', 'gloves', 'shield', 'armor', 'armour', 'chainbody'],
        'Items - Food': ['lobster', 'shark', 'bread', 'cake', 'tuna', 'salmon', 'bass', 'trout', 'monkfish', 'manta'],
        'Items - Potions': ['potion', 'brew', 'prayer', 'super', 'antipoison', 'antidote', 'restore', 'sanfew'],
        'Items - Runes': ['rune', 'air', 'water', 'earth', 'fire', 'mind', 'chaos', 'death', 'blood', 'soul'],
        'Items - Tools': ['pickaxe', 'hatchet', 'chisel', 'needle', 'hammer', 'saw', 'knife', 'trowel'],
        'NPCs - Combat': ['goblin', 'demon', 'dragon', 'giant', 'zombie', 'skeleton', 'guard', 'warrior'],
        'NPCs - Service': ['banker', 'shopkeeper', 'guard', 'wise old man', 'tutor', 'instructor'],
        'Locations - Cities': ['varrock', 'lumbridge', 'falador', 'ardougne', 'seers', 'yanille', 'edgeville'],
        'Locations - Banks': ['bank', 'grand exchange', 'ge ', 'deposit box', 'chest'],
        'Actions - Combat': ['attack', 'kill', 'fight', 'defend', 'special', 'prayer'],
        'Actions - Skills': ['mine', 'fish', 'cook', 'smith', 'craft', 'thiev', 'agility', 'runecraft'],
        'Actions - Movement': ['walk', 'run', 'teleport', 'climb', 'jump', 'cross', 'enter', 'exit'],
        'Actions - Inventory': ['drop', 'take', 'equip', 'wield', 'wear', 'drink', 'eat', 'use'],
        'Bot States': ['banking', 'fighting', 'looting', 'waiting', 'traveling', 'buying', 'selling'],
        'Bot Messages': ['plugin', 'script', 'bot', 'automation', 'task', 'state', 'config'],
        'Quest Related': ['quest', 'tutorial', 'task', 'objective', 'complete', 'reward'],
        'Minigames': ['barrows', 'fight cave', 'toa', 'nightmare', 'guardians of the rift', 'mage training'],
    }

    print("\n" + "=" * 70)
    print("CATEGORIZED STRINGS")
    print("=" * 70)

    results = {}
    for cat_name, keywords in categories.items():
        matches = set()
        for s in all_strings:
            if any(kw.lower() in s.lower() for kw in keywords):
                matches.add(s)
        results[cat_name] = sorted(matches)

    for cat_name, matches in results.items():
        print(f"\n{cat_name} ({len(matches)} strings):")
        print("-" * 70)
        for s in matches[:20]:  # Show first 20
            display = s[:65] + "..." if len(s) > 65 else s
            print(f"  - {display}")
        if len(matches) > 20:
            print(f"  ... and {len(matches) - 20} more")

    # Find bot configuration keys
    print("\n" + "=" * 70)
    print("BOT CONFIGURATION KEYS")
    print("=" * 70)
    config_keys = [s for s in all_strings if '_' in s and s.isupper() and len(s) > 3 and len(s) < 50]
    for s in sorted(config_keys)[:50]:
        print(f"  - {s}")
    if len(config_keys) > 50:
        print(f"  ... and {len(config_keys) - 50} more")

    # Find interesting bot messages
    print("\n" + "=" * 70)
    print("BOT STATUS MESSAGES")
    print("=" * 70)
    messages = [s for s in all_strings if
                len(s) > 10 and len(s) < 200 and
                any(word in s.lower() for word in
                    ['plugin', 'bot', 'state', 'switching', 'starting', 'stopping',
                     'task', 'waiting', 'failed', 'error', 'success', 'complete'])]
    for s in sorted(set(messages))[:50]:
        print(f"  - {s}")

    # Find item names
    print("\n" + "=" * 70)
    print("OSRS ITEM NAMES (Sample)")
    print("=" * 70)
    items = [s for s in all_strings if
             len(s) > 3 and len(s) < 40 and
             any(word in s.lower() for word in
                 ['rune', 'dragon', 'adamant', 'mithril', 'steel', 'iron', 'bronze',
                  'potion', 'ring', 'amulet', 'cape', 'boots', 'gloves'])]
    for s in sorted(set(items))[:50]:
        print(f"  - {s}")

    # Find NPC names
    print("\n" + "=" * 70)
    print("OSRS NPC NAMES (Sample)")
    print("=" * 70)
    npcs = [s for s in all_strings if
            len(s) > 3 and len(s) < 40 and
            any(word in s.lower() for word in
                ['goblin', 'guard', 'banker', 'giant', 'demon', 'dragon', 'wizard',
                 'chicken', 'cow', 'rat', 'spider', 'zombie', 'skeleton'])]
    for s in sorted(set(npcs))[:50]:
        print(f"  - {s}")

    # Find plugin names
    print("\n" + "=" * 70)
    print("PLUGIN/SCRIPT NAMES")
    print("=" * 70)
    plugins = [s for s in all_strings if
               'squire' in s.lower() or
               ('plugin' in s.lower() and len(s) < 50) or
               ('script' in s.lower() and len(s) < 50)]
    for s in sorted(set(plugins))[:40]:
        display = s[:65] + "..." if len(s) > 65 else s
        print(f"  - {display}")

    # URLs found
    print("\n" + "=" * 70)
    print("URLS/ENDPOINTS")
    print("=" * 70)
    urls = [s for s in all_strings if 'http' in s or '.com' in s or 'api' in s.lower()]
    for s in sorted(set(urls))[:30]:
        print(f"  - {s}")

    print("\n" + "=" * 70)
    print(f"TOTAL UNIQUE STRINGS: {len(all_strings)}")
    print("=" * 70)


if __name__ == "__main__":
    main()
