/*
 * Copyright 2021 The JSpecify Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.jspecify.annotations.DefaultNonNull;
import org.jspecify.annotations.Nullable;
import org.jspecify.annotations.NullnessUnspecified;

@DefaultNonNull
class TypeVariableUnspecToParentUnionNull<
    Never1T,
    ChildOfNever1T extends Never1T,
    UnspecChildOfNever1T extends @NullnessUnspecified Never1T,
    NullChildOfNever1T extends @Nullable Never1T,
    //
    Never2T extends Object,
    ChildOfNever2T extends Never2T,
    UnspecChildOfNever2T extends @NullnessUnspecified Never2T,
    NullChildOfNever2T extends @Nullable Never2T,
    //
    UnspecT extends @NullnessUnspecified Object,
    ChildOfUnspecT extends UnspecT,
    UnspecChildOfUnspecT extends @NullnessUnspecified UnspecT,
    NullChildOfUnspecT extends @Nullable UnspecT,
    //
    ParametricT extends @Nullable Object,
    ChildOfParametricT extends ParametricT,
    UnspecChildOfParametricT extends @NullnessUnspecified ParametricT,
    NullChildOfParametricT extends @Nullable ParametricT,
    //
    UnusedT> {
  @Nullable
  Never1T x0(@NullnessUnspecified ChildOfNever1T x) {
    return x;
  }

  @Nullable
  Never1T x1(@NullnessUnspecified UnspecChildOfNever1T x) {
    return x;
  }

  @Nullable
  Never1T x2(@NullnessUnspecified NullChildOfNever1T x) {
    return x;
  }

  @Nullable
  Never2T x3(@NullnessUnspecified ChildOfNever2T x) {
    return x;
  }

  @Nullable
  Never2T x4(@NullnessUnspecified UnspecChildOfNever2T x) {
    return x;
  }

  @Nullable
  Never2T x5(@NullnessUnspecified NullChildOfNever2T x) {
    return x;
  }

  @Nullable
  UnspecT x6(@NullnessUnspecified ChildOfUnspecT x) {
    return x;
  }

  @Nullable
  UnspecT x7(@NullnessUnspecified UnspecChildOfUnspecT x) {
    return x;
  }

  @Nullable
  UnspecT x8(@NullnessUnspecified NullChildOfUnspecT x) {
    return x;
  }

  @Nullable
  ParametricT x9(@NullnessUnspecified ChildOfParametricT x) {
    return x;
  }

  @Nullable
  ParametricT x10(@NullnessUnspecified UnspecChildOfParametricT x) {
    return x;
  }

  @Nullable
  ParametricT x11(@NullnessUnspecified NullChildOfParametricT x) {
    return x;
  }
}