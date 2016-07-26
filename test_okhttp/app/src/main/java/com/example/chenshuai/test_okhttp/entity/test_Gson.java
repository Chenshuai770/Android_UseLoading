package com.example.chenshuai.test_okhttp.entity;

import java.util.List;

/**
 * Created by chenshuai on 2016/7/26.
 */
public class test_Gson {//逢{}创建class，字段用方法（）

    /**
     * respCode : 00
     * respMsg : OK
     * body : {"totalCount":0,"designers":[{"uid":1027,"realname":"鬼斧先生","sAvatar":"http://huihome.cn:8888/upimg/160323/1027_14d4ce31-5633-49af-b48d-6582ba7b86f0.png","totalScore":5,"feeLow":150,"feeHigh":200,"caseCount":24},{"uid":1557,"realname":"黄振标","sAvatar":"http://huihome.cn:8888/upimg/160115/M_a6c2f422-34b5-4266-8591-580b83576a7f.jpg","totalScore":5,"feeLow":50,"feeHigh":70,"caseCount":17},{"uid":1026,"realname":"申薇","sAvatar":"http://112.124.35.101:8888/upimg/150507/1026_18259793-e730-416f-a7a8-3cf4b1d11436.jpg","totalScore":4.7,"feeLow":100,"feeHigh":200,"caseCount":13},{"uid":1077,"realname":"曹迥&中坚KTV设计","sAvatar":"","totalScore":4,"feeLow":100,"feeHigh":200,"caseCount":12},{"uid":1678,"realname":"何巍","sAvatar":"http://huihome.cn:8888/upimg/160420/1678_4c9e38cd-70c2-44a9-81a6-92661a812868.png","totalScore":4,"feeLow":150,"feeHigh":300,"caseCount":12},{"uid":1465,"realname":"周 娜","sAvatar":"http://huihome.cn:8888/upimg/160521/1465_d1a8fee1-94b3-472c-94a4-0ad08fb3e763.png","totalScore":5,"feeLow":50,"feeHigh":70,"caseCount":11},{"uid":1728,"realname":"吴Design","sAvatar":"http://huihome.cn:8888/upimg/160517/1728_10baf8b5-b250-49ff-8870-03cbd417e870.png","totalScore":5,"feeLow":80,"feeHigh":200,"caseCount":11},{"uid":1603,"realname":"杨朝钧","sAvatar":"http://huihome.cn:8888/upimg/160521/1603_b73e11a9-bd97-49b2-a3b6-a2a4658de9ce.jpg","totalScore":4.7,"feeLow":50,"feeHigh":70,"caseCount":9},{"uid":1471,"realname":"熊杰","sAvatar":"http://huihome.cn:8888/upimg/160219/1471_8b6f2313-9090-42b7-b944-05f4cb20249c.png","totalScore":5,"feeLow":50,"feeHigh":70,"caseCount":8},{"uid":1612,"realname":"庄德","sAvatar":"http://huihome.cn:8888/upimg/160304/1612_a27bc610-65a6-407b-850d-b57585c116c8.jpg","totalScore":4,"feeLow":80,"feeHigh":100,"caseCount":8}]}
     */

    private String respCode;
    private String respMsg;
    /**
     * totalCount : 0
     * designers : [{"uid":1027,"realname":"鬼斧先生","sAvatar":"http://huihome.cn:8888/upimg/160323/1027_14d4ce31-5633-49af-b48d-6582ba7b86f0.png","totalScore":5,"feeLow":150,"feeHigh":200,"caseCount":24},{"uid":1557,"realname":"黄振标","sAvatar":"http://huihome.cn:8888/upimg/160115/M_a6c2f422-34b5-4266-8591-580b83576a7f.jpg","totalScore":5,"feeLow":50,"feeHigh":70,"caseCount":17},{"uid":1026,"realname":"申薇","sAvatar":"http://112.124.35.101:8888/upimg/150507/1026_18259793-e730-416f-a7a8-3cf4b1d11436.jpg","totalScore":4.7,"feeLow":100,"feeHigh":200,"caseCount":13},{"uid":1077,"realname":"曹迥&中坚KTV设计","sAvatar":"","totalScore":4,"feeLow":100,"feeHigh":200,"caseCount":12},{"uid":1678,"realname":"何巍","sAvatar":"http://huihome.cn:8888/upimg/160420/1678_4c9e38cd-70c2-44a9-81a6-92661a812868.png","totalScore":4,"feeLow":150,"feeHigh":300,"caseCount":12},{"uid":1465,"realname":"周 娜","sAvatar":"http://huihome.cn:8888/upimg/160521/1465_d1a8fee1-94b3-472c-94a4-0ad08fb3e763.png","totalScore":5,"feeLow":50,"feeHigh":70,"caseCount":11},{"uid":1728,"realname":"吴Design","sAvatar":"http://huihome.cn:8888/upimg/160517/1728_10baf8b5-b250-49ff-8870-03cbd417e870.png","totalScore":5,"feeLow":80,"feeHigh":200,"caseCount":11},{"uid":1603,"realname":"杨朝钧","sAvatar":"http://huihome.cn:8888/upimg/160521/1603_b73e11a9-bd97-49b2-a3b6-a2a4658de9ce.jpg","totalScore":4.7,"feeLow":50,"feeHigh":70,"caseCount":9},{"uid":1471,"realname":"熊杰","sAvatar":"http://huihome.cn:8888/upimg/160219/1471_8b6f2313-9090-42b7-b944-05f4cb20249c.png","totalScore":5,"feeLow":50,"feeHigh":70,"caseCount":8},{"uid":1612,"realname":"庄德","sAvatar":"http://huihome.cn:8888/upimg/160304/1612_a27bc610-65a6-407b-850d-b57585c116c8.jpg","totalScore":4,"feeLow":80,"feeHigh":100,"caseCount":8}]
     */

    private BodyBean body;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public static class BodyBean {//大括号创建类，中括号创建集合list
        private int totalCount;
        /**
         * uid : 1027
         * realname : 鬼斧先生
         * sAvatar : http://huihome.cn:8888/upimg/160323/1027_14d4ce31-5633-49af-b48d-6582ba7b86f0.png
         * totalScore : 5.0
         * feeLow : 150
         * feeHigh : 200
         * caseCount : 24
         */

        private List<DesignersBean> designers;

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public List<DesignersBean> getDesigners() {
            return designers;
        }

        public void setDesigners(List<DesignersBean> designers) {//集合的类型用对象，重复的无需创建
            this.designers = designers;
        }

        public static class DesignersBean {
            private int uid;
            private String realname;
            private String sAvatar;
            private double totalScore;
            private int feeLow;
            private int feeHigh;
            private int caseCount;

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public String getRealname() {
                return realname;
            }

            public void setRealname(String realname) {
                this.realname = realname;
            }

            public String getSAvatar() {
                return sAvatar;
            }

            public void setSAvatar(String sAvatar) {
                this.sAvatar = sAvatar;
            }

            public double getTotalScore() {
                return totalScore;
            }

            public void setTotalScore(double totalScore) {
                this.totalScore = totalScore;
            }

            public int getFeeLow() {
                return feeLow;
            }

            public void setFeeLow(int feeLow) {
                this.feeLow = feeLow;
            }

            public int getFeeHigh() {
                return feeHigh;
            }

            public void setFeeHigh(int feeHigh) {
                this.feeHigh = feeHigh;
            }

            public int getCaseCount() {
                return caseCount;
            }

            public void setCaseCount(int caseCount) {
                this.caseCount = caseCount;
            }
        }
    }
}
