package com.richa.model;
import java.util.List;
public class UserRating {


       private int userId;
        private List<Rating> ratings;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public List<Rating> getRatings() {
            return ratings;
        }

        public void setRatings(List<Rating> ratings) {
            this.ratings = ratings;
        }

    }

