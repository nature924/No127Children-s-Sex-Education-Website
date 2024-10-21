<template>
  <div :style='{"width":"100%","padding":"40px 7%","margin":"0 auto","position":"relative","background":"none"}'>
    <div class="section-title" :style='{"margin":"10px 0","color":"#000","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230131/c788dee9481d4fd896e419a46388d74e.png) no-repeat center top","fontSize":"20px","lineHeight":"54px","fontWeight":"bold"}'>交流论坛</div>
    <el-form class="add-update-preview" :model="form" :rules="rules" ref="form" label-width="150px">
      <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","alignItems":"center","background":"linear-gradient(90deg, rgba(238,177,238,1) 0%, rgba(165,228,222,1) 30%, rgba(165,228,222,1) 100%)","display":"flex"}' label="标题" prop="title">
        <el-input v-model="form.title" placeholder="请输入标题"></el-input>
      </el-form-item>
      <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","alignItems":"center","background":"linear-gradient(90deg, rgba(238,177,238,1) 0%, rgba(165,228,222,1) 30%, rgba(165,228,222,1) 100%)","display":"flex"}' label="类型" prop="isdone">
        <el-radio-group v-model="form.isdone">
          <el-radio label="开放">公开</el-radio>
          <el-radio label="关闭">私人</el-radio>
        </el-radio-group>
      </el-form-item>
      <el-form-item :style='{"padding":"10px","margin":"0 0 10px 0","alignItems":"center","background":"linear-gradient(90deg, rgba(238,177,238,1) 0%, rgba(165,228,222,1) 30%, rgba(165,228,222,1) 100%)","display":"flex"}' label="内容" prop="content">
        <quill-editor ref="myTextEditor"
          v-model="form.content"
          :config="editorOption"
          @ready="onEditorReady($event)">
        </quill-editor>
      </el-form-item>
      <el-form-item :style='{"padding":"0","margin":"30px 0 20px 140px"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0 10px","color":"#fff","minWidth":"140px","outline":"none","borderRadius":"10px","background":"linear-gradient(90deg, rgba(32,173,158,1) 0%, rgba(138,228,219,1) 50%, rgba(32,173,158,1) 100%),#20ad9e","width":"auto","lineHeight":"44px","fontSize":"14px","height":"44px"}' type="primary" @click="submitForm('form')">{{this.isEdit ? '修改' : '发布帖子'}} </el-button>
        <el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0 15px","margin":"0 10px","color":"#fff","minWidth":"140px","outline":"none","borderRadius":"10px","background":"linear-gradient(90deg, rgba(153,153,153,1) 0%, rgba(204,204,204,1) 50%, rgba(153,153,153,1) 100%),#999","width":"auto","lineHeight":"44px","fontSize":"14px","height":"44px"}' @click="resetForm('form')">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        form: {
          title: '',
          isdone: '开放',
          content: '',
          parentid: 0,
          userid: localStorage.getItem('userid'),
          username: localStorage.getItem('username')
        },
        editorOption: {
          modules: {
            toolbar: [
              ["bold", "italic", "underline", "strike"],
              ["blockquote", "code-block"],
              [{ header: 1 }, { header: 2 }],
              [{ list: "ordered" }, { list: "bullet" }],
              [{ script: "sub" }, { script: "super" }],
              [{ indent: "-1" }, { indent: "+1" }],
              [{ direction: "rtl" }],
              [{ size: ["small", false, "large", "huge"] }],
              [{ header: [1, 2, 3, 4, 5, 6, false] }],
              [{ color: [] }, { background: [] }],
              [{ font: [] }],
              [{ align: [] }],
              ["clean"],
              ["image", "video"]
            ]
          }
        },
        isEdit: false,
        rules: {
          title: [
            { required: true, message: '请输入标题', trigger: 'blur' }
          ]
        }
      }
    },
    created() {
      if (this.$route.query.id != undefined) {
        this.isEdit = true;
        this.form = Object.assign({}, JSON.parse(this.$route.query.editObj));
      }
    },
    //方法集合
    methods: {
      onEditorReady(editor) {
        editor.root.setAttribute('data-placeholder', "请输入内容...");
      },
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$http.post(`forum/${this.isEdit ? 'update' : 'add'}`, this.form).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: `${this.isEdit ? '修改' : '发布'}成功`,
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    if (this.isEdit) {
                      this.$router.push('/index/myForumList');
                    } else {
                      this.$router.push('/index/forum');
                    }
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .add-update-preview .el-form-item /deep/ .el-form-item__label {
        padding: 0 15px;
        color: #992298;
        font-weight: 500;
        width: 150px;
        font-size: 15px;
        line-height: 40px;
        text-align: right;
      }
  
  .add-update-preview .el-form-item /deep/ .el-form-item__content {
    margin-left: 150px;
  }
  
  .add-update-preview .el-input /deep/ .el-input__inner {
        border: 0;
        border-radius: 0;
        padding: 0 10px;
        box-shadow: 0 0 0px rgba(64, 158, 255, .5);
        outline: none;
        color: #333;
        background: #fff;
        width: 360px;
        font-size: 14px;
        line-height: 32px;
        height: 32px;
      }
  
  .add-update-preview .el-select /deep/ .el-input__inner {
        border: 0;
        border-radius: 0;
        padding: 0 30px 0 10px;
        box-shadow: 0 0 0px rgba(64, 158, 255, .5);
        outline: none;
        color: #333;
        background: #fff;
        width: 320px;
        font-size: 14px;
        line-height: 32px;
        height: 32px;
      }
  
  .add-update-preview .el-date-editor /deep/ .el-input__inner {
        border: 0;
        border-radius: 0;
        padding: 0 10px 0 30px;
        box-shadow: 0 0 0px rgba(64, 158, 255, .5);
        outline: none;
        color: #333;
        background: #fff;
        width: 400px;
        font-size: 14px;
        line-height: 32px;
        height: 32px;
      }
  
  .add-update-preview /deep/ .el-upload--picture-card {
  	background: transparent;
  	border: 0;
  	border-radius: 0;
  	width: auto;
  	height: auto;
  	line-height: initial;
  	vertical-align: middle;
  }
  
  .add-update-preview /deep/ .upload .upload-img {
        border: 1px dashed #992298;
        cursor: pointer;
        border-radius: 6px;
        color: #992298;
        width: 100px;
        font-size: 32px;
        line-height: 100px;
        text-align: center;
        height: 100px;
      }
  
  .add-update-preview /deep/ .el-upload-list .el-upload-list__item {
        border: 1px dashed #992298;
        cursor: pointer;
        border-radius: 6px;
        color: #992298;
        width: 100px;
        font-size: 32px;
        line-height: 100px;
        text-align: center;
        height: 100px;
      }
  
  .add-update-preview /deep/ .el-upload .el-icon-plus {
        border: 1px dashed #992298;
        cursor: pointer;
        border-radius: 6px;
        color: #992298;
        width: 100px;
        font-size: 32px;
        line-height: 100px;
        text-align: center;
        height: 100px;
      }
  
  .add-update-preview .el-textarea /deep/ .el-textarea__inner {
        border: 0;
        border-radius: 0;
        padding: 12px;
        box-shadow: 0 0 0px rgba(64, 158, 255, .5);
        outline: none;
        color: #333;
        width: 400px;
        font-size: 14px;
        height: 120px;
      }
</style>
