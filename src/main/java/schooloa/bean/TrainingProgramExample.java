package schooloa.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainingProgramExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainingProgramExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNull() {
            addCriterion("professional is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalIsNotNull() {
            addCriterion("professional is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalEqualTo(String value) {
            addCriterion("professional =", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotEqualTo(String value) {
            addCriterion("professional <>", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThan(String value) {
            addCriterion("professional >", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalGreaterThanOrEqualTo(String value) {
            addCriterion("professional >=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThan(String value) {
            addCriterion("professional <", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLessThanOrEqualTo(String value) {
            addCriterion("professional <=", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalLike(String value) {
            addCriterion("professional like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotLike(String value) {
            addCriterion("professional not like", value, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalIn(List<String> values) {
            addCriterion("professional in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotIn(List<String> values) {
            addCriterion("professional not in", values, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalBetween(String value1, String value2) {
            addCriterion("professional between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andProfessionalNotBetween(String value1, String value2) {
            addCriterion("professional not between", value1, value2, "professional");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andCoursenoIsNull() {
            addCriterion("courseno is null");
            return (Criteria) this;
        }

        public Criteria andCoursenoIsNotNull() {
            addCriterion("courseno is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenoEqualTo(String value) {
            addCriterion("courseno =", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotEqualTo(String value) {
            addCriterion("courseno <>", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoGreaterThan(String value) {
            addCriterion("courseno >", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoGreaterThanOrEqualTo(String value) {
            addCriterion("courseno >=", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLessThan(String value) {
            addCriterion("courseno <", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLessThanOrEqualTo(String value) {
            addCriterion("courseno <=", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoLike(String value) {
            addCriterion("courseno like", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotLike(String value) {
            addCriterion("courseno not like", value, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoIn(List<String> values) {
            addCriterion("courseno in", values, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotIn(List<String> values) {
            addCriterion("courseno not in", values, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoBetween(String value1, String value2) {
            addCriterion("courseno between", value1, value2, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenoNotBetween(String value1, String value2) {
            addCriterion("courseno not between", value1, value2, "courseno");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("coursename is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("coursename is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("coursename =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("coursename <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("coursename >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("coursename >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("coursename <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("coursename <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("coursename like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("coursename not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("coursename in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("coursename not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("coursename between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("coursename not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Double value) {
            addCriterion("credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Double value) {
            addCriterion("credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Double value) {
            addCriterion("credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Double value) {
            addCriterion("credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Double value) {
            addCriterion("credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Double value) {
            addCriterion("credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Double> values) {
            addCriterion("credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Double> values) {
            addCriterion("credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Double value1, Double value2) {
            addCriterion("credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Double value1, Double value2) {
            addCriterion("credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andTotalhourIsNull() {
            addCriterion("totalhour is null");
            return (Criteria) this;
        }

        public Criteria andTotalhourIsNotNull() {
            addCriterion("totalhour is not null");
            return (Criteria) this;
        }

        public Criteria andTotalhourEqualTo(Double value) {
            addCriterion("totalhour =", value, "totalhour");
            return (Criteria) this;
        }

        public Criteria andTotalhourNotEqualTo(Double value) {
            addCriterion("totalhour <>", value, "totalhour");
            return (Criteria) this;
        }

        public Criteria andTotalhourGreaterThan(Double value) {
            addCriterion("totalhour >", value, "totalhour");
            return (Criteria) this;
        }

        public Criteria andTotalhourGreaterThanOrEqualTo(Double value) {
            addCriterion("totalhour >=", value, "totalhour");
            return (Criteria) this;
        }

        public Criteria andTotalhourLessThan(Double value) {
            addCriterion("totalhour <", value, "totalhour");
            return (Criteria) this;
        }

        public Criteria andTotalhourLessThanOrEqualTo(Double value) {
            addCriterion("totalhour <=", value, "totalhour");
            return (Criteria) this;
        }

        public Criteria andTotalhourIn(List<Double> values) {
            addCriterion("totalhour in", values, "totalhour");
            return (Criteria) this;
        }

        public Criteria andTotalhourNotIn(List<Double> values) {
            addCriterion("totalhour not in", values, "totalhour");
            return (Criteria) this;
        }

        public Criteria andTotalhourBetween(Double value1, Double value2) {
            addCriterion("totalhour between", value1, value2, "totalhour");
            return (Criteria) this;
        }

        public Criteria andTotalhourNotBetween(Double value1, Double value2) {
            addCriterion("totalhour not between", value1, value2, "totalhour");
            return (Criteria) this;
        }

        public Criteria andTheoryhourIsNull() {
            addCriterion("theoryhour is null");
            return (Criteria) this;
        }

        public Criteria andTheoryhourIsNotNull() {
            addCriterion("theoryhour is not null");
            return (Criteria) this;
        }

        public Criteria andTheoryhourEqualTo(Double value) {
            addCriterion("theoryhour =", value, "theoryhour");
            return (Criteria) this;
        }

        public Criteria andTheoryhourNotEqualTo(Double value) {
            addCriterion("theoryhour <>", value, "theoryhour");
            return (Criteria) this;
        }

        public Criteria andTheoryhourGreaterThan(Double value) {
            addCriterion("theoryhour >", value, "theoryhour");
            return (Criteria) this;
        }

        public Criteria andTheoryhourGreaterThanOrEqualTo(Double value) {
            addCriterion("theoryhour >=", value, "theoryhour");
            return (Criteria) this;
        }

        public Criteria andTheoryhourLessThan(Double value) {
            addCriterion("theoryhour <", value, "theoryhour");
            return (Criteria) this;
        }

        public Criteria andTheoryhourLessThanOrEqualTo(Double value) {
            addCriterion("theoryhour <=", value, "theoryhour");
            return (Criteria) this;
        }

        public Criteria andTheoryhourIn(List<Double> values) {
            addCriterion("theoryhour in", values, "theoryhour");
            return (Criteria) this;
        }

        public Criteria andTheoryhourNotIn(List<Double> values) {
            addCriterion("theoryhour not in", values, "theoryhour");
            return (Criteria) this;
        }

        public Criteria andTheoryhourBetween(Double value1, Double value2) {
            addCriterion("theoryhour between", value1, value2, "theoryhour");
            return (Criteria) this;
        }

        public Criteria andTheoryhourNotBetween(Double value1, Double value2) {
            addCriterion("theoryhour not between", value1, value2, "theoryhour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourIsNull() {
            addCriterion("experimenthour is null");
            return (Criteria) this;
        }

        public Criteria andExperimenthourIsNotNull() {
            addCriterion("experimenthour is not null");
            return (Criteria) this;
        }

        public Criteria andExperimenthourEqualTo(Double value) {
            addCriterion("experimenthour =", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourNotEqualTo(Double value) {
            addCriterion("experimenthour <>", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourGreaterThan(Double value) {
            addCriterion("experimenthour >", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourGreaterThanOrEqualTo(Double value) {
            addCriterion("experimenthour >=", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourLessThan(Double value) {
            addCriterion("experimenthour <", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourLessThanOrEqualTo(Double value) {
            addCriterion("experimenthour <=", value, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourIn(List<Double> values) {
            addCriterion("experimenthour in", values, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourNotIn(List<Double> values) {
            addCriterion("experimenthour not in", values, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourBetween(Double value1, Double value2) {
            addCriterion("experimenthour between", value1, value2, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andExperimenthourNotBetween(Double value1, Double value2) {
            addCriterion("experimenthour not between", value1, value2, "experimenthour");
            return (Criteria) this;
        }

        public Criteria andComputerhourIsNull() {
            addCriterion("computerhour is null");
            return (Criteria) this;
        }

        public Criteria andComputerhourIsNotNull() {
            addCriterion("computerhour is not null");
            return (Criteria) this;
        }

        public Criteria andComputerhourEqualTo(Double value) {
            addCriterion("computerhour =", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourNotEqualTo(Double value) {
            addCriterion("computerhour <>", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourGreaterThan(Double value) {
            addCriterion("computerhour >", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourGreaterThanOrEqualTo(Double value) {
            addCriterion("computerhour >=", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourLessThan(Double value) {
            addCriterion("computerhour <", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourLessThanOrEqualTo(Double value) {
            addCriterion("computerhour <=", value, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourIn(List<Double> values) {
            addCriterion("computerhour in", values, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourNotIn(List<Double> values) {
            addCriterion("computerhour not in", values, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourBetween(Double value1, Double value2) {
            addCriterion("computerhour between", value1, value2, "computerhour");
            return (Criteria) this;
        }

        public Criteria andComputerhourNotBetween(Double value1, Double value2) {
            addCriterion("computerhour not between", value1, value2, "computerhour");
            return (Criteria) this;
        }

        public Criteria andTestformIsNull() {
            addCriterion("testform is null");
            return (Criteria) this;
        }

        public Criteria andTestformIsNotNull() {
            addCriterion("testform is not null");
            return (Criteria) this;
        }

        public Criteria andTestformEqualTo(String value) {
            addCriterion("testform =", value, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformNotEqualTo(String value) {
            addCriterion("testform <>", value, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformGreaterThan(String value) {
            addCriterion("testform >", value, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformGreaterThanOrEqualTo(String value) {
            addCriterion("testform >=", value, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformLessThan(String value) {
            addCriterion("testform <", value, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformLessThanOrEqualTo(String value) {
            addCriterion("testform <=", value, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformLike(String value) {
            addCriterion("testform like", value, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformNotLike(String value) {
            addCriterion("testform not like", value, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformIn(List<String> values) {
            addCriterion("testform in", values, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformNotIn(List<String> values) {
            addCriterion("testform not in", values, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformBetween(String value1, String value2) {
            addCriterion("testform between", value1, value2, "testform");
            return (Criteria) this;
        }

        public Criteria andTestformNotBetween(String value1, String value2) {
            addCriterion("testform not between", value1, value2, "testform");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNull() {
            addCriterion("coursetype is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("coursetype is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(String value) {
            addCriterion("coursetype =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(String value) {
            addCriterion("coursetype <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(String value) {
            addCriterion("coursetype >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("coursetype >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(String value) {
            addCriterion("coursetype <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("coursetype <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLike(String value) {
            addCriterion("coursetype like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotLike(String value) {
            addCriterion("coursetype not like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<String> values) {
            addCriterion("coursetype in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<String> values) {
            addCriterion("coursetype not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(String value1, String value2) {
            addCriterion("coursetype between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(String value1, String value2) {
            addCriterion("coursetype not between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterIsNull() {
            addCriterion("beginsemester is null");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterIsNotNull() {
            addCriterion("beginsemester is not null");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterEqualTo(String value) {
            addCriterion("beginsemester =", value, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterNotEqualTo(String value) {
            addCriterion("beginsemester <>", value, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterGreaterThan(String value) {
            addCriterion("beginsemester >", value, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterGreaterThanOrEqualTo(String value) {
            addCriterion("beginsemester >=", value, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterLessThan(String value) {
            addCriterion("beginsemester <", value, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterLessThanOrEqualTo(String value) {
            addCriterion("beginsemester <=", value, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterLike(String value) {
            addCriterion("beginsemester like", value, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterNotLike(String value) {
            addCriterion("beginsemester not like", value, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterIn(List<String> values) {
            addCriterion("beginsemester in", values, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterNotIn(List<String> values) {
            addCriterion("beginsemester not in", values, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterBetween(String value1, String value2) {
            addCriterion("beginsemester between", value1, value2, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andBeginsemesterNotBetween(String value1, String value2) {
            addCriterion("beginsemester not between", value1, value2, "beginsemester");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathIsNull() {
            addCriterion("syllabuspath is null");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathIsNotNull() {
            addCriterion("syllabuspath is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathEqualTo(String value) {
            addCriterion("syllabuspath =", value, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathNotEqualTo(String value) {
            addCriterion("syllabuspath <>", value, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathGreaterThan(String value) {
            addCriterion("syllabuspath >", value, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathGreaterThanOrEqualTo(String value) {
            addCriterion("syllabuspath >=", value, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathLessThan(String value) {
            addCriterion("syllabuspath <", value, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathLessThanOrEqualTo(String value) {
            addCriterion("syllabuspath <=", value, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathLike(String value) {
            addCriterion("syllabuspath like", value, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathNotLike(String value) {
            addCriterion("syllabuspath not like", value, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathIn(List<String> values) {
            addCriterion("syllabuspath in", values, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathNotIn(List<String> values) {
            addCriterion("syllabuspath not in", values, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathBetween(String value1, String value2) {
            addCriterion("syllabuspath between", value1, value2, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andSyllabuspathNotBetween(String value1, String value2) {
            addCriterion("syllabuspath not between", value1, value2, "syllabuspath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathIsNull() {
            addCriterion("teachingplanpath is null");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathIsNotNull() {
            addCriterion("teachingplanpath is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathEqualTo(String value) {
            addCriterion("teachingplanpath =", value, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathNotEqualTo(String value) {
            addCriterion("teachingplanpath <>", value, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathGreaterThan(String value) {
            addCriterion("teachingplanpath >", value, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathGreaterThanOrEqualTo(String value) {
            addCriterion("teachingplanpath >=", value, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathLessThan(String value) {
            addCriterion("teachingplanpath <", value, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathLessThanOrEqualTo(String value) {
            addCriterion("teachingplanpath <=", value, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathLike(String value) {
            addCriterion("teachingplanpath like", value, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathNotLike(String value) {
            addCriterion("teachingplanpath not like", value, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathIn(List<String> values) {
            addCriterion("teachingplanpath in", values, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathNotIn(List<String> values) {
            addCriterion("teachingplanpath not in", values, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathBetween(String value1, String value2) {
            addCriterion("teachingplanpath between", value1, value2, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andTeachingplanpathNotBetween(String value1, String value2) {
            addCriterion("teachingplanpath not between", value1, value2, "teachingplanpath");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}