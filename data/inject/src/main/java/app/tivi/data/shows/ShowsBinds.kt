/*
 * Copyright 2023 Google LLC
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

package app.tivi.data.shows

import app.tivi.inject.Tmdb
import app.tivi.inject.Trakt
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class ShowsBinds {
    @Binds
    @Trakt
    abstract fun bindTraktShowDataSource(source: TraktShowDataSource): ShowDataSource

    @Binds
    @Tmdb
    abstract fun bindTmdbShowDataSource(source: TmdbShowDataSource): ShowDataSource
}
