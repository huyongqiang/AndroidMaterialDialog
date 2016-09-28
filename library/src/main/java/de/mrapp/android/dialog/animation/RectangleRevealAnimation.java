/*
 * Copyright 2014 - 2016 Michael Rapp
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package de.mrapp.android.dialog.animation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * An animation, which can be used to show or hide a dialog by animating its position and size.
 *
 * @author Michael Rapp
 * @since 3.7.0
 */
public class RectangleRevealAnimation extends DialogAnimation {

    /**
     * A builder, which allows to create animations, which can be used to show or hide a dialog by
     * animating its position and size.
     */
    public static class Builder
            extends AbstractAnimationBuilder<RectangleRevealAnimation, Builder> {

        /**
         * Creates a new builder, which allows to create animations, which can be used to show or
         * hide a dialog by animating its position and size.
         *
         * @param context
         *         The context, which should be used by the builder, as an instance of the class
         *         {@link Context}. The context may not be null
         */
        public Builder(@NonNull final Context context) {
            super(context);
        }

        /**
         * Sets the horizontal position, which should be used by the animation, which is created by
         * the builder.
         *
         * @param x
         *         The horizontal position, which should be set, as an {@link Integer} value
         * @return The builder, this method has been called upon, as an instance of the class {@link
         * Builder}
         */
        public final Builder setX(final int x) {
            create().setX(x);
            return self();
        }

        /**
         * Sets the vertical position, which should be used by the animation, which is created by
         * the builder.
         *
         * @param y
         *         The vertical position, which should be set, as an {@link Integer} value
         * @return The builder, this method has been called upon, as an instance of the class {@link
         * Builder}
         */
        public final Builder setY(final int y) {
            create().setY(y);
            return self();
        }

        /**
         * Sets the width, which should be used by the animation, which is created by the builder.
         *
         * @param width
         *         The width, which should be set, as an {@link Integer} value
         * @return The builder, this method has been called upon, as an instance of the class {@link
         * Builder}
         */
        public final Builder setWidth(final int width) {
            create().setWidth(width);
            return self();
        }

        /**
         * Sets the height, which should be used by the animation, which is created by the builder.
         *
         * @param height
         *         The height, which should be set, as an {@link Integer} value
         * @return The builder, this method has been called upon, as an instance of the class {@link
         * Builder}
         */
        public final Builder setHeight(final int height) {
            create().setHeight(height);
            return self();
        }

        @NonNull
        @Override
        protected RectangleRevealAnimation createAnimation(@NonNull final Context context) {
            return new RectangleRevealAnimation(context);
        }

    }

    /**
     * The horizontal position, which is used by the animation.
     */
    private Integer x;

    /**
     * The vertical position, which is used by the animation.
     */
    private Integer y;

    /**
     * The width, which is used by the animation.
     */
    private Integer width;

    /**
     * The height, which is used by the animation.
     */
    private Integer height;

    /**
     * Sets the horizontal position, which should be used by the animation.
     *
     * @param x
     *         The horizontal position, which should be set, as an {@link Integer} value or null, if
     *         no horizontal position should be used
     */
    protected final void setX(@Nullable final Integer x) {
        this.x = x;
    }

    /**
     * Sets the vertical position, which should be used by the animation.
     *
     * @param y
     *         The vertical position, which should be set, as an {@link Integer} value or null, if
     *         no vertical position should be used
     */
    protected final void setY(@Nullable final Integer y) {
        this.y = y;
    }

    /**
     * Sets the width, which should be used by the animation.
     *
     * @param width
     *         The width, which should be set, as an {@link Integer} value or null, if no width
     *         should be used
     */
    protected final void setWidth(@Nullable final Integer width) {
        this.width = width;
    }

    /**
     * Sets the height, which is used by the animation.
     *
     * @param height
     *         The height, which should be set, as an {@link Integer} value or null, if no height
     *         should be used
     */
    protected final void setHeight(@Nullable final Integer height) {
        this.height = height;
    }

    /**
     * Creates a new animation, which allows to show or hide a dialog by animating its position and
     * size.
     *
     * @param context
     *         The context, which should be used by the animation, as an instance of the class
     *         {@link Context}. The context may not be null
     */
    protected RectangleRevealAnimation(@NonNull final Context context) {
        super(context);
        this.x = null;
        this.y = null;
        this.width = null;
        this.height = null;
    }

    /**
     * Returns the horizontal position, which is used by the animation.
     *
     * @return The horizontal position, which is used by the animation, as an {@link Integer} value
     * or null, if no horizontal position is used
     */
    @Nullable
    public final Integer getX() {
        return x;
    }

    /**
     * Returns the vertical position, which is used by the animation.
     *
     * @return The vertical position, which is used by the animation, as an {@link Integer} value or
     * null, if no vertical position is used
     */
    @Nullable
    public final Integer getY() {
        return y;
    }

    /**
     * Returns the width, which is used by the animation.
     *
     * @return The width, which is used by the animation, as an {@link Integer} value or null, if no
     * width is used
     */
    @Nullable
    public final Integer getWidth() {
        return width;
    }

    /**
     * Returns the height, which is used by the animation.
     *
     * @return The height, which is used by the animation, as an {@link Integer} value or null, if
     * no height is used
     */
    @Nullable
    public final Integer getHeight() {
        return height;
    }

}