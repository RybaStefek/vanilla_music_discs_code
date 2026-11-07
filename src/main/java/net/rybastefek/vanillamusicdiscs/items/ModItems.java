package net.rybastefek.vanillamusicdiscs.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.core.registries.BuiltInRegistries;
import net.rybastefek.vanillamusicdiscs.VanillaMusicDiscs;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, VanillaMusicDiscs.MOD_ID);

    public static final DeferredHolder<Item, Item> AERIE = registerDisc("aerie_music_disc", "aerie");
    public static final DeferredHolder<Item, Item> ALPHA = registerDisc("alpha_music_disc", "alpha");
    public static final DeferredHolder<Item, Item> ANCESTRY = registerDisc("ancestry_music_disc", "ancestry");
    public static final DeferredHolder<Item, Item> ARIA_MATH = registerDisc("aria_math_music_disc", "aria_math");
    public static final DeferredHolder<Item, Item> AXOLOTL = registerDisc("axolotl_music_disc", "axolotl");
    public static final DeferredHolder<Item, Item> BEGINNING = registerDisc("beginning_music_disc", "beginning");
    public static final DeferredHolder<Item, Item> BEGINNING_2 = registerDisc("beginning_2_music_disc", "beginning_2");
    public static final DeferredHolder<Item, Item> CHRIS = registerDisc("chris_music_disc", "chris");
    public static final DeferredHolder<Item, Item> CHRYSOPOEIA = registerDisc("chrysopoeia_music_disc", "chrysopoeia");
    public static final DeferredHolder<Item, Item> CLARK = registerDisc("clark_music_disc", "clark");
    public static final DeferredHolder<Item, Item> CONCRETE_HALLS = registerDisc("concrete_halls_music_disc", "concrete_halls");
    public static final DeferredHolder<Item, Item> DANNY = registerDisc("danny_music_disc", "danny");
    public static final DeferredHolder<Item, Item> DEATH = registerDisc("death_music_disc", "death");
    public static final DeferredHolder<Item, Item> DOG = registerDisc("dog_music_disc", "dog");
    public static final DeferredHolder<Item, Item> DOOR = registerDisc("door_music_disc", "door");
    public static final DeferredHolder<Item, Item> DREITON = registerDisc("dreiton_music_disc", "dreiton");
    public static final DeferredHolder<Item, Item> DROOPY_LIKES_RICOCHET = registerDisc("droopy_likes_ricochet_music_disc", "droopy_likes_ricochet");
    public static final DeferredHolder<Item, Item> DROOPY_LIKES_YOUR_FACE = registerDisc("droopy_likes_your_face_music_disc", "droopy_likes_your_face");
    public static final DeferredHolder<Item, Item> DRY_HANDS = registerDisc("dry_hands_music_disc", "dry_hands");
    public static final DeferredHolder<Item, Item> EXCUSE = registerDisc("excuse_music_disc", "excuse");
    public static final DeferredHolder<Item, Item> FIREBUGS = registerDisc("firebugs_music_disc", "firebugs");
    public static final DeferredHolder<Item, Item> FLOATING_DREAM = registerDisc("floating_dream_music_disc", "floating_dream");
    public static final DeferredHolder<Item, Item> HAGGSTROM = registerDisc("haggstrom_music_disc", "haggstrom");
    public static final DeferredHolder<Item, Item> INFINITE_AMETHYST = registerDisc("infinite_amethyst_music_disc", "infinite_amethyst");
    public static final DeferredHolder<Item, Item> KEY = registerDisc("key_music_disc", "key");
    public static final DeferredHolder<Item, Item> LABYRINTHINE = registerDisc("labyrinthine_music_disc", "labyrinthine");
    public static final DeferredHolder<Item, Item> LEFT_TO_BLOOM = registerDisc("left_to_bloom_music_disc", "left_to_bloom");
    public static final DeferredHolder<Item, Item> LIVING_MICE = registerDisc("living_mice_music_disc", "living_mice");
    public static final DeferredHolder<Item, Item> MICE_ON_VENUS = registerDisc("mice_on_venus_music_disc", "mice_on_venus");
    public static final DeferredHolder<Item, Item> MINECRAFT = registerDisc("minecraft_music_disc", "minecraft");
    public static final DeferredHolder<Item, Item> MOOG_CITY = registerDisc("moog_city_music_disc", "moog_city");
    public static final DeferredHolder<Item, Item> MOOG_CITY_2 = registerDisc("moog_city_2_music_disc", "moog_city_2");
    public static final DeferredHolder<Item, Item> ONE_MORE_DAY = registerDisc("one_more_day_music_disc", "one_more_day");
    public static final DeferredHolder<Item, Item> OXYGENE = registerDisc("oxygene_music_disc", "oxygene");
    public static final DeferredHolder<Item, Item> RUBEDO = registerDisc("rubedo_music_disc", "rubedo");
    public static final DeferredHolder<Item, Item> SO_BELOW = registerDisc("so_below_music_disc", "so_below");
    public static final DeferredHolder<Item, Item> SUBWOOFER_LULLABY = registerDisc("subwoofer_lullaby_music_disc", "subwoofer_lullaby");
    public static final DeferredHolder<Item, Item> SWEDEN = registerDisc("sweden_music_disc", "sweden");
    public static final DeferredHolder<Item, Item> TASWELL = registerDisc("taswell_music_disc", "taswell");
    public static final DeferredHolder<Item, Item> WENDING = registerDisc("wending_music_disc", "wending");
    public static final DeferredHolder<Item, Item> WET_HANDS = registerDisc("wet_hands_music_disc", "wet_hands");

    private static DeferredHolder<Item, Item> registerDisc(String itemId, String songId) {
        ResourceKey<JukeboxSong> songKey = ResourceKey.create(
                Registries.JUKEBOX_SONG,
                ResourceLocation.fromNamespaceAndPath(VanillaMusicDiscs.MOD_ID, songId)
        );
        return ITEMS.register(itemId, () -> new Item(
                new Item.Properties()
                        .stacksTo(1)
                        .rarity(Rarity.RARE)
                        .jukeboxPlayable(songKey)
        ));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}