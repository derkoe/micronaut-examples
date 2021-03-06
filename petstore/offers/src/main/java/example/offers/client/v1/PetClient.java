/*
 * Copyright 2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.offers.client.v1;

import example.api.v1.Pet;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.Client;

import java.util.List;

/**
 * @author graemerocher
 * @since 1.0
 */
@Client(id = "pets", path = "/v1/pets")
public interface PetClient  {

    @Get("/{slug}")
    Maybe<Pet> find(String slug);

    @Get("/")
    Single<List<Pet>> list();

}
