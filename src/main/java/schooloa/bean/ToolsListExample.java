package schooloa.bean;

import java.util.ArrayList;
import java.util.List;

public class ToolsListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ToolsListExample() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andSemesterIsNull() {
            addCriterion("semester is null");
            return (Criteria) this;
        }

        public Criteria andSemesterIsNotNull() {
            addCriterion("semester is not null");
            return (Criteria) this;
        }

        public Criteria andSemesterEqualTo(String value) {
            addCriterion("semester =", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotEqualTo(String value) {
            addCriterion("semester <>", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThan(String value) {
            addCriterion("semester >", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterGreaterThanOrEqualTo(String value) {
            addCriterion("semester >=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThan(String value) {
            addCriterion("semester <", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLessThanOrEqualTo(String value) {
            addCriterion("semester <=", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterLike(String value) {
            addCriterion("semester like", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotLike(String value) {
            addCriterion("semester not like", value, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterIn(List<String> values) {
            addCriterion("semester in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotIn(List<String> values) {
            addCriterion("semester not in", values, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterBetween(String value1, String value2) {
            addCriterion("semester between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andSemesterNotBetween(String value1, String value2) {
            addCriterion("semester not between", value1, value2, "semester");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNull() {
            addCriterion("teachername is null");
            return (Criteria) this;
        }

        public Criteria andTeachernameIsNotNull() {
            addCriterion("teachername is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernameEqualTo(String value) {
            addCriterion("teachername =", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotEqualTo(String value) {
            addCriterion("teachername <>", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThan(String value) {
            addCriterion("teachername >", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameGreaterThanOrEqualTo(String value) {
            addCriterion("teachername >=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThan(String value) {
            addCriterion("teachername <", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLessThanOrEqualTo(String value) {
            addCriterion("teachername <=", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameLike(String value) {
            addCriterion("teachername like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotLike(String value) {
            addCriterion("teachername not like", value, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameIn(List<String> values) {
            addCriterion("teachername in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotIn(List<String> values) {
            addCriterion("teachername not in", values, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameBetween(String value1, String value2) {
            addCriterion("teachername between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andTeachernameNotBetween(String value1, String value2) {
            addCriterion("teachername not between", value1, value2, "teachername");
            return (Criteria) this;
        }

        public Criteria andLyzbIsNull() {
            addCriterion("lyzb is null");
            return (Criteria) this;
        }

        public Criteria andLyzbIsNotNull() {
            addCriterion("lyzb is not null");
            return (Criteria) this;
        }

        public Criteria andLyzbEqualTo(String value) {
            addCriterion("lyzb =", value, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbNotEqualTo(String value) {
            addCriterion("lyzb <>", value, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbGreaterThan(String value) {
            addCriterion("lyzb >", value, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbGreaterThanOrEqualTo(String value) {
            addCriterion("lyzb >=", value, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbLessThan(String value) {
            addCriterion("lyzb <", value, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbLessThanOrEqualTo(String value) {
            addCriterion("lyzb <=", value, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbLike(String value) {
            addCriterion("lyzb like", value, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbNotLike(String value) {
            addCriterion("lyzb not like", value, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbIn(List<String> values) {
            addCriterion("lyzb in", values, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbNotIn(List<String> values) {
            addCriterion("lyzb not in", values, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbBetween(String value1, String value2) {
            addCriterion("lyzb between", value1, value2, "lyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbNotBetween(String value1, String value2) {
            addCriterion("lyzb not between", value1, value2, "lyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbIsNull() {
            addCriterion("hyzb is null");
            return (Criteria) this;
        }

        public Criteria andHyzbIsNotNull() {
            addCriterion("hyzb is not null");
            return (Criteria) this;
        }

        public Criteria andHyzbEqualTo(String value) {
            addCriterion("hyzb =", value, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbNotEqualTo(String value) {
            addCriterion("hyzb <>", value, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbGreaterThan(String value) {
            addCriterion("hyzb >", value, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbGreaterThanOrEqualTo(String value) {
            addCriterion("hyzb >=", value, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbLessThan(String value) {
            addCriterion("hyzb <", value, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbLessThanOrEqualTo(String value) {
            addCriterion("hyzb <=", value, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbLike(String value) {
            addCriterion("hyzb like", value, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbNotLike(String value) {
            addCriterion("hyzb not like", value, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbIn(List<String> values) {
            addCriterion("hyzb in", values, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbNotIn(List<String> values) {
            addCriterion("hyzb not in", values, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbBetween(String value1, String value2) {
            addCriterion("hyzb between", value1, value2, "hyzb");
            return (Criteria) this;
        }

        public Criteria andHyzbNotBetween(String value1, String value2) {
            addCriterion("hyzb not between", value1, value2, "hyzb");
            return (Criteria) this;
        }

        public Criteria andLyzbxIsNull() {
            addCriterion("lyzbx is null");
            return (Criteria) this;
        }

        public Criteria andLyzbxIsNotNull() {
            addCriterion("lyzbx is not null");
            return (Criteria) this;
        }

        public Criteria andLyzbxEqualTo(String value) {
            addCriterion("lyzbx =", value, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxNotEqualTo(String value) {
            addCriterion("lyzbx <>", value, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxGreaterThan(String value) {
            addCriterion("lyzbx >", value, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxGreaterThanOrEqualTo(String value) {
            addCriterion("lyzbx >=", value, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxLessThan(String value) {
            addCriterion("lyzbx <", value, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxLessThanOrEqualTo(String value) {
            addCriterion("lyzbx <=", value, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxLike(String value) {
            addCriterion("lyzbx like", value, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxNotLike(String value) {
            addCriterion("lyzbx not like", value, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxIn(List<String> values) {
            addCriterion("lyzbx in", values, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxNotIn(List<String> values) {
            addCriterion("lyzbx not in", values, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxBetween(String value1, String value2) {
            addCriterion("lyzbx between", value1, value2, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andLyzbxNotBetween(String value1, String value2) {
            addCriterion("lyzbx not between", value1, value2, "lyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxIsNull() {
            addCriterion("hyzbx is null");
            return (Criteria) this;
        }

        public Criteria andHyzbxIsNotNull() {
            addCriterion("hyzbx is not null");
            return (Criteria) this;
        }

        public Criteria andHyzbxEqualTo(String value) {
            addCriterion("hyzbx =", value, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxNotEqualTo(String value) {
            addCriterion("hyzbx <>", value, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxGreaterThan(String value) {
            addCriterion("hyzbx >", value, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxGreaterThanOrEqualTo(String value) {
            addCriterion("hyzbx >=", value, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxLessThan(String value) {
            addCriterion("hyzbx <", value, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxLessThanOrEqualTo(String value) {
            addCriterion("hyzbx <=", value, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxLike(String value) {
            addCriterion("hyzbx like", value, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxNotLike(String value) {
            addCriterion("hyzbx not like", value, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxIn(List<String> values) {
            addCriterion("hyzbx in", values, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxNotIn(List<String> values) {
            addCriterion("hyzbx not in", values, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxBetween(String value1, String value2) {
            addCriterion("hyzbx between", value1, value2, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andHyzbxNotBetween(String value1, String value2) {
            addCriterion("hyzbx not between", value1, value2, "hyzbx");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhIsNull() {
            addCriterion("cgfivezxbh is null");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhIsNotNull() {
            addCriterion("cgfivezxbh is not null");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhEqualTo(String value) {
            addCriterion("cgfivezxbh =", value, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhNotEqualTo(String value) {
            addCriterion("cgfivezxbh <>", value, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhGreaterThan(String value) {
            addCriterion("cgfivezxbh >", value, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhGreaterThanOrEqualTo(String value) {
            addCriterion("cgfivezxbh >=", value, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhLessThan(String value) {
            addCriterion("cgfivezxbh <", value, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhLessThanOrEqualTo(String value) {
            addCriterion("cgfivezxbh <=", value, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhLike(String value) {
            addCriterion("cgfivezxbh like", value, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhNotLike(String value) {
            addCriterion("cgfivezxbh not like", value, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhIn(List<String> values) {
            addCriterion("cgfivezxbh in", values, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhNotIn(List<String> values) {
            addCriterion("cgfivezxbh not in", values, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhBetween(String value1, String value2) {
            addCriterion("cgfivezxbh between", value1, value2, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhNotBetween(String value1, String value2) {
            addCriterion("cgfivezxbh not between", value1, value2, "cgfivezxbh");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongIsNull() {
            addCriterion("cgfivezxbhong is null");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongIsNotNull() {
            addCriterion("cgfivezxbhong is not null");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongEqualTo(String value) {
            addCriterion("cgfivezxbhong =", value, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongNotEqualTo(String value) {
            addCriterion("cgfivezxbhong <>", value, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongGreaterThan(String value) {
            addCriterion("cgfivezxbhong >", value, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongGreaterThanOrEqualTo(String value) {
            addCriterion("cgfivezxbhong >=", value, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongLessThan(String value) {
            addCriterion("cgfivezxbhong <", value, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongLessThanOrEqualTo(String value) {
            addCriterion("cgfivezxbhong <=", value, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongLike(String value) {
            addCriterion("cgfivezxbhong like", value, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongNotLike(String value) {
            addCriterion("cgfivezxbhong not like", value, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongIn(List<String> values) {
            addCriterion("cgfivezxbhong in", values, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongNotIn(List<String> values) {
            addCriterion("cgfivezxbhong not in", values, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongBetween(String value1, String value2) {
            addCriterion("cgfivezxbhong between", value1, value2, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgfivezxbhongNotBetween(String value1, String value2) {
            addCriterion("cgfivezxbhong not between", value1, value2, "cgfivezxbhong");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbIsNull() {
            addCriterion("cgsevenzxb is null");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbIsNotNull() {
            addCriterion("cgsevenzxb is not null");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbEqualTo(String value) {
            addCriterion("cgsevenzxb =", value, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbNotEqualTo(String value) {
            addCriterion("cgsevenzxb <>", value, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbGreaterThan(String value) {
            addCriterion("cgsevenzxb >", value, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbGreaterThanOrEqualTo(String value) {
            addCriterion("cgsevenzxb >=", value, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbLessThan(String value) {
            addCriterion("cgsevenzxb <", value, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbLessThanOrEqualTo(String value) {
            addCriterion("cgsevenzxb <=", value, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbLike(String value) {
            addCriterion("cgsevenzxb like", value, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbNotLike(String value) {
            addCriterion("cgsevenzxb not like", value, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbIn(List<String> values) {
            addCriterion("cgsevenzxb in", values, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbNotIn(List<String> values) {
            addCriterion("cgsevenzxb not in", values, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbBetween(String value1, String value2) {
            addCriterion("cgsevenzxb between", value1, value2, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgsevenzxbNotBetween(String value1, String value2) {
            addCriterion("cgsevenzxb not between", value1, value2, "cgsevenzxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbIsNull() {
            addCriterion("cgonezxb is null");
            return (Criteria) this;
        }

        public Criteria andCgonezxbIsNotNull() {
            addCriterion("cgonezxb is not null");
            return (Criteria) this;
        }

        public Criteria andCgonezxbEqualTo(String value) {
            addCriterion("cgonezxb =", value, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbNotEqualTo(String value) {
            addCriterion("cgonezxb <>", value, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbGreaterThan(String value) {
            addCriterion("cgonezxb >", value, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbGreaterThanOrEqualTo(String value) {
            addCriterion("cgonezxb >=", value, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbLessThan(String value) {
            addCriterion("cgonezxb <", value, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbLessThanOrEqualTo(String value) {
            addCriterion("cgonezxb <=", value, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbLike(String value) {
            addCriterion("cgonezxb like", value, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbNotLike(String value) {
            addCriterion("cgonezxb not like", value, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbIn(List<String> values) {
            addCriterion("cgonezxb in", values, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbNotIn(List<String> values) {
            addCriterion("cgonezxb not in", values, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbBetween(String value1, String value2) {
            addCriterion("cgonezxb between", value1, value2, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andCgonezxbNotBetween(String value1, String value2) {
            addCriterion("cgonezxb not between", value1, value2, "cgonezxb");
            return (Criteria) this;
        }

        public Criteria andHlqbIsNull() {
            addCriterion("hlqb is null");
            return (Criteria) this;
        }

        public Criteria andHlqbIsNotNull() {
            addCriterion("hlqb is not null");
            return (Criteria) this;
        }

        public Criteria andHlqbEqualTo(String value) {
            addCriterion("hlqb =", value, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbNotEqualTo(String value) {
            addCriterion("hlqb <>", value, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbGreaterThan(String value) {
            addCriterion("hlqb >", value, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbGreaterThanOrEqualTo(String value) {
            addCriterion("hlqb >=", value, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbLessThan(String value) {
            addCriterion("hlqb <", value, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbLessThanOrEqualTo(String value) {
            addCriterion("hlqb <=", value, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbLike(String value) {
            addCriterion("hlqb like", value, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbNotLike(String value) {
            addCriterion("hlqb not like", value, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbIn(List<String> values) {
            addCriterion("hlqb in", values, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbNotIn(List<String> values) {
            addCriterion("hlqb not in", values, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbBetween(String value1, String value2) {
            addCriterion("hlqb between", value1, value2, "hlqb");
            return (Criteria) this;
        }

        public Criteria andHlqbNotBetween(String value1, String value2) {
            addCriterion("hlqb not between", value1, value2, "hlqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbIsNull() {
            addCriterion("twobqb is null");
            return (Criteria) this;
        }

        public Criteria andTwobqbIsNotNull() {
            addCriterion("twobqb is not null");
            return (Criteria) this;
        }

        public Criteria andTwobqbEqualTo(String value) {
            addCriterion("twobqb =", value, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbNotEqualTo(String value) {
            addCriterion("twobqb <>", value, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbGreaterThan(String value) {
            addCriterion("twobqb >", value, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbGreaterThanOrEqualTo(String value) {
            addCriterion("twobqb >=", value, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbLessThan(String value) {
            addCriterion("twobqb <", value, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbLessThanOrEqualTo(String value) {
            addCriterion("twobqb <=", value, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbLike(String value) {
            addCriterion("twobqb like", value, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbNotLike(String value) {
            addCriterion("twobqb not like", value, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbIn(List<String> values) {
            addCriterion("twobqb in", values, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbNotIn(List<String> values) {
            addCriterion("twobqb not in", values, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbBetween(String value1, String value2) {
            addCriterion("twobqb between", value1, value2, "twobqb");
            return (Criteria) this;
        }

        public Criteria andTwobqbNotBetween(String value1, String value2) {
            addCriterion("twobqb not between", value1, value2, "twobqb");
            return (Criteria) this;
        }

        public Criteria andCsqbIsNull() {
            addCriterion("csqb is null");
            return (Criteria) this;
        }

        public Criteria andCsqbIsNotNull() {
            addCriterion("csqb is not null");
            return (Criteria) this;
        }

        public Criteria andCsqbEqualTo(String value) {
            addCriterion("csqb =", value, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbNotEqualTo(String value) {
            addCriterion("csqb <>", value, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbGreaterThan(String value) {
            addCriterion("csqb >", value, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbGreaterThanOrEqualTo(String value) {
            addCriterion("csqb >=", value, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbLessThan(String value) {
            addCriterion("csqb <", value, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbLessThanOrEqualTo(String value) {
            addCriterion("csqb <=", value, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbLike(String value) {
            addCriterion("csqb like", value, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbNotLike(String value) {
            addCriterion("csqb not like", value, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbIn(List<String> values) {
            addCriterion("csqb in", values, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbNotIn(List<String> values) {
            addCriterion("csqb not in", values, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbBetween(String value1, String value2) {
            addCriterion("csqb between", value1, value2, "csqb");
            return (Criteria) this;
        }

        public Criteria andCsqbNotBetween(String value1, String value2) {
            addCriterion("csqb not between", value1, value2, "csqb");
            return (Criteria) this;
        }

        public Criteria andBaibanbiIsNull() {
            addCriterion("baibanbi is null");
            return (Criteria) this;
        }

        public Criteria andBaibanbiIsNotNull() {
            addCriterion("baibanbi is not null");
            return (Criteria) this;
        }

        public Criteria andBaibanbiEqualTo(String value) {
            addCriterion("baibanbi =", value, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiNotEqualTo(String value) {
            addCriterion("baibanbi <>", value, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiGreaterThan(String value) {
            addCriterion("baibanbi >", value, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiGreaterThanOrEqualTo(String value) {
            addCriterion("baibanbi >=", value, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiLessThan(String value) {
            addCriterion("baibanbi <", value, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiLessThanOrEqualTo(String value) {
            addCriterion("baibanbi <=", value, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiLike(String value) {
            addCriterion("baibanbi like", value, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiNotLike(String value) {
            addCriterion("baibanbi not like", value, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiIn(List<String> values) {
            addCriterion("baibanbi in", values, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiNotIn(List<String> values) {
            addCriterion("baibanbi not in", values, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiBetween(String value1, String value2) {
            addCriterion("baibanbi between", value1, value2, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiNotBetween(String value1, String value2) {
            addCriterion("baibanbi not between", value1, value2, "baibanbi");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouIsNull() {
            addCriterion("baibanbiyou is null");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouIsNotNull() {
            addCriterion("baibanbiyou is not null");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouEqualTo(String value) {
            addCriterion("baibanbiyou =", value, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouNotEqualTo(String value) {
            addCriterion("baibanbiyou <>", value, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouGreaterThan(String value) {
            addCriterion("baibanbiyou >", value, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouGreaterThanOrEqualTo(String value) {
            addCriterion("baibanbiyou >=", value, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouLessThan(String value) {
            addCriterion("baibanbiyou <", value, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouLessThanOrEqualTo(String value) {
            addCriterion("baibanbiyou <=", value, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouLike(String value) {
            addCriterion("baibanbiyou like", value, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouNotLike(String value) {
            addCriterion("baibanbiyou not like", value, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouIn(List<String> values) {
            addCriterion("baibanbiyou in", values, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouNotIn(List<String> values) {
            addCriterion("baibanbiyou not in", values, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouBetween(String value1, String value2) {
            addCriterion("baibanbiyou between", value1, value2, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andBaibanbiyouNotBetween(String value1, String value2) {
            addCriterion("baibanbiyou not between", value1, value2, "baibanbiyou");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiIsNull() {
            addCriterion("chengguangwuzhongxingbixinhei is null");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiIsNotNull() {
            addCriterion("chengguangwuzhongxingbixinhei is not null");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiEqualTo(String value) {
            addCriterion("chengguangwuzhongxingbixinhei =", value, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiNotEqualTo(String value) {
            addCriterion("chengguangwuzhongxingbixinhei <>", value, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiGreaterThan(String value) {
            addCriterion("chengguangwuzhongxingbixinhei >", value, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiGreaterThanOrEqualTo(String value) {
            addCriterion("chengguangwuzhongxingbixinhei >=", value, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiLessThan(String value) {
            addCriterion("chengguangwuzhongxingbixinhei <", value, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiLessThanOrEqualTo(String value) {
            addCriterion("chengguangwuzhongxingbixinhei <=", value, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiLike(String value) {
            addCriterion("chengguangwuzhongxingbixinhei like", value, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiNotLike(String value) {
            addCriterion("chengguangwuzhongxingbixinhei not like", value, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiIn(List<String> values) {
            addCriterion("chengguangwuzhongxingbixinhei in", values, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiNotIn(List<String> values) {
            addCriterion("chengguangwuzhongxingbixinhei not in", values, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiBetween(String value1, String value2) {
            addCriterion("chengguangwuzhongxingbixinhei between", value1, value2, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinheiNotBetween(String value1, String value2) {
            addCriterion("chengguangwuzhongxingbixinhei not between", value1, value2, "chengguangwuzhongxingbixinhei");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongIsNull() {
            addCriterion("chengguangwuzhongxingbixinhong is null");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongIsNotNull() {
            addCriterion("chengguangwuzhongxingbixinhong is not null");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongEqualTo(String value) {
            addCriterion("chengguangwuzhongxingbixinhong =", value, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongNotEqualTo(String value) {
            addCriterion("chengguangwuzhongxingbixinhong <>", value, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongGreaterThan(String value) {
            addCriterion("chengguangwuzhongxingbixinhong >", value, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongGreaterThanOrEqualTo(String value) {
            addCriterion("chengguangwuzhongxingbixinhong >=", value, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongLessThan(String value) {
            addCriterion("chengguangwuzhongxingbixinhong <", value, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongLessThanOrEqualTo(String value) {
            addCriterion("chengguangwuzhongxingbixinhong <=", value, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongLike(String value) {
            addCriterion("chengguangwuzhongxingbixinhong like", value, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongNotLike(String value) {
            addCriterion("chengguangwuzhongxingbixinhong not like", value, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongIn(List<String> values) {
            addCriterion("chengguangwuzhongxingbixinhong in", values, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongNotIn(List<String> values) {
            addCriterion("chengguangwuzhongxingbixinhong not in", values, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongBetween(String value1, String value2) {
            addCriterion("chengguangwuzhongxingbixinhong between", value1, value2, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChengguangwuzhongxingbixinhongNotBetween(String value1, String value2) {
            addCriterion("chengguangwuzhongxingbixinhong not between", value1, value2, "chengguangwuzhongxingbixinhong");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinIsNull() {
            addCriterion("chenguangqizhongxingbixin is null");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinIsNotNull() {
            addCriterion("chenguangqizhongxingbixin is not null");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinEqualTo(String value) {
            addCriterion("chenguangqizhongxingbixin =", value, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinNotEqualTo(String value) {
            addCriterion("chenguangqizhongxingbixin <>", value, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinGreaterThan(String value) {
            addCriterion("chenguangqizhongxingbixin >", value, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinGreaterThanOrEqualTo(String value) {
            addCriterion("chenguangqizhongxingbixin >=", value, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinLessThan(String value) {
            addCriterion("chenguangqizhongxingbixin <", value, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinLessThanOrEqualTo(String value) {
            addCriterion("chenguangqizhongxingbixin <=", value, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinLike(String value) {
            addCriterion("chenguangqizhongxingbixin like", value, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinNotLike(String value) {
            addCriterion("chenguangqizhongxingbixin not like", value, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinIn(List<String> values) {
            addCriterion("chenguangqizhongxingbixin in", values, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinNotIn(List<String> values) {
            addCriterion("chenguangqizhongxingbixin not in", values, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinBetween(String value1, String value2) {
            addCriterion("chenguangqizhongxingbixin between", value1, value2, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangqizhongxingbixinNotBetween(String value1, String value2) {
            addCriterion("chenguangqizhongxingbixin not between", value1, value2, "chenguangqizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinIsNull() {
            addCriterion("chenguangyizhongxingbixin is null");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinIsNotNull() {
            addCriterion("chenguangyizhongxingbixin is not null");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinEqualTo(String value) {
            addCriterion("chenguangyizhongxingbixin =", value, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinNotEqualTo(String value) {
            addCriterion("chenguangyizhongxingbixin <>", value, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinGreaterThan(String value) {
            addCriterion("chenguangyizhongxingbixin >", value, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinGreaterThanOrEqualTo(String value) {
            addCriterion("chenguangyizhongxingbixin >=", value, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinLessThan(String value) {
            addCriterion("chenguangyizhongxingbixin <", value, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinLessThanOrEqualTo(String value) {
            addCriterion("chenguangyizhongxingbixin <=", value, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinLike(String value) {
            addCriterion("chenguangyizhongxingbixin like", value, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinNotLike(String value) {
            addCriterion("chenguangyizhongxingbixin not like", value, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinIn(List<String> values) {
            addCriterion("chenguangyizhongxingbixin in", values, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinNotIn(List<String> values) {
            addCriterion("chenguangyizhongxingbixin not in", values, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinBetween(String value1, String value2) {
            addCriterion("chenguangyizhongxingbixin between", value1, value2, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andChenguangyizhongxingbixinNotBetween(String value1, String value2) {
            addCriterion("chenguangyizhongxingbixin not between", value1, value2, "chenguangyizhongxingbixin");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiIsNull() {
            addCriterion("youxingjihaobi is null");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiIsNotNull() {
            addCriterion("youxingjihaobi is not null");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiEqualTo(String value) {
            addCriterion("youxingjihaobi =", value, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiNotEqualTo(String value) {
            addCriterion("youxingjihaobi <>", value, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiGreaterThan(String value) {
            addCriterion("youxingjihaobi >", value, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiGreaterThanOrEqualTo(String value) {
            addCriterion("youxingjihaobi >=", value, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiLessThan(String value) {
            addCriterion("youxingjihaobi <", value, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiLessThanOrEqualTo(String value) {
            addCriterion("youxingjihaobi <=", value, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiLike(String value) {
            addCriterion("youxingjihaobi like", value, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiNotLike(String value) {
            addCriterion("youxingjihaobi not like", value, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiIn(List<String> values) {
            addCriterion("youxingjihaobi in", values, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiNotIn(List<String> values) {
            addCriterion("youxingjihaobi not in", values, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiBetween(String value1, String value2) {
            addCriterion("youxingjihaobi between", value1, value2, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andYouxingjihaobiNotBetween(String value1, String value2) {
            addCriterion("youxingjihaobi not between", value1, value2, "youxingjihaobi");
            return (Criteria) this;
        }

        public Criteria andDaxinfaIsNull() {
            addCriterion("daxinfa is null");
            return (Criteria) this;
        }

        public Criteria andDaxinfaIsNotNull() {
            addCriterion("daxinfa is not null");
            return (Criteria) this;
        }

        public Criteria andDaxinfaEqualTo(String value) {
            addCriterion("daxinfa =", value, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaNotEqualTo(String value) {
            addCriterion("daxinfa <>", value, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaGreaterThan(String value) {
            addCriterion("daxinfa >", value, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaGreaterThanOrEqualTo(String value) {
            addCriterion("daxinfa >=", value, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaLessThan(String value) {
            addCriterion("daxinfa <", value, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaLessThanOrEqualTo(String value) {
            addCriterion("daxinfa <=", value, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaLike(String value) {
            addCriterion("daxinfa like", value, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaNotLike(String value) {
            addCriterion("daxinfa not like", value, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaIn(List<String> values) {
            addCriterion("daxinfa in", values, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaNotIn(List<String> values) {
            addCriterion("daxinfa not in", values, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaBetween(String value1, String value2) {
            addCriterion("daxinfa between", value1, value2, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andDaxinfaNotBetween(String value1, String value2) {
            addCriterion("daxinfa not between", value1, value2, "daxinfa");
            return (Criteria) this;
        }

        public Criteria andGaozhiIsNull() {
            addCriterion("gaozhi is null");
            return (Criteria) this;
        }

        public Criteria andGaozhiIsNotNull() {
            addCriterion("gaozhi is not null");
            return (Criteria) this;
        }

        public Criteria andGaozhiEqualTo(String value) {
            addCriterion("gaozhi =", value, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiNotEqualTo(String value) {
            addCriterion("gaozhi <>", value, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiGreaterThan(String value) {
            addCriterion("gaozhi >", value, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiGreaterThanOrEqualTo(String value) {
            addCriterion("gaozhi >=", value, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiLessThan(String value) {
            addCriterion("gaozhi <", value, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiLessThanOrEqualTo(String value) {
            addCriterion("gaozhi <=", value, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiLike(String value) {
            addCriterion("gaozhi like", value, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiNotLike(String value) {
            addCriterion("gaozhi not like", value, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiIn(List<String> values) {
            addCriterion("gaozhi in", values, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiNotIn(List<String> values) {
            addCriterion("gaozhi not in", values, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiBetween(String value1, String value2) {
            addCriterion("gaozhi between", value1, value2, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andGaozhiNotBetween(String value1, String value2) {
            addCriterion("gaozhi not between", value1, value2, "gaozhi");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiIsNull() {
            addCriterion("niupizhidangandai is null");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiIsNotNull() {
            addCriterion("niupizhidangandai is not null");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiEqualTo(String value) {
            addCriterion("niupizhidangandai =", value, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiNotEqualTo(String value) {
            addCriterion("niupizhidangandai <>", value, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiGreaterThan(String value) {
            addCriterion("niupizhidangandai >", value, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiGreaterThanOrEqualTo(String value) {
            addCriterion("niupizhidangandai >=", value, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiLessThan(String value) {
            addCriterion("niupizhidangandai <", value, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiLessThanOrEqualTo(String value) {
            addCriterion("niupizhidangandai <=", value, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiLike(String value) {
            addCriterion("niupizhidangandai like", value, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiNotLike(String value) {
            addCriterion("niupizhidangandai not like", value, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiIn(List<String> values) {
            addCriterion("niupizhidangandai in", values, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiNotIn(List<String> values) {
            addCriterion("niupizhidangandai not in", values, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiBetween(String value1, String value2) {
            addCriterion("niupizhidangandai between", value1, value2, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andNiupizhidangandaiNotBetween(String value1, String value2) {
            addCriterion("niupizhidangandai not between", value1, value2, "niupizhidangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiIsNull() {
            addCriterion("suliaodangandai is null");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiIsNotNull() {
            addCriterion("suliaodangandai is not null");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiEqualTo(String value) {
            addCriterion("suliaodangandai =", value, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiNotEqualTo(String value) {
            addCriterion("suliaodangandai <>", value, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiGreaterThan(String value) {
            addCriterion("suliaodangandai >", value, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiGreaterThanOrEqualTo(String value) {
            addCriterion("suliaodangandai >=", value, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiLessThan(String value) {
            addCriterion("suliaodangandai <", value, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiLessThanOrEqualTo(String value) {
            addCriterion("suliaodangandai <=", value, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiLike(String value) {
            addCriterion("suliaodangandai like", value, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiNotLike(String value) {
            addCriterion("suliaodangandai not like", value, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiIn(List<String> values) {
            addCriterion("suliaodangandai in", values, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiNotIn(List<String> values) {
            addCriterion("suliaodangandai not in", values, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiBetween(String value1, String value2) {
            addCriterion("suliaodangandai between", value1, value2, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andSuliaodangandaiNotBetween(String value1, String value2) {
            addCriterion("suliaodangandai not between", value1, value2, "suliaodangandai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiIsNull() {
            addCriterion("toumingzhaijiaodai is null");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiIsNotNull() {
            addCriterion("toumingzhaijiaodai is not null");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiEqualTo(String value) {
            addCriterion("toumingzhaijiaodai =", value, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiNotEqualTo(String value) {
            addCriterion("toumingzhaijiaodai <>", value, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiGreaterThan(String value) {
            addCriterion("toumingzhaijiaodai >", value, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiGreaterThanOrEqualTo(String value) {
            addCriterion("toumingzhaijiaodai >=", value, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiLessThan(String value) {
            addCriterion("toumingzhaijiaodai <", value, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiLessThanOrEqualTo(String value) {
            addCriterion("toumingzhaijiaodai <=", value, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiLike(String value) {
            addCriterion("toumingzhaijiaodai like", value, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiNotLike(String value) {
            addCriterion("toumingzhaijiaodai not like", value, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiIn(List<String> values) {
            addCriterion("toumingzhaijiaodai in", values, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiNotIn(List<String> values) {
            addCriterion("toumingzhaijiaodai not in", values, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiBetween(String value1, String value2) {
            addCriterion("toumingzhaijiaodai between", value1, value2, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingzhaijiaodaiNotBetween(String value1, String value2) {
            addCriterion("toumingzhaijiaodai not between", value1, value2, "toumingzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiIsNull() {
            addCriterion("toumingkuangjiaodai is null");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiIsNotNull() {
            addCriterion("toumingkuangjiaodai is not null");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiEqualTo(String value) {
            addCriterion("toumingkuangjiaodai =", value, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiNotEqualTo(String value) {
            addCriterion("toumingkuangjiaodai <>", value, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiGreaterThan(String value) {
            addCriterion("toumingkuangjiaodai >", value, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiGreaterThanOrEqualTo(String value) {
            addCriterion("toumingkuangjiaodai >=", value, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiLessThan(String value) {
            addCriterion("toumingkuangjiaodai <", value, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiLessThanOrEqualTo(String value) {
            addCriterion("toumingkuangjiaodai <=", value, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiLike(String value) {
            addCriterion("toumingkuangjiaodai like", value, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiNotLike(String value) {
            addCriterion("toumingkuangjiaodai not like", value, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiIn(List<String> values) {
            addCriterion("toumingkuangjiaodai in", values, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiNotIn(List<String> values) {
            addCriterion("toumingkuangjiaodai not in", values, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiBetween(String value1, String value2) {
            addCriterion("toumingkuangjiaodai between", value1, value2, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andToumingkuangjiaodaiNotBetween(String value1, String value2) {
            addCriterion("toumingkuangjiaodai not between", value1, value2, "toumingkuangjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiIsNull() {
            addCriterion("shuangmianzhaijiaodai is null");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiIsNotNull() {
            addCriterion("shuangmianzhaijiaodai is not null");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiEqualTo(String value) {
            addCriterion("shuangmianzhaijiaodai =", value, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiNotEqualTo(String value) {
            addCriterion("shuangmianzhaijiaodai <>", value, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiGreaterThan(String value) {
            addCriterion("shuangmianzhaijiaodai >", value, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiGreaterThanOrEqualTo(String value) {
            addCriterion("shuangmianzhaijiaodai >=", value, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiLessThan(String value) {
            addCriterion("shuangmianzhaijiaodai <", value, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiLessThanOrEqualTo(String value) {
            addCriterion("shuangmianzhaijiaodai <=", value, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiLike(String value) {
            addCriterion("shuangmianzhaijiaodai like", value, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiNotLike(String value) {
            addCriterion("shuangmianzhaijiaodai not like", value, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiIn(List<String> values) {
            addCriterion("shuangmianzhaijiaodai in", values, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiNotIn(List<String> values) {
            addCriterion("shuangmianzhaijiaodai not in", values, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiBetween(String value1, String value2) {
            addCriterion("shuangmianzhaijiaodai between", value1, value2, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmianzhaijiaodaiNotBetween(String value1, String value2) {
            addCriterion("shuangmianzhaijiaodai not between", value1, value2, "shuangmianzhaijiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiIsNull() {
            addCriterion("shuangmiankuanjiaodai is null");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiIsNotNull() {
            addCriterion("shuangmiankuanjiaodai is not null");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiEqualTo(String value) {
            addCriterion("shuangmiankuanjiaodai =", value, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiNotEqualTo(String value) {
            addCriterion("shuangmiankuanjiaodai <>", value, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiGreaterThan(String value) {
            addCriterion("shuangmiankuanjiaodai >", value, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiGreaterThanOrEqualTo(String value) {
            addCriterion("shuangmiankuanjiaodai >=", value, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiLessThan(String value) {
            addCriterion("shuangmiankuanjiaodai <", value, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiLessThanOrEqualTo(String value) {
            addCriterion("shuangmiankuanjiaodai <=", value, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiLike(String value) {
            addCriterion("shuangmiankuanjiaodai like", value, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiNotLike(String value) {
            addCriterion("shuangmiankuanjiaodai not like", value, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiIn(List<String> values) {
            addCriterion("shuangmiankuanjiaodai in", values, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiNotIn(List<String> values) {
            addCriterion("shuangmiankuanjiaodai not in", values, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiBetween(String value1, String value2) {
            addCriterion("shuangmiankuanjiaodai between", value1, value2, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andShuangmiankuanjiaodaiNotBetween(String value1, String value2) {
            addCriterion("shuangmiankuanjiaodai not between", value1, value2, "shuangmiankuanjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiIsNull() {
            addCriterion("paomoshuangmianjiaodai is null");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiIsNotNull() {
            addCriterion("paomoshuangmianjiaodai is not null");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiEqualTo(String value) {
            addCriterion("paomoshuangmianjiaodai =", value, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiNotEqualTo(String value) {
            addCriterion("paomoshuangmianjiaodai <>", value, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiGreaterThan(String value) {
            addCriterion("paomoshuangmianjiaodai >", value, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiGreaterThanOrEqualTo(String value) {
            addCriterion("paomoshuangmianjiaodai >=", value, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiLessThan(String value) {
            addCriterion("paomoshuangmianjiaodai <", value, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiLessThanOrEqualTo(String value) {
            addCriterion("paomoshuangmianjiaodai <=", value, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiLike(String value) {
            addCriterion("paomoshuangmianjiaodai like", value, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiNotLike(String value) {
            addCriterion("paomoshuangmianjiaodai not like", value, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiIn(List<String> values) {
            addCriterion("paomoshuangmianjiaodai in", values, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiNotIn(List<String> values) {
            addCriterion("paomoshuangmianjiaodai not in", values, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiBetween(String value1, String value2) {
            addCriterion("paomoshuangmianjiaodai between", value1, value2, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andPaomoshuangmianjiaodaiNotBetween(String value1, String value2) {
            addCriterion("paomoshuangmianjiaodai not between", value1, value2, "paomoshuangmianjiaodai");
            return (Criteria) this;
        }

        public Criteria andDahongzhiIsNull() {
            addCriterion("dahongzhi is null");
            return (Criteria) this;
        }

        public Criteria andDahongzhiIsNotNull() {
            addCriterion("dahongzhi is not null");
            return (Criteria) this;
        }

        public Criteria andDahongzhiEqualTo(String value) {
            addCriterion("dahongzhi =", value, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiNotEqualTo(String value) {
            addCriterion("dahongzhi <>", value, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiGreaterThan(String value) {
            addCriterion("dahongzhi >", value, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiGreaterThanOrEqualTo(String value) {
            addCriterion("dahongzhi >=", value, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiLessThan(String value) {
            addCriterion("dahongzhi <", value, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiLessThanOrEqualTo(String value) {
            addCriterion("dahongzhi <=", value, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiLike(String value) {
            addCriterion("dahongzhi like", value, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiNotLike(String value) {
            addCriterion("dahongzhi not like", value, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiIn(List<String> values) {
            addCriterion("dahongzhi in", values, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiNotIn(List<String> values) {
            addCriterion("dahongzhi not in", values, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiBetween(String value1, String value2) {
            addCriterion("dahongzhi between", value1, value2, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andDahongzhiNotBetween(String value1, String value2) {
            addCriterion("dahongzhi not between", value1, value2, "dahongzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiIsNull() {
            addCriterion("xuanzhi is null");
            return (Criteria) this;
        }

        public Criteria andXuanzhiIsNotNull() {
            addCriterion("xuanzhi is not null");
            return (Criteria) this;
        }

        public Criteria andXuanzhiEqualTo(String value) {
            addCriterion("xuanzhi =", value, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiNotEqualTo(String value) {
            addCriterion("xuanzhi <>", value, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiGreaterThan(String value) {
            addCriterion("xuanzhi >", value, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiGreaterThanOrEqualTo(String value) {
            addCriterion("xuanzhi >=", value, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiLessThan(String value) {
            addCriterion("xuanzhi <", value, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiLessThanOrEqualTo(String value) {
            addCriterion("xuanzhi <=", value, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiLike(String value) {
            addCriterion("xuanzhi like", value, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiNotLike(String value) {
            addCriterion("xuanzhi not like", value, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiIn(List<String> values) {
            addCriterion("xuanzhi in", values, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiNotIn(List<String> values) {
            addCriterion("xuanzhi not in", values, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiBetween(String value1, String value2) {
            addCriterion("xuanzhi between", value1, value2, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andXuanzhiNotBetween(String value1, String value2) {
            addCriterion("xuanzhi not between", value1, value2, "xuanzhi");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheIsNull() {
            addCriterion("sanwudelidanganhe is null");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheIsNotNull() {
            addCriterion("sanwudelidanganhe is not null");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheEqualTo(String value) {
            addCriterion("sanwudelidanganhe =", value, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheNotEqualTo(String value) {
            addCriterion("sanwudelidanganhe <>", value, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheGreaterThan(String value) {
            addCriterion("sanwudelidanganhe >", value, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheGreaterThanOrEqualTo(String value) {
            addCriterion("sanwudelidanganhe >=", value, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheLessThan(String value) {
            addCriterion("sanwudelidanganhe <", value, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheLessThanOrEqualTo(String value) {
            addCriterion("sanwudelidanganhe <=", value, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheLike(String value) {
            addCriterion("sanwudelidanganhe like", value, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheNotLike(String value) {
            addCriterion("sanwudelidanganhe not like", value, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheIn(List<String> values) {
            addCriterion("sanwudelidanganhe in", values, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheNotIn(List<String> values) {
            addCriterion("sanwudelidanganhe not in", values, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheBetween(String value1, String value2) {
            addCriterion("sanwudelidanganhe between", value1, value2, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andSanwudelidanganheNotBetween(String value1, String value2) {
            addCriterion("sanwudelidanganhe not between", value1, value2, "sanwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheIsNull() {
            addCriterion("wuwudelidanganhe is null");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheIsNotNull() {
            addCriterion("wuwudelidanganhe is not null");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheEqualTo(String value) {
            addCriterion("wuwudelidanganhe =", value, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheNotEqualTo(String value) {
            addCriterion("wuwudelidanganhe <>", value, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheGreaterThan(String value) {
            addCriterion("wuwudelidanganhe >", value, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheGreaterThanOrEqualTo(String value) {
            addCriterion("wuwudelidanganhe >=", value, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheLessThan(String value) {
            addCriterion("wuwudelidanganhe <", value, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheLessThanOrEqualTo(String value) {
            addCriterion("wuwudelidanganhe <=", value, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheLike(String value) {
            addCriterion("wuwudelidanganhe like", value, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheNotLike(String value) {
            addCriterion("wuwudelidanganhe not like", value, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheIn(List<String> values) {
            addCriterion("wuwudelidanganhe in", values, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheNotIn(List<String> values) {
            addCriterion("wuwudelidanganhe not in", values, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheBetween(String value1, String value2) {
            addCriterion("wuwudelidanganhe between", value1, value2, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWuwudelidanganheNotBetween(String value1, String value2) {
            addCriterion("wuwudelidanganhe not between", value1, value2, "wuwudelidanganhe");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaIsNull() {
            addCriterion("wenjianjia is null");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaIsNotNull() {
            addCriterion("wenjianjia is not null");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaEqualTo(String value) {
            addCriterion("wenjianjia =", value, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaNotEqualTo(String value) {
            addCriterion("wenjianjia <>", value, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaGreaterThan(String value) {
            addCriterion("wenjianjia >", value, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaGreaterThanOrEqualTo(String value) {
            addCriterion("wenjianjia >=", value, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaLessThan(String value) {
            addCriterion("wenjianjia <", value, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaLessThanOrEqualTo(String value) {
            addCriterion("wenjianjia <=", value, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaLike(String value) {
            addCriterion("wenjianjia like", value, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaNotLike(String value) {
            addCriterion("wenjianjia not like", value, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaIn(List<String> values) {
            addCriterion("wenjianjia in", values, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaNotIn(List<String> values) {
            addCriterion("wenjianjia not in", values, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaBetween(String value1, String value2) {
            addCriterion("wenjianjia between", value1, value2, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andWenjianjiaNotBetween(String value1, String value2) {
            addCriterion("wenjianjia not between", value1, value2, "wenjianjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaIsNull() {
            addCriterion("asichouganjia is null");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaIsNotNull() {
            addCriterion("asichouganjia is not null");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaEqualTo(String value) {
            addCriterion("asichouganjia =", value, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaNotEqualTo(String value) {
            addCriterion("asichouganjia <>", value, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaGreaterThan(String value) {
            addCriterion("asichouganjia >", value, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaGreaterThanOrEqualTo(String value) {
            addCriterion("asichouganjia >=", value, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaLessThan(String value) {
            addCriterion("asichouganjia <", value, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaLessThanOrEqualTo(String value) {
            addCriterion("asichouganjia <=", value, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaLike(String value) {
            addCriterion("asichouganjia like", value, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaNotLike(String value) {
            addCriterion("asichouganjia not like", value, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaIn(List<String> values) {
            addCriterion("asichouganjia in", values, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaNotIn(List<String> values) {
            addCriterion("asichouganjia not in", values, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaBetween(String value1, String value2) {
            addCriterion("asichouganjia between", value1, value2, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andAsichouganjiaNotBetween(String value1, String value2) {
            addCriterion("asichouganjia not between", value1, value2, "asichouganjia");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiIsNull() {
            addCriterion("jiaoshui is null");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiIsNotNull() {
            addCriterion("jiaoshui is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiEqualTo(String value) {
            addCriterion("jiaoshui =", value, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiNotEqualTo(String value) {
            addCriterion("jiaoshui <>", value, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiGreaterThan(String value) {
            addCriterion("jiaoshui >", value, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiGreaterThanOrEqualTo(String value) {
            addCriterion("jiaoshui >=", value, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiLessThan(String value) {
            addCriterion("jiaoshui <", value, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiLessThanOrEqualTo(String value) {
            addCriterion("jiaoshui <=", value, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiLike(String value) {
            addCriterion("jiaoshui like", value, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiNotLike(String value) {
            addCriterion("jiaoshui not like", value, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiIn(List<String> values) {
            addCriterion("jiaoshui in", values, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiNotIn(List<String> values) {
            addCriterion("jiaoshui not in", values, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiBetween(String value1, String value2) {
            addCriterion("jiaoshui between", value1, value2, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaoshuiNotBetween(String value1, String value2) {
            addCriterion("jiaoshui not between", value1, value2, "jiaoshui");
            return (Criteria) this;
        }

        public Criteria andJiaobangIsNull() {
            addCriterion("jiaobang is null");
            return (Criteria) this;
        }

        public Criteria andJiaobangIsNotNull() {
            addCriterion("jiaobang is not null");
            return (Criteria) this;
        }

        public Criteria andJiaobangEqualTo(String value) {
            addCriterion("jiaobang =", value, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangNotEqualTo(String value) {
            addCriterion("jiaobang <>", value, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangGreaterThan(String value) {
            addCriterion("jiaobang >", value, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangGreaterThanOrEqualTo(String value) {
            addCriterion("jiaobang >=", value, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangLessThan(String value) {
            addCriterion("jiaobang <", value, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangLessThanOrEqualTo(String value) {
            addCriterion("jiaobang <=", value, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangLike(String value) {
            addCriterion("jiaobang like", value, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangNotLike(String value) {
            addCriterion("jiaobang not like", value, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangIn(List<String> values) {
            addCriterion("jiaobang in", values, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangNotIn(List<String> values) {
            addCriterion("jiaobang not in", values, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangBetween(String value1, String value2) {
            addCriterion("jiaobang between", value1, value2, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andJiaobangNotBetween(String value1, String value2) {
            addCriterion("jiaobang not between", value1, value2, "jiaobang");
            return (Criteria) this;
        }

        public Criteria andXiangpiIsNull() {
            addCriterion("xiangpi is null");
            return (Criteria) this;
        }

        public Criteria andXiangpiIsNotNull() {
            addCriterion("xiangpi is not null");
            return (Criteria) this;
        }

        public Criteria andXiangpiEqualTo(String value) {
            addCriterion("xiangpi =", value, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiNotEqualTo(String value) {
            addCriterion("xiangpi <>", value, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiGreaterThan(String value) {
            addCriterion("xiangpi >", value, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiGreaterThanOrEqualTo(String value) {
            addCriterion("xiangpi >=", value, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiLessThan(String value) {
            addCriterion("xiangpi <", value, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiLessThanOrEqualTo(String value) {
            addCriterion("xiangpi <=", value, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiLike(String value) {
            addCriterion("xiangpi like", value, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiNotLike(String value) {
            addCriterion("xiangpi not like", value, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiIn(List<String> values) {
            addCriterion("xiangpi in", values, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiNotIn(List<String> values) {
            addCriterion("xiangpi not in", values, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiBetween(String value1, String value2) {
            addCriterion("xiangpi between", value1, value2, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andXiangpiNotBetween(String value1, String value2) {
            addCriterion("xiangpi not between", value1, value2, "xiangpi");
            return (Criteria) this;
        }

        public Criteria andJianghuIsNull() {
            addCriterion("jianghu is null");
            return (Criteria) this;
        }

        public Criteria andJianghuIsNotNull() {
            addCriterion("jianghu is not null");
            return (Criteria) this;
        }

        public Criteria andJianghuEqualTo(String value) {
            addCriterion("jianghu =", value, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuNotEqualTo(String value) {
            addCriterion("jianghu <>", value, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuGreaterThan(String value) {
            addCriterion("jianghu >", value, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuGreaterThanOrEqualTo(String value) {
            addCriterion("jianghu >=", value, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuLessThan(String value) {
            addCriterion("jianghu <", value, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuLessThanOrEqualTo(String value) {
            addCriterion("jianghu <=", value, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuLike(String value) {
            addCriterion("jianghu like", value, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuNotLike(String value) {
            addCriterion("jianghu not like", value, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuIn(List<String> values) {
            addCriterion("jianghu in", values, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuNotIn(List<String> values) {
            addCriterion("jianghu not in", values, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuBetween(String value1, String value2) {
            addCriterion("jianghu between", value1, value2, "jianghu");
            return (Criteria) this;
        }

        public Criteria andJianghuNotBetween(String value1, String value2) {
            addCriterion("jianghu not between", value1, value2, "jianghu");
            return (Criteria) this;
        }

        public Criteria andMozhiIsNull() {
            addCriterion("mozhi is null");
            return (Criteria) this;
        }

        public Criteria andMozhiIsNotNull() {
            addCriterion("mozhi is not null");
            return (Criteria) this;
        }

        public Criteria andMozhiEqualTo(String value) {
            addCriterion("mozhi =", value, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiNotEqualTo(String value) {
            addCriterion("mozhi <>", value, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiGreaterThan(String value) {
            addCriterion("mozhi >", value, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiGreaterThanOrEqualTo(String value) {
            addCriterion("mozhi >=", value, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiLessThan(String value) {
            addCriterion("mozhi <", value, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiLessThanOrEqualTo(String value) {
            addCriterion("mozhi <=", value, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiLike(String value) {
            addCriterion("mozhi like", value, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiNotLike(String value) {
            addCriterion("mozhi not like", value, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiIn(List<String> values) {
            addCriterion("mozhi in", values, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiNotIn(List<String> values) {
            addCriterion("mozhi not in", values, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiBetween(String value1, String value2) {
            addCriterion("mozhi between", value1, value2, "mozhi");
            return (Criteria) this;
        }

        public Criteria andMozhiNotBetween(String value1, String value2) {
            addCriterion("mozhi not between", value1, value2, "mozhi");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenIsNull() {
            addCriterion("pupiheiyingpiben is null");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenIsNotNull() {
            addCriterion("pupiheiyingpiben is not null");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenEqualTo(String value) {
            addCriterion("pupiheiyingpiben =", value, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenNotEqualTo(String value) {
            addCriterion("pupiheiyingpiben <>", value, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenGreaterThan(String value) {
            addCriterion("pupiheiyingpiben >", value, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenGreaterThanOrEqualTo(String value) {
            addCriterion("pupiheiyingpiben >=", value, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenLessThan(String value) {
            addCriterion("pupiheiyingpiben <", value, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenLessThanOrEqualTo(String value) {
            addCriterion("pupiheiyingpiben <=", value, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenLike(String value) {
            addCriterion("pupiheiyingpiben like", value, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenNotLike(String value) {
            addCriterion("pupiheiyingpiben not like", value, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenIn(List<String> values) {
            addCriterion("pupiheiyingpiben in", values, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenNotIn(List<String> values) {
            addCriterion("pupiheiyingpiben not in", values, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenBetween(String value1, String value2) {
            addCriterion("pupiheiyingpiben between", value1, value2, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andPupiheiyingpibenNotBetween(String value1, String value2) {
            addCriterion("pupiheiyingpiben not between", value1, value2, "pupiheiyingpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenIsNull() {
            addCriterion("ruanpiben is null");
            return (Criteria) this;
        }

        public Criteria andRuanpibenIsNotNull() {
            addCriterion("ruanpiben is not null");
            return (Criteria) this;
        }

        public Criteria andRuanpibenEqualTo(String value) {
            addCriterion("ruanpiben =", value, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenNotEqualTo(String value) {
            addCriterion("ruanpiben <>", value, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenGreaterThan(String value) {
            addCriterion("ruanpiben >", value, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenGreaterThanOrEqualTo(String value) {
            addCriterion("ruanpiben >=", value, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenLessThan(String value) {
            addCriterion("ruanpiben <", value, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenLessThanOrEqualTo(String value) {
            addCriterion("ruanpiben <=", value, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenLike(String value) {
            addCriterion("ruanpiben like", value, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenNotLike(String value) {
            addCriterion("ruanpiben not like", value, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenIn(List<String> values) {
            addCriterion("ruanpiben in", values, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenNotIn(List<String> values) {
            addCriterion("ruanpiben not in", values, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenBetween(String value1, String value2) {
            addCriterion("ruanpiben between", value1, value2, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andRuanpibenNotBetween(String value1, String value2) {
            addCriterion("ruanpiben not between", value1, value2, "ruanpiben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenIsNull() {
            addCriterion("suxieben is null");
            return (Criteria) this;
        }

        public Criteria andSuxiebenIsNotNull() {
            addCriterion("suxieben is not null");
            return (Criteria) this;
        }

        public Criteria andSuxiebenEqualTo(String value) {
            addCriterion("suxieben =", value, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenNotEqualTo(String value) {
            addCriterion("suxieben <>", value, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenGreaterThan(String value) {
            addCriterion("suxieben >", value, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenGreaterThanOrEqualTo(String value) {
            addCriterion("suxieben >=", value, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenLessThan(String value) {
            addCriterion("suxieben <", value, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenLessThanOrEqualTo(String value) {
            addCriterion("suxieben <=", value, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenLike(String value) {
            addCriterion("suxieben like", value, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenNotLike(String value) {
            addCriterion("suxieben not like", value, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenIn(List<String> values) {
            addCriterion("suxieben in", values, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenNotIn(List<String> values) {
            addCriterion("suxieben not in", values, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenBetween(String value1, String value2) {
            addCriterion("suxieben between", value1, value2, "suxieben");
            return (Criteria) this;
        }

        public Criteria andSuxiebenNotBetween(String value1, String value2) {
            addCriterion("suxieben not between", value1, value2, "suxieben");
            return (Criteria) this;
        }

        public Criteria andHongyinniIsNull() {
            addCriterion("hongyinni is null");
            return (Criteria) this;
        }

        public Criteria andHongyinniIsNotNull() {
            addCriterion("hongyinni is not null");
            return (Criteria) this;
        }

        public Criteria andHongyinniEqualTo(String value) {
            addCriterion("hongyinni =", value, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniNotEqualTo(String value) {
            addCriterion("hongyinni <>", value, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniGreaterThan(String value) {
            addCriterion("hongyinni >", value, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniGreaterThanOrEqualTo(String value) {
            addCriterion("hongyinni >=", value, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniLessThan(String value) {
            addCriterion("hongyinni <", value, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniLessThanOrEqualTo(String value) {
            addCriterion("hongyinni <=", value, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniLike(String value) {
            addCriterion("hongyinni like", value, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniNotLike(String value) {
            addCriterion("hongyinni not like", value, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniIn(List<String> values) {
            addCriterion("hongyinni in", values, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniNotIn(List<String> values) {
            addCriterion("hongyinni not in", values, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniBetween(String value1, String value2) {
            addCriterion("hongyinni between", value1, value2, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andHongyinniNotBetween(String value1, String value2) {
            addCriterion("hongyinni not between", value1, value2, "hongyinni");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoIsNull() {
            addCriterion("zhuanbidao is null");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoIsNotNull() {
            addCriterion("zhuanbidao is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoEqualTo(String value) {
            addCriterion("zhuanbidao =", value, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoNotEqualTo(String value) {
            addCriterion("zhuanbidao <>", value, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoGreaterThan(String value) {
            addCriterion("zhuanbidao >", value, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhuanbidao >=", value, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoLessThan(String value) {
            addCriterion("zhuanbidao <", value, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoLessThanOrEqualTo(String value) {
            addCriterion("zhuanbidao <=", value, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoLike(String value) {
            addCriterion("zhuanbidao like", value, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoNotLike(String value) {
            addCriterion("zhuanbidao not like", value, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoIn(List<String> values) {
            addCriterion("zhuanbidao in", values, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoNotIn(List<String> values) {
            addCriterion("zhuanbidao not in", values, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoBetween(String value1, String value2) {
            addCriterion("zhuanbidao between", value1, value2, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andZhuanbidaoNotBetween(String value1, String value2) {
            addCriterion("zhuanbidao not between", value1, value2, "zhuanbidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoIsNull() {
            addCriterion("bizhidao is null");
            return (Criteria) this;
        }

        public Criteria andBizhidaoIsNotNull() {
            addCriterion("bizhidao is not null");
            return (Criteria) this;
        }

        public Criteria andBizhidaoEqualTo(String value) {
            addCriterion("bizhidao =", value, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoNotEqualTo(String value) {
            addCriterion("bizhidao <>", value, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoGreaterThan(String value) {
            addCriterion("bizhidao >", value, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoGreaterThanOrEqualTo(String value) {
            addCriterion("bizhidao >=", value, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoLessThan(String value) {
            addCriterion("bizhidao <", value, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoLessThanOrEqualTo(String value) {
            addCriterion("bizhidao <=", value, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoLike(String value) {
            addCriterion("bizhidao like", value, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoNotLike(String value) {
            addCriterion("bizhidao not like", value, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoIn(List<String> values) {
            addCriterion("bizhidao in", values, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoNotIn(List<String> values) {
            addCriterion("bizhidao not in", values, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoBetween(String value1, String value2) {
            addCriterion("bizhidao between", value1, value2, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andBizhidaoNotBetween(String value1, String value2) {
            addCriterion("bizhidao not between", value1, value2, "bizhidao");
            return (Criteria) this;
        }

        public Criteria andJiandaoIsNull() {
            addCriterion("jiandao is null");
            return (Criteria) this;
        }

        public Criteria andJiandaoIsNotNull() {
            addCriterion("jiandao is not null");
            return (Criteria) this;
        }

        public Criteria andJiandaoEqualTo(String value) {
            addCriterion("jiandao =", value, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoNotEqualTo(String value) {
            addCriterion("jiandao <>", value, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoGreaterThan(String value) {
            addCriterion("jiandao >", value, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoGreaterThanOrEqualTo(String value) {
            addCriterion("jiandao >=", value, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoLessThan(String value) {
            addCriterion("jiandao <", value, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoLessThanOrEqualTo(String value) {
            addCriterion("jiandao <=", value, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoLike(String value) {
            addCriterion("jiandao like", value, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoNotLike(String value) {
            addCriterion("jiandao not like", value, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoIn(List<String> values) {
            addCriterion("jiandao in", values, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoNotIn(List<String> values) {
            addCriterion("jiandao not in", values, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoBetween(String value1, String value2) {
            addCriterion("jiandao between", value1, value2, "jiandao");
            return (Criteria) this;
        }

        public Criteria andJiandaoNotBetween(String value1, String value2) {
            addCriterion("jiandao not between", value1, value2, "jiandao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoIsNull() {
            addCriterion("xiaodao is null");
            return (Criteria) this;
        }

        public Criteria andXiaodaoIsNotNull() {
            addCriterion("xiaodao is not null");
            return (Criteria) this;
        }

        public Criteria andXiaodaoEqualTo(String value) {
            addCriterion("xiaodao =", value, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoNotEqualTo(String value) {
            addCriterion("xiaodao <>", value, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoGreaterThan(String value) {
            addCriterion("xiaodao >", value, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoGreaterThanOrEqualTo(String value) {
            addCriterion("xiaodao >=", value, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoLessThan(String value) {
            addCriterion("xiaodao <", value, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoLessThanOrEqualTo(String value) {
            addCriterion("xiaodao <=", value, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoLike(String value) {
            addCriterion("xiaodao like", value, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoNotLike(String value) {
            addCriterion("xiaodao not like", value, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoIn(List<String> values) {
            addCriterion("xiaodao in", values, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoNotIn(List<String> values) {
            addCriterion("xiaodao not in", values, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoBetween(String value1, String value2) {
            addCriterion("xiaodao between", value1, value2, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andXiaodaoNotBetween(String value1, String value2) {
            addCriterion("xiaodao not between", value1, value2, "xiaodao");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiIsNull() {
            addCriterion("delidingshuji is null");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiIsNotNull() {
            addCriterion("delidingshuji is not null");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiEqualTo(String value) {
            addCriterion("delidingshuji =", value, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiNotEqualTo(String value) {
            addCriterion("delidingshuji <>", value, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiGreaterThan(String value) {
            addCriterion("delidingshuji >", value, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiGreaterThanOrEqualTo(String value) {
            addCriterion("delidingshuji >=", value, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiLessThan(String value) {
            addCriterion("delidingshuji <", value, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiLessThanOrEqualTo(String value) {
            addCriterion("delidingshuji <=", value, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiLike(String value) {
            addCriterion("delidingshuji like", value, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiNotLike(String value) {
            addCriterion("delidingshuji not like", value, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiIn(List<String> values) {
            addCriterion("delidingshuji in", values, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiNotIn(List<String> values) {
            addCriterion("delidingshuji not in", values, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiBetween(String value1, String value2) {
            addCriterion("delidingshuji between", value1, value2, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshujiNotBetween(String value1, String value2) {
            addCriterion("delidingshuji not between", value1, value2, "delidingshuji");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingIsNull() {
            addCriterion("delidingshuding is null");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingIsNotNull() {
            addCriterion("delidingshuding is not null");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingEqualTo(String value) {
            addCriterion("delidingshuding =", value, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingNotEqualTo(String value) {
            addCriterion("delidingshuding <>", value, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingGreaterThan(String value) {
            addCriterion("delidingshuding >", value, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingGreaterThanOrEqualTo(String value) {
            addCriterion("delidingshuding >=", value, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingLessThan(String value) {
            addCriterion("delidingshuding <", value, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingLessThanOrEqualTo(String value) {
            addCriterion("delidingshuding <=", value, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingLike(String value) {
            addCriterion("delidingshuding like", value, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingNotLike(String value) {
            addCriterion("delidingshuding not like", value, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingIn(List<String> values) {
            addCriterion("delidingshuding in", values, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingNotIn(List<String> values) {
            addCriterion("delidingshuding not in", values, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingBetween(String value1, String value2) {
            addCriterion("delidingshuding between", value1, value2, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andDelidingshudingNotBetween(String value1, String value2) {
            addCriterion("delidingshuding not between", value1, value2, "delidingshuding");
            return (Criteria) this;
        }

        public Criteria andJisuanqiIsNull() {
            addCriterion("jisuanqi is null");
            return (Criteria) this;
        }

        public Criteria andJisuanqiIsNotNull() {
            addCriterion("jisuanqi is not null");
            return (Criteria) this;
        }

        public Criteria andJisuanqiEqualTo(String value) {
            addCriterion("jisuanqi =", value, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiNotEqualTo(String value) {
            addCriterion("jisuanqi <>", value, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiGreaterThan(String value) {
            addCriterion("jisuanqi >", value, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiGreaterThanOrEqualTo(String value) {
            addCriterion("jisuanqi >=", value, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiLessThan(String value) {
            addCriterion("jisuanqi <", value, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiLessThanOrEqualTo(String value) {
            addCriterion("jisuanqi <=", value, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiLike(String value) {
            addCriterion("jisuanqi like", value, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiNotLike(String value) {
            addCriterion("jisuanqi not like", value, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiIn(List<String> values) {
            addCriterion("jisuanqi in", values, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiNotIn(List<String> values) {
            addCriterion("jisuanqi not in", values, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiBetween(String value1, String value2) {
            addCriterion("jisuanqi between", value1, value2, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andJisuanqiNotBetween(String value1, String value2) {
            addCriterion("jisuanqi not between", value1, value2, "jisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiIsNull() {
            addCriterion("delihanshujisuanqi is null");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiIsNotNull() {
            addCriterion("delihanshujisuanqi is not null");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiEqualTo(String value) {
            addCriterion("delihanshujisuanqi =", value, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiNotEqualTo(String value) {
            addCriterion("delihanshujisuanqi <>", value, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiGreaterThan(String value) {
            addCriterion("delihanshujisuanqi >", value, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiGreaterThanOrEqualTo(String value) {
            addCriterion("delihanshujisuanqi >=", value, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiLessThan(String value) {
            addCriterion("delihanshujisuanqi <", value, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiLessThanOrEqualTo(String value) {
            addCriterion("delihanshujisuanqi <=", value, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiLike(String value) {
            addCriterion("delihanshujisuanqi like", value, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiNotLike(String value) {
            addCriterion("delihanshujisuanqi not like", value, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiIn(List<String> values) {
            addCriterion("delihanshujisuanqi in", values, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiNotIn(List<String> values) {
            addCriterion("delihanshujisuanqi not in", values, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiBetween(String value1, String value2) {
            addCriterion("delihanshujisuanqi between", value1, value2, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andDelihanshujisuanqiNotBetween(String value1, String value2) {
            addCriterion("delihanshujisuanqi not between", value1, value2, "delihanshujisuanqi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiIsNull() {
            addCriterion("kouquzhi is null");
            return (Criteria) this;
        }

        public Criteria andKouquzhiIsNotNull() {
            addCriterion("kouquzhi is not null");
            return (Criteria) this;
        }

        public Criteria andKouquzhiEqualTo(String value) {
            addCriterion("kouquzhi =", value, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiNotEqualTo(String value) {
            addCriterion("kouquzhi <>", value, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiGreaterThan(String value) {
            addCriterion("kouquzhi >", value, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiGreaterThanOrEqualTo(String value) {
            addCriterion("kouquzhi >=", value, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiLessThan(String value) {
            addCriterion("kouquzhi <", value, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiLessThanOrEqualTo(String value) {
            addCriterion("kouquzhi <=", value, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiLike(String value) {
            addCriterion("kouquzhi like", value, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiNotLike(String value) {
            addCriterion("kouquzhi not like", value, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiIn(List<String> values) {
            addCriterion("kouquzhi in", values, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiNotIn(List<String> values) {
            addCriterion("kouquzhi not in", values, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiBetween(String value1, String value2) {
            addCriterion("kouquzhi between", value1, value2, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andKouquzhiNotBetween(String value1, String value2) {
            addCriterion("kouquzhi not between", value1, value2, "kouquzhi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiIsNull() {
            addCriterion("suliaochangzhichisanshi is null");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiIsNotNull() {
            addCriterion("suliaochangzhichisanshi is not null");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiEqualTo(String value) {
            addCriterion("suliaochangzhichisanshi =", value, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiNotEqualTo(String value) {
            addCriterion("suliaochangzhichisanshi <>", value, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiGreaterThan(String value) {
            addCriterion("suliaochangzhichisanshi >", value, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiGreaterThanOrEqualTo(String value) {
            addCriterion("suliaochangzhichisanshi >=", value, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiLessThan(String value) {
            addCriterion("suliaochangzhichisanshi <", value, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiLessThanOrEqualTo(String value) {
            addCriterion("suliaochangzhichisanshi <=", value, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiLike(String value) {
            addCriterion("suliaochangzhichisanshi like", value, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiNotLike(String value) {
            addCriterion("suliaochangzhichisanshi not like", value, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiIn(List<String> values) {
            addCriterion("suliaochangzhichisanshi in", values, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiNotIn(List<String> values) {
            addCriterion("suliaochangzhichisanshi not in", values, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiBetween(String value1, String value2) {
            addCriterion("suliaochangzhichisanshi between", value1, value2, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisanshiNotBetween(String value1, String value2) {
            addCriterion("suliaochangzhichisanshi not between", value1, value2, "suliaochangzhichisanshi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiIsNull() {
            addCriterion("suliaochangzhichisishi is null");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiIsNotNull() {
            addCriterion("suliaochangzhichisishi is not null");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiEqualTo(String value) {
            addCriterion("suliaochangzhichisishi =", value, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiNotEqualTo(String value) {
            addCriterion("suliaochangzhichisishi <>", value, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiGreaterThan(String value) {
            addCriterion("suliaochangzhichisishi >", value, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiGreaterThanOrEqualTo(String value) {
            addCriterion("suliaochangzhichisishi >=", value, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiLessThan(String value) {
            addCriterion("suliaochangzhichisishi <", value, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiLessThanOrEqualTo(String value) {
            addCriterion("suliaochangzhichisishi <=", value, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiLike(String value) {
            addCriterion("suliaochangzhichisishi like", value, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiNotLike(String value) {
            addCriterion("suliaochangzhichisishi not like", value, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiIn(List<String> values) {
            addCriterion("suliaochangzhichisishi in", values, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiNotIn(List<String> values) {
            addCriterion("suliaochangzhichisishi not in", values, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiBetween(String value1, String value2) {
            addCriterion("suliaochangzhichisishi between", value1, value2, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andSuliaochangzhichisishiNotBetween(String value1, String value2) {
            addCriterion("suliaochangzhichisishi not between", value1, value2, "suliaochangzhichisishi");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaIsNull() {
            addCriterion("delichangweijiada is null");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaIsNotNull() {
            addCriterion("delichangweijiada is not null");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaEqualTo(String value) {
            addCriterion("delichangweijiada =", value, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaNotEqualTo(String value) {
            addCriterion("delichangweijiada <>", value, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaGreaterThan(String value) {
            addCriterion("delichangweijiada >", value, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaGreaterThanOrEqualTo(String value) {
            addCriterion("delichangweijiada >=", value, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaLessThan(String value) {
            addCriterion("delichangweijiada <", value, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaLessThanOrEqualTo(String value) {
            addCriterion("delichangweijiada <=", value, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaLike(String value) {
            addCriterion("delichangweijiada like", value, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaNotLike(String value) {
            addCriterion("delichangweijiada not like", value, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaIn(List<String> values) {
            addCriterion("delichangweijiada in", values, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaNotIn(List<String> values) {
            addCriterion("delichangweijiada not in", values, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaBetween(String value1, String value2) {
            addCriterion("delichangweijiada between", value1, value2, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiadaNotBetween(String value1, String value2) {
            addCriterion("delichangweijiada not between", value1, value2, "delichangweijiada");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongIsNull() {
            addCriterion("delichangweijiazhong is null");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongIsNotNull() {
            addCriterion("delichangweijiazhong is not null");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongEqualTo(String value) {
            addCriterion("delichangweijiazhong =", value, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongNotEqualTo(String value) {
            addCriterion("delichangweijiazhong <>", value, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongGreaterThan(String value) {
            addCriterion("delichangweijiazhong >", value, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongGreaterThanOrEqualTo(String value) {
            addCriterion("delichangweijiazhong >=", value, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongLessThan(String value) {
            addCriterion("delichangweijiazhong <", value, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongLessThanOrEqualTo(String value) {
            addCriterion("delichangweijiazhong <=", value, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongLike(String value) {
            addCriterion("delichangweijiazhong like", value, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongNotLike(String value) {
            addCriterion("delichangweijiazhong not like", value, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongIn(List<String> values) {
            addCriterion("delichangweijiazhong in", values, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongNotIn(List<String> values) {
            addCriterion("delichangweijiazhong not in", values, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongBetween(String value1, String value2) {
            addCriterion("delichangweijiazhong between", value1, value2, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiazhongNotBetween(String value1, String value2) {
            addCriterion("delichangweijiazhong not between", value1, value2, "delichangweijiazhong");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoIsNull() {
            addCriterion("delichangweijiaxiao is null");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoIsNotNull() {
            addCriterion("delichangweijiaxiao is not null");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoEqualTo(String value) {
            addCriterion("delichangweijiaxiao =", value, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoNotEqualTo(String value) {
            addCriterion("delichangweijiaxiao <>", value, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoGreaterThan(String value) {
            addCriterion("delichangweijiaxiao >", value, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoGreaterThanOrEqualTo(String value) {
            addCriterion("delichangweijiaxiao >=", value, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoLessThan(String value) {
            addCriterion("delichangweijiaxiao <", value, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoLessThanOrEqualTo(String value) {
            addCriterion("delichangweijiaxiao <=", value, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoLike(String value) {
            addCriterion("delichangweijiaxiao like", value, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoNotLike(String value) {
            addCriterion("delichangweijiaxiao not like", value, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoIn(List<String> values) {
            addCriterion("delichangweijiaxiao in", values, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoNotIn(List<String> values) {
            addCriterion("delichangweijiaxiao not in", values, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoBetween(String value1, String value2) {
            addCriterion("delichangweijiaxiao between", value1, value2, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andDelichangweijiaxiaoNotBetween(String value1, String value2) {
            addCriterion("delichangweijiaxiao not between", value1, value2, "delichangweijiaxiao");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiIsNull() {
            addCriterion("wuhaonanfudianchi is null");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiIsNotNull() {
            addCriterion("wuhaonanfudianchi is not null");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiEqualTo(String value) {
            addCriterion("wuhaonanfudianchi =", value, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiNotEqualTo(String value) {
            addCriterion("wuhaonanfudianchi <>", value, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiGreaterThan(String value) {
            addCriterion("wuhaonanfudianchi >", value, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiGreaterThanOrEqualTo(String value) {
            addCriterion("wuhaonanfudianchi >=", value, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiLessThan(String value) {
            addCriterion("wuhaonanfudianchi <", value, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiLessThanOrEqualTo(String value) {
            addCriterion("wuhaonanfudianchi <=", value, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiLike(String value) {
            addCriterion("wuhaonanfudianchi like", value, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiNotLike(String value) {
            addCriterion("wuhaonanfudianchi not like", value, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiIn(List<String> values) {
            addCriterion("wuhaonanfudianchi in", values, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiNotIn(List<String> values) {
            addCriterion("wuhaonanfudianchi not in", values, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiBetween(String value1, String value2) {
            addCriterion("wuhaonanfudianchi between", value1, value2, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andWuhaonanfudianchiNotBetween(String value1, String value2) {
            addCriterion("wuhaonanfudianchi not between", value1, value2, "wuhaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiIsNull() {
            addCriterion("qihaonanfudianchi is null");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiIsNotNull() {
            addCriterion("qihaonanfudianchi is not null");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiEqualTo(String value) {
            addCriterion("qihaonanfudianchi =", value, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiNotEqualTo(String value) {
            addCriterion("qihaonanfudianchi <>", value, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiGreaterThan(String value) {
            addCriterion("qihaonanfudianchi >", value, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiGreaterThanOrEqualTo(String value) {
            addCriterion("qihaonanfudianchi >=", value, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiLessThan(String value) {
            addCriterion("qihaonanfudianchi <", value, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiLessThanOrEqualTo(String value) {
            addCriterion("qihaonanfudianchi <=", value, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiLike(String value) {
            addCriterion("qihaonanfudianchi like", value, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiNotLike(String value) {
            addCriterion("qihaonanfudianchi not like", value, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiIn(List<String> values) {
            addCriterion("qihaonanfudianchi in", values, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiNotIn(List<String> values) {
            addCriterion("qihaonanfudianchi not in", values, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiBetween(String value1, String value2) {
            addCriterion("qihaonanfudianchi between", value1, value2, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andQihaonanfudianchiNotBetween(String value1, String value2) {
            addCriterion("qihaonanfudianchi not between", value1, value2, "qihaonanfudianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiIsNull() {
            addCriterion("jiufushuangludianchi is null");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiIsNotNull() {
            addCriterion("jiufushuangludianchi is not null");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiEqualTo(String value) {
            addCriterion("jiufushuangludianchi =", value, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiNotEqualTo(String value) {
            addCriterion("jiufushuangludianchi <>", value, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiGreaterThan(String value) {
            addCriterion("jiufushuangludianchi >", value, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiGreaterThanOrEqualTo(String value) {
            addCriterion("jiufushuangludianchi >=", value, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiLessThan(String value) {
            addCriterion("jiufushuangludianchi <", value, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiLessThanOrEqualTo(String value) {
            addCriterion("jiufushuangludianchi <=", value, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiLike(String value) {
            addCriterion("jiufushuangludianchi like", value, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiNotLike(String value) {
            addCriterion("jiufushuangludianchi not like", value, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiIn(List<String> values) {
            addCriterion("jiufushuangludianchi in", values, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiNotIn(List<String> values) {
            addCriterion("jiufushuangludianchi not in", values, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiBetween(String value1, String value2) {
            addCriterion("jiufushuangludianchi between", value1, value2, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andJiufushuangludianchiNotBetween(String value1, String value2) {
            addCriterion("jiufushuangludianchi not between", value1, value2, "jiufushuangludianchi");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenIsNull() {
            addCriterion("delihuixingzhen is null");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenIsNotNull() {
            addCriterion("delihuixingzhen is not null");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenEqualTo(String value) {
            addCriterion("delihuixingzhen =", value, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenNotEqualTo(String value) {
            addCriterion("delihuixingzhen <>", value, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenGreaterThan(String value) {
            addCriterion("delihuixingzhen >", value, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenGreaterThanOrEqualTo(String value) {
            addCriterion("delihuixingzhen >=", value, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenLessThan(String value) {
            addCriterion("delihuixingzhen <", value, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenLessThanOrEqualTo(String value) {
            addCriterion("delihuixingzhen <=", value, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenLike(String value) {
            addCriterion("delihuixingzhen like", value, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenNotLike(String value) {
            addCriterion("delihuixingzhen not like", value, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenIn(List<String> values) {
            addCriterion("delihuixingzhen in", values, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenNotIn(List<String> values) {
            addCriterion("delihuixingzhen not in", values, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenBetween(String value1, String value2) {
            addCriterion("delihuixingzhen between", value1, value2, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDelihuixingzhenNotBetween(String value1, String value2) {
            addCriterion("delihuixingzhen not between", value1, value2, "delihuixingzhen");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiIsNull() {
            addCriterion("deliqidingqi is null");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiIsNotNull() {
            addCriterion("deliqidingqi is not null");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiEqualTo(String value) {
            addCriterion("deliqidingqi =", value, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiNotEqualTo(String value) {
            addCriterion("deliqidingqi <>", value, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiGreaterThan(String value) {
            addCriterion("deliqidingqi >", value, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiGreaterThanOrEqualTo(String value) {
            addCriterion("deliqidingqi >=", value, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiLessThan(String value) {
            addCriterion("deliqidingqi <", value, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiLessThanOrEqualTo(String value) {
            addCriterion("deliqidingqi <=", value, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiLike(String value) {
            addCriterion("deliqidingqi like", value, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiNotLike(String value) {
            addCriterion("deliqidingqi not like", value, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiIn(List<String> values) {
            addCriterion("deliqidingqi in", values, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiNotIn(List<String> values) {
            addCriterion("deliqidingqi not in", values, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiBetween(String value1, String value2) {
            addCriterion("deliqidingqi between", value1, value2, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andDeliqidingqiNotBetween(String value1, String value2) {
            addCriterion("deliqidingqi not between", value1, value2, "deliqidingqi");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaIsNull() {
            addCriterion("suliaowenjianjia is null");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaIsNotNull() {
            addCriterion("suliaowenjianjia is not null");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaEqualTo(String value) {
            addCriterion("suliaowenjianjia =", value, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaNotEqualTo(String value) {
            addCriterion("suliaowenjianjia <>", value, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaGreaterThan(String value) {
            addCriterion("suliaowenjianjia >", value, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaGreaterThanOrEqualTo(String value) {
            addCriterion("suliaowenjianjia >=", value, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaLessThan(String value) {
            addCriterion("suliaowenjianjia <", value, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaLessThanOrEqualTo(String value) {
            addCriterion("suliaowenjianjia <=", value, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaLike(String value) {
            addCriterion("suliaowenjianjia like", value, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaNotLike(String value) {
            addCriterion("suliaowenjianjia not like", value, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaIn(List<String> values) {
            addCriterion("suliaowenjianjia in", values, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaNotIn(List<String> values) {
            addCriterion("suliaowenjianjia not in", values, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaBetween(String value1, String value2) {
            addCriterion("suliaowenjianjia between", value1, value2, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaowenjianjiaNotBetween(String value1, String value2) {
            addCriterion("suliaowenjianjia not between", value1, value2, "suliaowenjianjia");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongIsNull() {
            addCriterion("suliaobitong is null");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongIsNotNull() {
            addCriterion("suliaobitong is not null");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongEqualTo(String value) {
            addCriterion("suliaobitong =", value, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongNotEqualTo(String value) {
            addCriterion("suliaobitong <>", value, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongGreaterThan(String value) {
            addCriterion("suliaobitong >", value, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongGreaterThanOrEqualTo(String value) {
            addCriterion("suliaobitong >=", value, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongLessThan(String value) {
            addCriterion("suliaobitong <", value, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongLessThanOrEqualTo(String value) {
            addCriterion("suliaobitong <=", value, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongLike(String value) {
            addCriterion("suliaobitong like", value, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongNotLike(String value) {
            addCriterion("suliaobitong not like", value, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongIn(List<String> values) {
            addCriterion("suliaobitong in", values, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongNotIn(List<String> values) {
            addCriterion("suliaobitong not in", values, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongBetween(String value1, String value2) {
            addCriterion("suliaobitong between", value1, value2, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andSuliaobitongNotBetween(String value1, String value2) {
            addCriterion("suliaobitong not between", value1, value2, "suliaobitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongIsNull() {
            addCriterion("muzhibitong is null");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongIsNotNull() {
            addCriterion("muzhibitong is not null");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongEqualTo(String value) {
            addCriterion("muzhibitong =", value, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongNotEqualTo(String value) {
            addCriterion("muzhibitong <>", value, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongGreaterThan(String value) {
            addCriterion("muzhibitong >", value, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongGreaterThanOrEqualTo(String value) {
            addCriterion("muzhibitong >=", value, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongLessThan(String value) {
            addCriterion("muzhibitong <", value, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongLessThanOrEqualTo(String value) {
            addCriterion("muzhibitong <=", value, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongLike(String value) {
            addCriterion("muzhibitong like", value, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongNotLike(String value) {
            addCriterion("muzhibitong not like", value, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongIn(List<String> values) {
            addCriterion("muzhibitong in", values, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongNotIn(List<String> values) {
            addCriterion("muzhibitong not in", values, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongBetween(String value1, String value2) {
            addCriterion("muzhibitong between", value1, value2, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andMuzhibitongNotBetween(String value1, String value2) {
            addCriterion("muzhibitong not between", value1, value2, "muzhibitong");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiIsNull() {
            addCriterion("yidianbamichapai is null");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiIsNotNull() {
            addCriterion("yidianbamichapai is not null");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiEqualTo(String value) {
            addCriterion("yidianbamichapai =", value, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiNotEqualTo(String value) {
            addCriterion("yidianbamichapai <>", value, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiGreaterThan(String value) {
            addCriterion("yidianbamichapai >", value, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiGreaterThanOrEqualTo(String value) {
            addCriterion("yidianbamichapai >=", value, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiLessThan(String value) {
            addCriterion("yidianbamichapai <", value, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiLessThanOrEqualTo(String value) {
            addCriterion("yidianbamichapai <=", value, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiLike(String value) {
            addCriterion("yidianbamichapai like", value, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiNotLike(String value) {
            addCriterion("yidianbamichapai not like", value, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiIn(List<String> values) {
            addCriterion("yidianbamichapai in", values, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiNotIn(List<String> values) {
            addCriterion("yidianbamichapai not in", values, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiBetween(String value1, String value2) {
            addCriterion("yidianbamichapai between", value1, value2, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andYidianbamichapaiNotBetween(String value1, String value2) {
            addCriterion("yidianbamichapai not between", value1, value2, "yidianbamichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiIsNull() {
            addCriterion("sanmichapai is null");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiIsNotNull() {
            addCriterion("sanmichapai is not null");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiEqualTo(String value) {
            addCriterion("sanmichapai =", value, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiNotEqualTo(String value) {
            addCriterion("sanmichapai <>", value, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiGreaterThan(String value) {
            addCriterion("sanmichapai >", value, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiGreaterThanOrEqualTo(String value) {
            addCriterion("sanmichapai >=", value, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiLessThan(String value) {
            addCriterion("sanmichapai <", value, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiLessThanOrEqualTo(String value) {
            addCriterion("sanmichapai <=", value, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiLike(String value) {
            addCriterion("sanmichapai like", value, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiNotLike(String value) {
            addCriterion("sanmichapai not like", value, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiIn(List<String> values) {
            addCriterion("sanmichapai in", values, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiNotIn(List<String> values) {
            addCriterion("sanmichapai not in", values, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiBetween(String value1, String value2) {
            addCriterion("sanmichapai between", value1, value2, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andSanmichapaiNotBetween(String value1, String value2) {
            addCriterion("sanmichapai not between", value1, value2, "sanmichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiIsNull() {
            addCriterion("wumichapai is null");
            return (Criteria) this;
        }

        public Criteria andWumichapaiIsNotNull() {
            addCriterion("wumichapai is not null");
            return (Criteria) this;
        }

        public Criteria andWumichapaiEqualTo(String value) {
            addCriterion("wumichapai =", value, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiNotEqualTo(String value) {
            addCriterion("wumichapai <>", value, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiGreaterThan(String value) {
            addCriterion("wumichapai >", value, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiGreaterThanOrEqualTo(String value) {
            addCriterion("wumichapai >=", value, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiLessThan(String value) {
            addCriterion("wumichapai <", value, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiLessThanOrEqualTo(String value) {
            addCriterion("wumichapai <=", value, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiLike(String value) {
            addCriterion("wumichapai like", value, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiNotLike(String value) {
            addCriterion("wumichapai not like", value, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiIn(List<String> values) {
            addCriterion("wumichapai in", values, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiNotIn(List<String> values) {
            addCriterion("wumichapai not in", values, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiBetween(String value1, String value2) {
            addCriterion("wumichapai between", value1, value2, "wumichapai");
            return (Criteria) this;
        }

        public Criteria andWumichapaiNotBetween(String value1, String value2) {
            addCriterion("wumichapai not between", value1, value2, "wumichapai");
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