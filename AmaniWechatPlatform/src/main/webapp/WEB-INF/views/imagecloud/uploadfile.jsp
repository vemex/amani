<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>上传文件 demo</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="${ROOT_PATH }content/scripts/bootstrap/css/bootstrap.css"/>
    <link rel="stylesheet" href="${ROOT_PATH }content/scripts/bootstrapValidator/css/bootstrapValidator.css"/>

    <script type="text/javascript" src="${ROOT_PATH }content/scripts/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="${ROOT_PATH }content/scripts/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${ROOT_PATH }content/scripts/bootstrapValidator/js/bootstrapValidator.js"></script>
</head>
<body>
    <div class="container">
        <div class="row">
            <!-- form: -->
            <section> 
                <div class="col-lg-8 col-lg-offset-2">
                    <form id="defaultForm" method="post"  action="${ROOT_PATH }imagecloud/upload" class="form-horizontal">
                        <fieldset>
                             
                            <div class="form-group">
                                <label class="col-lg-3 control-label">员工号</label>
                                <div class="col-lg-5">
                                    <input type="text" class="form-control" id="foldername" name="foldername" />
                                </div>
                            </div>

                             <div class="form-group">
                                <label class="col-lg-3 control-label">作品名</label>
                                <div class="col-lg-5">
                                    <input type="text" class="form-control"  id="filename"  name="filename" />
                                </div>
                            </div>
							 <div class="form-group">
								<label class="col-lg-3 control-label">作品图片</label>
								<div class="col-lg-5">
									<input type="file" class="form-control" name="file"   id="file"  onchange="img.src=this.value" />
									<span class="help-block">选择图片.</span>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-3 control-label">预览图</label>
								<div class="col-lg-5">
									<div class="thumbnail">
									 	<img class="form-control"   name="img"></img> 
									</div>
								</div>
							</div>
                        </fieldset>
 
                        <div class="form-group">
                            <div class="col-lg-9 col-lg-offset-3">
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </div>
                    </form>
             		
                </div>
            </section>
            
            <!-- :form -->
        </div>
    </div>

<script type="text/javascript">

$(document).ready(function() {
	
    $('#defaultForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            username: {
                message: '员工号不允许为空',
                validators: {
                    notEmpty: {
                        message: '员工号必须填写且不能为空'
                    }
                }
            },
            designname: {
                message: '作品名不允许为空',
                validators: {
                    notEmpty: {
                        message: '作品名必须填写且不能为空'
                    }
                }
            },
			 firstFile: {
                message: '作品图片不允许为空',
                validators: {
                    notEmpty: {
                        message: '作品图片必须填写且不能为空'
                    }
                }
            }
        }
    })
    .on('success.form.bv', function(e) {
        // Prevent form submission
        e.preventDefault();

        // Get the form instance
        var $form = $(e.target);

        // Get the BootstrapValidator instance
        var bv = $form.data('bootstrapValidator');
        var username=$("#username").val();
        var designname = $("#designname").val();
		var action=$form.attr('action'); //+"?username="+username+"&designname="+designname;
		$form.attr("action",action,function(result) {
            alert(result);
        }, 'json');
		
		//alert($form.attr('action'));
        // Use Ajax to submit form data
        $.post(action, $form.serialize());
    });
});
 
</script>
</body>
</html>