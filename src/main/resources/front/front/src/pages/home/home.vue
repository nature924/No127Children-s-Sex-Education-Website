<template>
<div class="home-preview" :style='{"width":"100%","margin":"0 auto","flexWrap":"wrap","justifyContent":"center","display":"flex"}'>


	<!-- 关于我们 -->
	<div :style='{"minHeight":"600px","padding":"80px 7% 120px","boxShadow":"0 0px 0px rgba(255, 255, 255, .3)","margin":"0 0 60px","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230130/cea0f80d9df244b8b07db0052d4191a2.png) no-repeat center bottom,url(http://codegen.caihongy.cn/20230130/d2e10e7dcbff48d3895e011f73f46f77.png) no-repeat right bottom / auto 100%,#f7fbfc","display":"block","width":"100%","position":"relative","height":"auto"}'>
	  <div :style='{"width":"48%","fontSize":"32px","color":"#000","textAlign":"left","background":"url(http://codegen.caihongy.cn/20230130/8b9d126cfee848c48e05750bd3e8461d.png) no-repeat right center / 60% auto"}'>{{aboutUsDetail.title}}</div>
	  <div :style='{"width":"48%","margin":"0 0 20px","fontSize":"24px","color":"#555","textAlign":"left"}'>{{aboutUsDetail.subtitle}}</div>
	  <div :style='{"padding":"0","margin":"60px 0 0","alignItems":"center","flexWrap":"wrap","display":"flex","width":"48%","float":"right","height":"220px"}'>
	    <img :style='{"margin":"0 10px","objectFit":"cover","borderRadius":"8px","flex":1,"display":"block","width":"48%","height":"100%"}' :src="baseUrl + aboutUsDetail.picture1">
	    <img :style='{"margin":"0","objectFit":"cover","borderRadius":"8px","flex":1,"display":"block","width":"48%","height":"100%"}' :src="baseUrl + aboutUsDetail.picture2">
	    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + aboutUsDetail.picture3">
	  </div>
	  <div :style='{"padding":"20px","boxShadow":"0 10px 12px -10px #999","margin":"10px 0","color":"#666","borderRadius":"8px","background":"#fff","width":"48%","lineHeight":"24px","fontSize":"14px","float":"left","textIndent":"2em","height":"360px"}' v-html="aboutUsDetail.content"></div>
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	</div>

<div class="recommend" :style='{"margin":"20px auto 0","alignItems":"flex-start","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230130/d81fd2d44f4e475eb1c571b1f64e5fae.png) no-repeat center top","display":"flex","width":"100%","position":"relative","justifyContent":"center"}'>
	
    <div class="title" :style='{"margin":"50px 7% 80px","alignItems":"flex-start","textAlign":"center","background":"none","display":"flex","width":"50%","position":"relative","justifyContent":"center","height":"76px"}'>
		<span :style='{"margin":"0 10px 0 0","fontSize":"32px","color":"#202020","textAlign":"center","fontWeight":"600"}'>教育文章推荐</span>
	</div>
	
	
	
	
	
	<!-- 样式四 -->
	<div class="list list4 index-pv1" :style='{"width":"100%","padding":"20px 7% 40px","background":"none","height":"auto"}'>
		<div v-if="jiaoyuwenzhangRecommend.length>0" class="list-item animation-box" @click="toDetail('jiaoyuwenzhangDetail', jiaoyuwenzhangRecommend[0])" :style='{"width":"48%","margin":"0","position":"relative","float":"right","height":"570px"}'>
			<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-if="preHttp(jiaoyuwenzhangRecommend[0].wenzhangfengmian)" :src="jiaoyuwenzhangRecommend[0].wenzhangfengmian.split(',')[0]" alt="" />
			<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-else :src="baseUrl + (jiaoyuwenzhangRecommend[0].wenzhangfengmian?jiaoyuwenzhangRecommend[0].wenzhangfengmian.split(',')[0]:'')" alt="" />
			<div class="title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","left":"0","textAlign":"center","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"32px","fontSize":"14px","position":"absolute","textOverflow":"ellipsis"}'>
                <div>{{jiaoyuwenzhangRecommend[0].wenzhangbiaoti}}</div>
            </div>
		</div>
		<div class="list-body" :style='{"width":"48%","margin":"0 0 10px","float":"left","justifyContent":"space-between","display":"flex","height":"275px"}'>
			<div v-if="jiaoyuwenzhangRecommend.length>1" @click="toDetail('jiaoyuwenzhangDetail', jiaoyuwenzhangRecommend[1])" class="list-item animation-box" :style='{"width":"48%","margin":"0","position":"relative","display":"inline-block","height":"100%"}'>
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-if="preHttp(jiaoyuwenzhangRecommend[1].wenzhangfengmian)" :src="jiaoyuwenzhangRecommend[1].wenzhangfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-else :src="baseUrl + (jiaoyuwenzhangRecommend[1].wenzhangfengmian?jiaoyuwenzhangRecommend[1].wenzhangfengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","left":"0","textAlign":"center","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"32px","fontSize":"14px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{jiaoyuwenzhangRecommend[1].wenzhangbiaoti}}</div>
                </div>
			</div>
			<div v-if="jiaoyuwenzhangRecommend.length>2" @click="toDetail('jiaoyuwenzhangDetail', jiaoyuwenzhangRecommend[2])" class="list-item animation-box" :style='{"width":"48%","margin":"0","position":"relative","display":"inline-block","height":"100%"}'>
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-if="preHttp(jiaoyuwenzhangRecommend[2].wenzhangfengmian)" :src="jiaoyuwenzhangRecommend[2].wenzhangfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-else :src="baseUrl + (jiaoyuwenzhangRecommend[2].wenzhangfengmian?jiaoyuwenzhangRecommend[2].wenzhangfengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","left":"0","textAlign":"center","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"32px","fontSize":"14px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{jiaoyuwenzhangRecommend[2].wenzhangbiaoti}}</div>
                </div>
			</div>
		</div>
		<div class="list-body" :style='{"width":"48%","margin":"10px 0 0","float":"left","justifyContent":"space-between","display":"flex","height":"275px"}'>
			<div v-if="jiaoyuwenzhangRecommend.length>3" @click="toDetail('jiaoyuwenzhangDetail', jiaoyuwenzhangRecommend[3])" class="list-item animation-box" :style='{"width":"48%","margin":"0","position":"relative","display":"inline-block","height":"100%"}'>
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-if="preHttp(jiaoyuwenzhangRecommend[3].wenzhangfengmian)" :src="jiaoyuwenzhangRecommend[3].wenzhangfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-else :src="baseUrl + (jiaoyuwenzhangRecommend[3].wenzhangfengmian?jiaoyuwenzhangRecommend[3].wenzhangfengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","left":"0","textAlign":"center","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"32px","fontSize":"14px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{jiaoyuwenzhangRecommend[3].wenzhangbiaoti}}</div>
                </div>
			</div>
			<div v-if="jiaoyuwenzhangRecommend.length>4" @click="toDetail('jiaoyuwenzhangDetail', jiaoyuwenzhangRecommend[4])" class="list-item animation-box" :style='{"width":"48%","margin":"0","position":"relative","display":"inline-block","height":"100%"}'>
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-if="preHttp(jiaoyuwenzhangRecommend[4].wenzhangfengmian)" :src="jiaoyuwenzhangRecommend[4].wenzhangfengmian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","float":"left","height":"100%"}' v-else :src="baseUrl + (jiaoyuwenzhangRecommend[4].wenzhangfengmian?jiaoyuwenzhangRecommend[4].wenzhangfengmian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#fff","left":"0","textAlign":"center","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"32px","fontSize":"14px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{jiaoyuwenzhangRecommend[4].wenzhangbiaoti}}</div>
                </div>
			</div>
		</div>
	</div>
	
	
	
	
	
	
	<div @click="moreBtn('jiaoyuwenzhang')" :style='{"border":"0","padding":"0 12px 0 20px","margin":"o auto","borderRadius":"30px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230130/900bb2bf212e4ef8a599ed8502aa2b9d.png) no-repeat 90% center,linear-gradient(90deg, rgba(151,36,152,1) 0%, rgba(32,173,158,1) 100%),#20ad9e","display":"inline-block","width":"80px","lineHeight":"44px","minWidth":"200px","height":"44px"}'>
		<span :style='{"color":"#fff","fontSize":"14px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#f5f5f5","fontSize":"12px","display":"none"}' class="el-icon-d-arrow-right"></i>
	</div>
	
	<div v-if="true" class="idea recommendIdea" :style='{"padding":"0","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230130/aacb0fbd36e642799c61ce8641b160ed.jpg) no-repeat center top / 100% auto","display":"flex","width":"100%","justifyContent":"space-between","height":"600px"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box2" :style='{"width":"0","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"0","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"0","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
</div>




	<!-- 系统简介 -->
	<div :style='{"border":"0 solid #20ad9e","padding":"0 7% 0 0","boxShadow":"0 0px 0px rgba(255, 255, 255, .3)","margin":"44px 0 20px 7%","flexWrap":"wrap","background":"none","borderWidth":"0 4px 0 0","display":"block","width":"23%","height":"auto"}'>
	  <div :style='{"color":"#333","textAlign":"left","width":"100%","lineHeight":"48px","fontSize":"32px","fontWeight":"600","height":"48px"}'>{{systemIntroductionDetail.title}}</div>
	  <div :style='{"margin":"0","color":"#333","textAlign":"left","width":"100%","lineHeight":"24px","fontSize":"24px","textTransform":"uppercase"}'>{{systemIntroductionDetail.subtitle}}</div>
	  <div :style='{"width":"100%","padding":"0 10px","flexWrap":"wrap","display":"none","height":"auto"}'>
	    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"block","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture1">
	    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"block","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture2">
	    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"block","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture3">
	  </div>
	  <div :style='{"padding":"20px 20px 20px 24px","margin":"30px auto 0","overflow":"hidden","color":"#333","borderRadius":"8px","background":"url(http://codegen.caihongy.cn/20230131/9543629579404f72953c320de179d045.png) no-repeat center top / 100% 100%","width":"100%","lineHeight":"24px","fontSize":"14px","textIndent":"2em","height":"352px"}' v-html="systemIntroductionDetail.content"></div>
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	  <div :style='{"width":"285px","background":"url(\"http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg\") 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
	</div>
	
<div class="news" :style='{"width":"56%","margin":"0 7%","position":"relative","flexWrap":"wrap","background":"none","display":"flex"}'>
	<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"margin":"30px auto 20px","alignItems":"center","textAlign":"center","background":"none","display":"flex","width":"100%","position":"relative","justifyContent":"flex-start","height":"50px"}'>
		<span :style='{"fontSize":"32px","lineHeight":"60px","color":"#202020","fontWeight":"bold","height":"60px"}'>公告资讯</span>
	</div>
	
	
	
	
	
	
	
	
	
	<!-- 样式八 -->
	<div v-if="newsList.length" class="list list8 index-pv1" :style='{"width":"100%","padding":"0","flexWrap":"wrap","background":"none","display":"flex","height":"auto"}'>
	  <div @click="toDetail('newsDetail', newsList[0])" v-if="newsList.length>0" :style='{"padding":"10px","margin":"0 0 20px","flexWrap":"wrap","background":"linear-gradient(45deg, rgba(32,173,158,1) 0%, rgba(93,197,186,1) 15%, rgba(206,242,239,1) 50%, rgba(194,238,234,1) 75%, rgba(32,173,158,1) 100%),#20ad9e","display":"none","width":"100%","justifyContent":"space-between","height":"auto"}' class="list-item animation-box">
	    <div :style='{"width":"calc(100% - 210px)","padding":"10px","background":"#fff","height":"auto"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"28px","textOverflow":"ellipsis","fontWeight":"600"}'>{{newsList[0].title}}</div>
	      <div :style='{"fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","textIndent":"2em","height":"72px"}'>{{newsList[0].introduction}}</div>
	      <div :style='{"fontSize":"12px","lineHeight":"24px","color":"#999","textAlign":"right"}'>{{newsList[0].addtime.split(" ")[0]}}</div>
	    </div>
	    <img :style='{"width":"200px","objectFit":"cover","float":"left","height":"170px"}' :src="baseUrl + newsList[0].picture" >
	  </div>
	  <div @click="toDetail('newsDetail', newsList[1])" v-if="newsList.length>1" :style='{"padding":"10px","margin":"0 0 20px","flexWrap":"wrap","background":"linear-gradient(45deg, rgba(32,173,158,1) 0%, rgba(93,197,186,1) 15%, rgba(206,242,239,1) 50%, rgba(194,238,234,1) 75%, rgba(32,173,158,1) 100%),#20ad9e","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}' class="list-item animation-box">
	    <img :style='{"objectFit":"cover","width":"200px","height":"170px"}' :src="baseUrl + newsList[1].picture" >
	    <div :style='{"width":"calc(100% - 210px)","padding":"10px","background":"#fff","height":"auto"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"28px","textOverflow":"ellipsis","fontWeight":"600"}'>{{newsList[1].title}}</div>
	      <div :style='{"fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","textIndent":"2em","height":"72px"}'>{{newsList[1].introduction}}</div>
	      <div :style='{"fontSize":"12px","lineHeight":"24px","color":"#999","textAlign":"right"}'>{{newsList[1].addtime.split(" ")[0]}}</div>
	    </div>
	  </div>
	  <div @click="toDetail('newsDetail', newsList[2])" v-if="newsList.length>2" :style='{"width":"570px","padding":"10px","margin":"0 10px","background":"#f5f5f5","display":"none","height":"auto"}' class="list-item animation-box">
	    <div :style='{"width":"400px","padding":"10px","height":"auto"}'>
	      <div :style='{"color":"#333","fontSize":"14px","lineHeight":"28px"}'>{{newsList[2].title}}</div>
	      <div :style='{"color":"#666","fontSize":"14px","lineHeight":"24px"}'>{{newsList[2].introduction}}</div>
	      <div :style='{"color":"#999","fontSize":"12px","lineHeight":"24px"}'>{{newsList[2].addtime.split(" ")[0]}}</div>
	    </div>
	    <img :style='{"objectFit":"cover","width":"170px","height":"170px"}' :src="baseUrl + newsList[2].picture" >
	  </div>
	  <div @click="toDetail('newsDetail', newsList[3])" v-if="newsList.length>3" :style='{"padding":"10px","margin":"0 0 40px","flexWrap":"wrap","background":"linear-gradient(45deg, rgba(32,173,158,1) 0%, rgba(93,197,186,1) 15%, rgba(206,242,239,1) 50%, rgba(194,238,234,1) 75%, rgba(32,173,158,1) 100%),#20ad9e","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}' class="list-item animation-box">
	    <img :style='{"objectFit":"cover","width":"200px","height":"170px"}' :src="baseUrl + newsList[3].picture" >
	    <div :style='{"width":"calc(100% - 210px)","padding":"10px","background":"#fff","height":"auto"}'>
	      <div :style='{"whiteSpace":"nowrap","overflow":"hidden","color":"#333","fontSize":"14px","lineHeight":"28px","textOverflow":"ellipsis","fontWeight":"600"}'>{{newsList[3].title}}</div>
	      <div :style='{"fontSize":"14px","lineHeight":"24px","overflow":"hidden","color":"#666","textIndent":"2em","height":"72px"}'>{{newsList[3].introduction}}</div>
	      <div :style='{"fontSize":"12px","lineHeight":"24px","color":"#999","textAlign":"right"}'>{{newsList[3].addtime.split(" ")[0]}}</div>
	    </div>
	  </div>
	</div>
	
	
	
	<div @click="moreBtn('news')" :style='{"border":"0","padding":"0 12px 0 20px","margin":"0","top":"40px","textAlign":"center","background":"none","display":"inline-block","width":"auto","lineHeight":"40px","position":"absolute","right":"0","height":"40px"}'>
		<span :style='{"color":"#666","fontSize":"16px"}'>查看更多</span>
		<i v-if="true" :style='{"color":"#666","fontSize":"16px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>

</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        systemIntroductionDetail: {},
        newsList: [],
        jiaoyuwenzhangRecommend: [],

      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getNewsList();
      this.getAboutUs();
      this.getSystemIntroduction();
      this.getList();
    },
    //方法集合
    methods: {
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
		getNewsList() {
			this.$http.get('news/list', {params: {
				page: 1,
				limit: 2,
			order: 'desc'}}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
          let autoSortUrl = "";
          autoSortUrl = "jiaoyuwenzhang/autoSort";
			this.$http.get(autoSortUrl, {params: {
				page: 1,
				limit: 6,
			}}).then(res => {
				if (res.data.code == 0) {
					this.jiaoyuwenzhangRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				padding: 40px 20px;
				left: 40px;
				background: #fff;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: #20ad9e;
			}
			
			.list3 .swiper-button-next {
				padding: 40px 20px;
				left: auto;
				background: #fff;
				right: 40px;
        }
        
        .list3 .swiper-button-next::after {
				color: #20ad9e;
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform:  translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
</style>
