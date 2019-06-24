package schooloa.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestManageExample() {
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

        public Criteria andClassnameIsNull() {
            addCriterion("classname is null");
            return (Criteria) this;
        }

        public Criteria andClassnameIsNotNull() {
            addCriterion("classname is not null");
            return (Criteria) this;
        }

        public Criteria andClassnameEqualTo(String value) {
            addCriterion("classname =", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotEqualTo(String value) {
            addCriterion("classname <>", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThan(String value) {
            addCriterion("classname >", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("classname >=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThan(String value) {
            addCriterion("classname <", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLessThanOrEqualTo(String value) {
            addCriterion("classname <=", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameLike(String value) {
            addCriterion("classname like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotLike(String value) {
            addCriterion("classname not like", value, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameIn(List<String> values) {
            addCriterion("classname in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotIn(List<String> values) {
            addCriterion("classname not in", values, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameBetween(String value1, String value2) {
            addCriterion("classname between", value1, value2, "classname");
            return (Criteria) this;
        }

        public Criteria andClassnameNotBetween(String value1, String value2) {
            addCriterion("classname not between", value1, value2, "classname");
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

        public Criteria andTestpaperpathIsNull() {
            addCriterion("testpaperpath is null");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathIsNotNull() {
            addCriterion("testpaperpath is not null");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathEqualTo(String value) {
            addCriterion("testpaperpath =", value, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathNotEqualTo(String value) {
            addCriterion("testpaperpath <>", value, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathGreaterThan(String value) {
            addCriterion("testpaperpath >", value, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathGreaterThanOrEqualTo(String value) {
            addCriterion("testpaperpath >=", value, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathLessThan(String value) {
            addCriterion("testpaperpath <", value, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathLessThanOrEqualTo(String value) {
            addCriterion("testpaperpath <=", value, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathLike(String value) {
            addCriterion("testpaperpath like", value, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathNotLike(String value) {
            addCriterion("testpaperpath not like", value, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathIn(List<String> values) {
            addCriterion("testpaperpath in", values, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathNotIn(List<String> values) {
            addCriterion("testpaperpath not in", values, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathBetween(String value1, String value2) {
            addCriterion("testpaperpath between", value1, value2, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestpaperpathNotBetween(String value1, String value2) {
            addCriterion("testpaperpath not between", value1, value2, "testpaperpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathIsNull() {
            addCriterion("testanswerpath is null");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathIsNotNull() {
            addCriterion("testanswerpath is not null");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathEqualTo(String value) {
            addCriterion("testanswerpath =", value, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathNotEqualTo(String value) {
            addCriterion("testanswerpath <>", value, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathGreaterThan(String value) {
            addCriterion("testanswerpath >", value, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathGreaterThanOrEqualTo(String value) {
            addCriterion("testanswerpath >=", value, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathLessThan(String value) {
            addCriterion("testanswerpath <", value, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathLessThanOrEqualTo(String value) {
            addCriterion("testanswerpath <=", value, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathLike(String value) {
            addCriterion("testanswerpath like", value, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathNotLike(String value) {
            addCriterion("testanswerpath not like", value, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathIn(List<String> values) {
            addCriterion("testanswerpath in", values, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathNotIn(List<String> values) {
            addCriterion("testanswerpath not in", values, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathBetween(String value1, String value2) {
            addCriterion("testanswerpath between", value1, value2, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andTestanswerpathNotBetween(String value1, String value2) {
            addCriterion("testanswerpath not between", value1, value2, "testanswerpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathIsNull() {
            addCriterion("computertestpath is null");
            return (Criteria) this;
        }

        public Criteria andComputertestpathIsNotNull() {
            addCriterion("computertestpath is not null");
            return (Criteria) this;
        }

        public Criteria andComputertestpathEqualTo(String value) {
            addCriterion("computertestpath =", value, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathNotEqualTo(String value) {
            addCriterion("computertestpath <>", value, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathGreaterThan(String value) {
            addCriterion("computertestpath >", value, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathGreaterThanOrEqualTo(String value) {
            addCriterion("computertestpath >=", value, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathLessThan(String value) {
            addCriterion("computertestpath <", value, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathLessThanOrEqualTo(String value) {
            addCriterion("computertestpath <=", value, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathLike(String value) {
            addCriterion("computertestpath like", value, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathNotLike(String value) {
            addCriterion("computertestpath not like", value, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathIn(List<String> values) {
            addCriterion("computertestpath in", values, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathNotIn(List<String> values) {
            addCriterion("computertestpath not in", values, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathBetween(String value1, String value2) {
            addCriterion("computertestpath between", value1, value2, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andComputertestpathNotBetween(String value1, String value2) {
            addCriterion("computertestpath not between", value1, value2, "computertestpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathIsNull() {
            addCriterion("transcriptpath is null");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathIsNotNull() {
            addCriterion("transcriptpath is not null");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathEqualTo(String value) {
            addCriterion("transcriptpath =", value, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathNotEqualTo(String value) {
            addCriterion("transcriptpath <>", value, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathGreaterThan(String value) {
            addCriterion("transcriptpath >", value, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathGreaterThanOrEqualTo(String value) {
            addCriterion("transcriptpath >=", value, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathLessThan(String value) {
            addCriterion("transcriptpath <", value, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathLessThanOrEqualTo(String value) {
            addCriterion("transcriptpath <=", value, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathLike(String value) {
            addCriterion("transcriptpath like", value, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathNotLike(String value) {
            addCriterion("transcriptpath not like", value, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathIn(List<String> values) {
            addCriterion("transcriptpath in", values, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathNotIn(List<String> values) {
            addCriterion("transcriptpath not in", values, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathBetween(String value1, String value2) {
            addCriterion("transcriptpath between", value1, value2, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andTranscriptpathNotBetween(String value1, String value2) {
            addCriterion("transcriptpath not between", value1, value2, "transcriptpath");
            return (Criteria) this;
        }

        public Criteria andPosttimeIsNull() {
            addCriterion("posttime is null");
            return (Criteria) this;
        }

        public Criteria andPosttimeIsNotNull() {
            addCriterion("posttime is not null");
            return (Criteria) this;
        }

        public Criteria andPosttimeEqualTo(Date value) {
            addCriterion("posttime =", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotEqualTo(Date value) {
            addCriterion("posttime <>", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeGreaterThan(Date value) {
            addCriterion("posttime >", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("posttime >=", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeLessThan(Date value) {
            addCriterion("posttime <", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeLessThanOrEqualTo(Date value) {
            addCriterion("posttime <=", value, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeIn(List<Date> values) {
            addCriterion("posttime in", values, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotIn(List<Date> values) {
            addCriterion("posttime not in", values, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeBetween(Date value1, Date value2) {
            addCriterion("posttime between", value1, value2, "posttime");
            return (Criteria) this;
        }

        public Criteria andPosttimeNotBetween(Date value1, Date value2) {
            addCriterion("posttime not between", value1, value2, "posttime");
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