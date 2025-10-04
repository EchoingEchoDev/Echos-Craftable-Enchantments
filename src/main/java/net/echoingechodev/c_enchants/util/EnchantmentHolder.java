package net.echoingechodev.c_enchants.util;

import com.mojang.datafixers.util.Either;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderOwner;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class EnchantmentHolder implements net.minecraft.core.Holder {

    @Override
    public Object value() {
        return null;
    }

    @Override
    public boolean isBound() {
        return false;
    }

    @Override
    public boolean is(ResourceLocation resourceLocation) {
        return false;
    }

    @Override
    public boolean is(ResourceKey resourceKey) {
        return false;
    }

    @Override
    public boolean is(TagKey tagKey) {
        return false;
    }

    @Override
    public boolean is(Holder holder) {
        return false;
    }

    @Override
    public Stream<TagKey> tags() {
        return null;
    }

    @Override
    public Either unwrap() {
        return null;
    }

    @Override
    public Optional<ResourceKey> unwrapKey() {
        return Optional.empty();
    }

    @Override
    public Kind kind() {
        return null;
    }

    @Override
    public boolean canSerializeIn(HolderOwner holderOwner) {
        return false;
    }

    @Override
    public boolean is(Predicate predicate) {
        return false;
    }
}
