
/**
 * Project Name: Eagle_Rating
 * File Name:    Place.java
 * Package Name: astar\ratingbackend\Entity
 *
 * Type: Entity
 * Purpose: Place Entity
 *
 * Created on: [2024-02-21]
 * Author: @Wenzhuo Ma
 *
 * History:
 * - [2024-02-21] Created by @Wenzhuo Ma
 * -
 * ...
 */

package com.astar.ratingbackend.Entity;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Document("Places")
public class Place implements Serializable {
    @Id
    @Field("_id")
    private ObjectId locId;

    @Field("locName")
    private String locName;

    @Field("category")
    private String category;

    @Field("location")
    private GeoJsonPoint location;
    @Field("floor")
    private int floor;

    @Field("campus")
    private String campus;

    @Field("tags")
    private List<String> tags;

    @Field("ratingCount")
    private Integer ratingCount;

    @Field("ratingIds")
    private List<ObjectId> ratingIds;

    @Field("images")
    private List<Image> images;

    @Field("totalRating")
    private TotalRating totalRating;
    @Field("ratingAspect")
    private Map<String, String> ratingAspect;

    @Field("isDeleted")
    private boolean isDeleted;

    @Field("deletedDate")
    private Date deletedDate;


    // Nested class for Image documents within the "images" array
    @Data
    public static class Image implements Serializable {
        @Field("imageId")
        private ObjectId imageId;

        @Field("data")
        private String data;

        @Field("description")
        private String description;

        public ObjectId getImageId() {
            return imageId;
        }

        public void setImageId(ObjectId imageId) {
            this.imageId = imageId;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    @Data
    public static class TotalRating implements Serializable {
        private double overall;
        private double rating1;
        private double rating2;
        private double rating3;
        private Map<String, String> ratingName; // Map rating1, rating2, rating3 to specific names

        public TotalRating(double overall, double rating1, double rating2, double rating3, Map<String, String> ratingName) {
            this.overall = overall;
            this.rating1 = rating1;
            this.rating2 = rating2;
            this.rating3 = rating3;
            this.ratingName = ratingName;
        }

    }
}