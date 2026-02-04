/*
 * Copyright 2024 Jiaqi Liu
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
package io.github.qubitpi.ws.jersey.template.models;

import com.yahoo.elide.annotation.Include;
import com.yahoo.elide.graphql.annotation.GraphQLDescription;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * An example JPA entity that describes a book.
 */
@Entity
@Table(name = "Book")
@Include(rootLevel = true, name = "book", description = "book entity", friendlyName = "book")
public class Book {

    /**
     * Surrogate key.
     */
    @Id
    @GeneratedValue
    @GraphQLDescription("The surrogate/primary key of this book in database")
    public long id;

    /**
     * Attribute.
     */
    @GraphQLDescription("The book title")
    public String title = "";
}
