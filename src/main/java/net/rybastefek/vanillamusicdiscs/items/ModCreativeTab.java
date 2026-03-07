package net.rybastefek.vanillamusicdiscs.items;

import net.minecraft.resources.ResourceLocation;
import vazkii.patchouli.api.PatchouliAPI;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rybastefek.vanillamusicdiscs.VanillaMusicDiscs;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VanillaMusicDiscs.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VANILLA_MUSIC_DISCS_TAB =
            CREATIVE_MODE_TABS.register("vanilla_music_discs_tab",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.vanillamusicdiscs"))
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> ModItems.SWEDEN.get().getDefaultInstance())
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.AERIE.get());
                                output.accept(ModItems.ANCESTRY.get());
                                output.accept(ModItems.ARIA_MATH.get());
                                output.accept(ModItems.AXOLOTL.get());
                                output.accept(ModItems.BEGINNING.get());
                                output.accept(ModItems.CHRIS.get());
                                output.accept(ModItems.CHRYSOPOEIA.get());
                                output.accept(ModItems.CLARK.get());
                                output.accept(ModItems.DANNY.get());
                                output.accept(ModItems.DEATH.get());
                                output.accept(ModItems.DOG.get());
                                output.accept(ModItems.DOOR.get());
                                output.accept(ModItems.DREITON.get());
                                output.accept(ModItems.DROOPY_LIKES_RICOCHET.get());
                                output.accept(ModItems.DROOPY_LIKES_YOUR_FACE.get());
                                output.accept(ModItems.DRY_HANDS.get());
                                output.accept(ModItems.EXCUSE.get());
                                output.accept(ModItems.FIREBUGS.get());
                                output.accept(ModItems.FLOATING_DREAM.get());
                                output.accept(ModItems.HAGGSTROM.get());
                                output.accept(ModItems.INFINITE_AMETHYST.get());
                                output.accept(ModItems.KEY.get());
                                output.accept(ModItems.LABYRINTHINE.get());
                                output.accept(ModItems.LEFT_TO_BLOOM.get());
                                output.accept(ModItems.LIVING_MICE.get());
                                output.accept(ModItems.MICE_ON_VENUS.get());
                                output.accept(ModItems.MINECRAFT.get());
                                output.accept(ModItems.MOOG_CITY.get());
                                output.accept(ModItems.ONE_MORE_DAY.get());
                                output.accept(ModItems.RUBEDO.get());
                                output.accept(ModItems.SO_BELOW.get());
                                output.accept(ModItems.SUBWOOFER_LULLABY.get());
                                output.accept(ModItems.SWEDEN.get());
                                output.accept(ModItems.WENDING.get());
                                output.accept(ModItems.WET_HANDS.get());
                                output.accept(PatchouliAPI.get().getBookStack(
                                        ResourceLocation.fromNamespaceAndPath("vanillamusicdiscs", "music_discs_guide")
                                ));
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}