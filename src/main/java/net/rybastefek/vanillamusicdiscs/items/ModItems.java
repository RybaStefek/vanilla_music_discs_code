package net.rybastefek.vanillamusicdiscs.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rybastefek.vanillamusicdiscs.VanillaMusicDiscs;
import net.rybastefek.vanillamusicdiscs.sounds.ModSounds;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VanillaMusicDiscs.MOD_ID);

    public static final RegistryObject<Item> AERIE = ITEMS.register("aerie_music_disc",
            () -> new RecordItem(15, ModSounds.AERIE,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> ANCESTRY = ITEMS.register("ancestry_music_disc",
            () -> new RecordItem(15, ModSounds.ANCESTRY,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> ARIA_MATH = ITEMS.register("aria_math_music_disc",
            () -> new RecordItem(15, ModSounds.ARIA_MATH,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> AXOLOTL = ITEMS.register("axolotl_music_disc",
            () -> new RecordItem(15, ModSounds.AXOLOTL,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> BEGINNING = ITEMS.register("beginning_music_disc",
            () -> new RecordItem(15, ModSounds.BEGINNING,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> CHRIS = ITEMS.register("chris_music_disc",
            () -> new RecordItem(15, ModSounds.CHRIS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> CHRYSOPOEIA = ITEMS.register("chrysopoeia_music_disc",
            () -> new RecordItem(15, ModSounds.CHRYSOPOEIA,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> CLARK = ITEMS.register("clark_music_disc",
            () -> new RecordItem(15, ModSounds.CLARK,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> DANNY = ITEMS.register("danny_music_disc",
            () -> new RecordItem(15, ModSounds.DANNY,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> DEATH = ITEMS.register("death_music_disc",
            () -> new RecordItem(15, ModSounds.DEATH,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> DOG = ITEMS.register("dog_music_disc",
            () -> new RecordItem(15, ModSounds.DOG,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> DOOR = ITEMS.register("door_music_disc",
            () -> new RecordItem(15, ModSounds.DOOR,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> DREITON = ITEMS.register("dreiton_music_disc",
            () -> new RecordItem(15, ModSounds.DREITON,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> DROOPY_LIKES_RICOCHET = ITEMS.register("droopy_likes_ricochet_music_disc",
            () -> new RecordItem(15, ModSounds.DROOPY_LIKES_RICOCHET,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> DROOPY_LIKES_YOUR_FACE = ITEMS.register("droopy_likes_your_face_music_disc",
            () -> new RecordItem(15, ModSounds.DROOPY_LIKES_YOUR_FACE,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> DRY_HANDS = ITEMS.register("dry_hands_music_disc",
            () -> new RecordItem(15, ModSounds.DRY_HANDS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> EXCUSE = ITEMS.register("excuse_music_disc",
            () -> new RecordItem(15, ModSounds.EXCUSE,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> FIREBUGS = ITEMS.register("firebugs_music_disc",
            () -> new RecordItem(15, ModSounds.FIREBUGS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> FLOATING_DREAM = ITEMS.register("floating_dream_music_disc",
            () -> new RecordItem(15, ModSounds.FLOATING_DREAM,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> HAGGSTROM = ITEMS.register("haggstrom_music_disc",
            () -> new RecordItem(15, ModSounds.HAGGSTROM,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> INFINITE_AMETHYST = ITEMS.register("infinite_amethyst_music_disc",
            () -> new RecordItem(15, ModSounds.INFINITE_AMETHYST,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> KEY = ITEMS.register("key_music_disc",
            () -> new RecordItem(15, ModSounds.KEY,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> LABYRINTHINE = ITEMS.register("labyrinthine_music_disc",
            () -> new RecordItem(15, ModSounds.LABYRINTHINE,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> LEFT_TO_BLOOM = ITEMS.register("left_to_bloom_music_disc",
            () -> new RecordItem(15, ModSounds.LEFT_TO_BLOOM,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> LIVING_MICE = ITEMS.register("living_mice_music_disc",
            () -> new RecordItem(15, ModSounds.LIVING_MICE,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> MICE_ON_VENUS = ITEMS.register("mice_on_venus_music_disc",
            () -> new RecordItem(15, ModSounds.MICE_ON_VENUS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> MINECRAFT = ITEMS.register("minecraft_music_disc",
            () -> new RecordItem(15, ModSounds.MINECRAFT,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> MOOG_CITY = ITEMS.register("moog_city_music_disc",
            () -> new RecordItem(15, ModSounds.MOOG_CITY,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> ONE_MORE_DAY = ITEMS.register("one_more_day_music_disc",
            () -> new RecordItem(15, ModSounds.ONE_MORE_DAY,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> RUBEDO = ITEMS.register("rubedo_music_disc",
            () -> new RecordItem(15, ModSounds.RUBEDO,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> SO_BELOW = ITEMS.register("so_below_music_disc",
            () -> new RecordItem(15, ModSounds.SO_BELOW,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> SUBWOOFER_LULLABY = ITEMS.register("subwoofer_lullaby_music_disc",
            () -> new RecordItem(15, ModSounds.SUBWOOFER_LULLABY,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> SWEDEN = ITEMS.register("sweden_music_disc",
            () -> new RecordItem(15, ModSounds.SWEDEN,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> WENDING = ITEMS.register("wending_music_disc",
            () -> new RecordItem(15, ModSounds.WENDING,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static final RegistryObject<Item> WET_HANDS = ITEMS.register("wet_hands_music_disc",
            () -> new RecordItem(15, ModSounds.WET_HANDS,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 210));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}