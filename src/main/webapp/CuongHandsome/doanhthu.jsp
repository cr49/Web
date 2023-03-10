<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html class="loading" lang="en" data-textdirection="ltr">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="description" content="Chameleon Admin is a modern Bootstrap 4 webapp &amp; admin dashboard html template with a large number of components, elegant design, clean and organized code.">
    <meta name="keywords" content="admin template, Chameleon admin template, dashboard template, gradient admin template, responsive admin template, webapp, eCommerce dashboard, analytic dashboard">
    <meta name="author" content="ThemeSelect">
    <title>Hello Admin</title>
    <link rel="apple-touch-icon" href="<c:url value="/CuongHandsome/theme-assets/images/ico/apple-icon-120.png"/>">
    <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/CuongHandsome/"/>">
    <link href="<c:url value="/CuongHandsome/https://fonts.googleapis.com/css?family=Muli:300,300i,400,400i,600,600i,700,700i%7CComfortaa:300,400,700"/>" rel="stylesheet">
    <link href="<c:url value="/CuongHandsome/https://maxcdn.icons8.com/fonts/line-awesome/1.1/css/line-awesome.min.css"/>" rel="stylesheet">
    <!-- BEGIN VENDOR CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/theme-assets/css/vendors.css"/>">
    <!-- END VENDOR CSS-->
    <!-- BEGIN CHAMELEON  CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/theme-assets/css/app-lite.css"/>">
    <!-- END CHAMELEON  CSS-->
    <!-- BEGIN Page Level CSS-->
    <link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/theme-assets/css/core/menu/menu-types/vertical-menu.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/theme-assets/css/core/colors/palette-gradient.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/CuongHandsome/editstyle.css"/>">
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <!-- END Custom CSS-->
  </head>
  <body class="vertical-layout vertical-menu 2-columns   menu-expanded fixed-navbar" data-open="click" data-menu="vertical-menu" data-color="bg-gradient-x-purple-blue" data-col="2-columns">

    <!-- fixed-top-->
	<div class="table-wrapperrr">
	<h1>DOANH THU</h1>
				<table border="1" id="html5logo" class="table table-striped">
					<tbody>
						<tr>
							<th>ID c???a h??ng</th>
							<th>T???ng thu / ????n h??ng</th>
							<th>Thu???</th>
							<th>Ti???n c???a h??ng nh???n</th>
						</tr>
						<c:forEach items="${listC}" var="o">
						<tr>
							<td>${o.storeid}</td>
							<td>${o.afu} ??</td>
							<td>${o.afs} ??</td>
							<td>${o.ats} ??</td>
						</tr>
						</c:forEach>
					</tbody> 
				</table>
			</div>
	

    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <div class="main-menu menu-fixed menu-light menu-accordion    menu-shadow " data-scroll-to-active="true" data-img="theme-assets/images/backgrounds/02.jpg">
      <div class="navbar-header">
        <ul class="nav navbar-nav flex-row">       

        </ul>
      </div>
      <div class="main-menu-content">

        <ul class="navigation navigation-main" id="main-menu-navigation" data-menu="menu-navigation">
        <li style="margin-bottom: 50px;
        		text-align: center;
        		font-size: 30px;
        		color: red;" class=" nav-item">Hello admin</li>
          <li class=" nav-item"><a href="<c:url value="/QLSanphamControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Qu???n l?? s???n ph???m</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/QLLoaiSanphamControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Qu???n l?? lo???i sp</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/QLDonhangControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Qu???n l?? ????n h??ng</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/QLVanchuyenControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Qu???n l?? v???n chuy???n</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/QLNguoidungControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Qu???n l?? ng?????i d??ng</span></a>
          </li>
          <li class=" active"><a href="<c:url value="/QLDoanhthuControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Doanh thu</span></a>
          </li>
          <li style="margin-bottom: 60px;" class=" nav-item"><a href="<c:url value="/QLThongke"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Th???ng k??</span></a>
          </li>
          <li class=" nav-item"><a href="<c:url value="/LoginControl"/>"><i class="ft-circle"></i><span class="menu-title" data-i18n="">Logout</span></a>
          </li>
        </ul>
     <div class="navigation-background"></div>
    </div>

    <div class="app-content content">
      <div class="content-wrapper">
        <div class="content-wrapper-before"></div>
        <div class="content-header row">
          <div class="content-header-left col-md-4 col-12 mb-2">
            <h3 class="content-header-title">Typography</h3>
          </div>
          <div class="content-header-right col-md-8 col-12">
            <div class="breadcrumbs-top float-md-right">
              <div class="breadcrumb-wrapper mr-1">
                <ol class="breadcrumb">
                  <li class="breadcrumb-item"><a href="index.html">Home</a>
                  </li>
                  <li class="breadcrumb-item active">Typography
                  </li>
                </ol>
              </div>
            </div>
          </div>
        </div>
        <div class="content-body"><!--native-font-stack -->
<section id="global-settings" class="card">
    <div class="card-header">
        <h4 class="card-title">Global settings</h4>
        <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
            <ul class="list-inline mb-0">
                <li><a data-action="collapse"><i class="ft-minus"></i></a></li>
                <li><a data-action="reload"><i class="ft-rotate-cw"></i></a></li>
                <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                <li><a data-action="close"><i class="ft-x"></i></a></li>
            </ul>
        </div>
    </div>
    <div class="card-content">
        <div class="card-body">
            <div class="card-text">
                <p>Bootstrap sets basic global display, typography, and link styles. When more control is needed, check out the <a href="https://getbootstrap.com/docs/4.0/utilities/text/" target="_blank">textual utility classes.</a></p>
                <ul>
                    <li>Use a <a href="/content/reboot/#native-font-stack">native font stack</a> that selects the best <code class="highlighter-rouge">font-family</code> for each OS and device.</li>
                    <li>Use the <code class="highlighter-rouge">$font-family-base</code>, <code class="highlighter-rouge">$font-size-base</code>, and <code class="highlighter-rouge">$line-height-base</code> attributes as our typographic base applied to the <code class="highlighter-rouge">&lt;body&gt;</code>.</li>
                    <li>Set the global link color via <code class="highlighter-rouge">$link-color</code> and apply link underlines only on <code class="highlighter-rouge">:hover</code>.</li>
                    <li>Use <code class="highlighter-rouge">$body-bg</code> to set a <code class="highlighter-rouge">background-color</code> on the <code class="highlighter-rouge">&lt;body&gt;</code> (<code class="highlighter-rouge">#fff</code> by default).</li>
                </ul>
            </div>
        </div>
    </div>
</section>
<!--/ Global settings -->

<!-- Headings -->
<section id="html-headings-default" class="row match-height">
    <div class="col-sm-12 col-md-6">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">HTML headings <small class="text-muted">Default</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>All HTML headings, <code class="highlighter-rouge">&lt;h1&gt;</code> through <code class="highlighter-rouge">&lt;h6&gt;</code>, are available.</p>
                    </div>
                </div>
                <div class="table-responsive">
                    <table class="table table-borderless mb-0">
                        <tbody>
                            <tr>
                                <td>
                                    <h1>H1. Heading</h1></td>
                                <td class="type-info text-right">Semibold 2rem</td>
                            </tr>
                            <tr>
                                <td>
                                    <h2>H2. Heading</h2></td>
                                <td class="type-info text-right">Semibold 74rem</td>
                            </tr>
                            <tr>
                                <td>
                                    <h3>H3. Heading</h3></td>
                                <td class="type-info text-right">Semibold 1.51rem</td>
                            </tr>
                            <tr>
                                <td>
                                    <h4>H4. Heading</h4></td>
                                <td class="type-info text-right">Semibold 1.32rem</td>
                            </tr>
                            <tr>
                                <td>
                                    <h5>H5. Heading</h5></td>
                                <td class="type-info text-right">Semibold 1.14rem</td>
                            </tr>
                            <tr>
                                <td>
                                    <h6>H6. Heading</h6></td>
                                <td class="type-info text-right">Semibold 1rem</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="col-sm-12 col-md-6">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Heading class</h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p><code class="highlighter-rouge">.h1</code> through <code class="highlighter-rouge">.h6</code> classes are also available, for when you want to match the font styling of a heading but cannot use the associated HTML element.</p>
                    </div>
                </div>
                <div class="table-responsive">
                    <table class="table table-borderless mb-0">
                        <tbody>
                            <tr>
                                <td>
                                    <p class="h1">H1. Heading</p>
                                </td>
                                <td class="type-info text-right">Semibold 2rem</td>
                            </tr>
                            <tr>
                                <td>
                                    <p class="h2">H2. Heading</p>
                                </td>
                                <td class="type-info text-right">Semibold 74rem</td>
                            </tr>
                            <tr>
                                <td>
                                    <p class="h3">H3. Heading</p>
                                </td>
                                <td class="type-info text-right">Semibold 1.51rem</td>
                            </tr>
                            <tr>
                                <td>
                                    <p class="h4">H4. Heading</p>
                                </td>
                                <td class="type-info text-right">Semibold 1.32rem</td>
                            </tr>
                            <tr>
                                <td>
                                    <p class="h5">H5. Heading</p>
                                </td>
                                <td class="type-info text-right">Semibold 1.14rem</td>
                            </tr>
                            <tr>
                                <td>
                                    <p class="h6">H6. Heading</p>
                                </td>
                                <td class="type-info text-right">Semibold 1rem</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<!--/ Headings -->

<!-- Customizing headings -->
<section id="customizing-headings-default" class="row">
    <div class="col-sm-12 col-md-6">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Customizing headings <small class="text-muted">Default</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Use the included utility classes to recreate the small secondary heading text.</p>
                    </div>
                </div>
                <div class="table-responsive">
                    <table class="table table-borderless mb-0">
                        <tbody>
                            <tr>
                                <td>
                                    <h1>Display heading <small class="text-muted">Secondary text</small></h1></td>
                            </tr>
                            <tr>
                                <td>
                                    <h2>Display heading <small class="text-muted">Secondary text</small></h2></td>
                            </tr>
                            <tr>
                                <td>
                                    <h3>Display heading <small class="text-muted">Secondary text</small></h3></td>
                            </tr>
                            <tr>
                                <td>
                                    <h4>Display heading <small class="text-muted">Secondary text</small></h4></td>
                            </tr>
                            <tr>
                                <td>
                                    <h5>Display heading <small class="text-muted">Secondary text</small></h5></td>
                            </tr>
                            <tr>
                                <td>
                                    <h6>Display heading <small class="text-muted">Secondary text</small></h6></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class="col-sm-12 col-md-6">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Heading colors</h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Traditional heading elements are designed to work best in the meat of your page content. When you need a heading to stand out, consider using a <strong>display heading</strong>??????a larger, slightly more opinionated heading style.</p>
                    </div>
                </div>
                <div class="table-responsive">
                    <table class="table table-borderless mb-0">
                        <tbody>
                            <tr>
                                <td>
                                    <h1 class="primary">Display heading</h1></td>
                            </tr>
                            <tr>
                                <td>
                                    <h2 class="success">Display heading</h2></td>
                            </tr>
                            <tr>
                                <td>
                                    <h3 class="info">Display heading</h3></td>
                            </tr>
                            <tr>
                                <td>
                                    <h4 class="warning">Display heading</h4></td>
                            </tr>
                            <tr>
                                <td>
                                    <h5 class="danger">Display heading</h5></td>
                            </tr>
                            <tr>
                                <td>
                                    <h6 class="">Display heading</h6></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>
<!--/ Headings -->

<!-- Display headings -->
<section id="display-headings" class="card">
    <div class="card-header">
        <h4 class="card-title">Display headings</h4>
        <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
            <ul class="list-inline mb-0">
                <li><a data-action="collapse"><i class="ft-minus"></i></a></li>
                <li><a data-action="reload"><i class="ft-rotate-cw"></i></a></li>
                <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                <li><a data-action="close"><i class="ft-x"></i></a></li>
            </ul>
        </div>
    </div>
    <div class="card-content">
        <div class="card-body">
            <div class="card-text">
                <p>Traditional heading elements are designed to work best in the meat of your page content. When you need a heading to stand out, consider using a <strong>display heading</strong>??????a larger, slightly more opinionated heading style.</p>
            </div>
        </div>
        <div class="table-responsive">
            <table class="table table-borderless mb-0">
                <tbody>
                    <tr>
                        <td>
                            <h1 class="display-1">Display 1</h1></td>
                    </tr>
                    <tr>
                        <td>
                            <h1 class="display-2">Display 2</h1></td>
                    </tr>
                    <tr>
                        <td>
                            <h1 class="display-3">Display 3</h1></td>
                    </tr>
                    <tr>
                        <td>
                            <h1 class="display-4">Display 4</h1></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</section>
<!--/ Headings-->

<!-- Lead & Abbreviations -->

<section id="lead" class="row">
    <div class="col-sm-12 col-md-6">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Lead</h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Make a paragraph stand out by adding <code class="highlighter-rouge">.lead</code> </p>
                        <blockquote class="blockquote">
                            <p class="lead">
                                Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus.
                            </p>
                            <p class="lead">
                                Design is not just what it looks like and feels like. Design is how it works.
                            </p>
                        </blockquote>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-sm-12 col-md-6">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Abbreviations</h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Stylized implementation of HTML??????s  <code class="highlighter-rouge">&lt;abbr&gt;</code> element for abbreviations and acronyms to show the expanded version on hover. Abbreviations have a default underline and gain a help cursor to provide additional context on hover and to users of assistive technologies.</p>
                        <p>Add <code class="highlighter-rouge">.initialism</code> element for abbreviations and acronyms to show the expanded version on hover. Abbreviations have a default underline and gain a help cursor to provide additional context on hover and to users of assistive technologies.</p>
                        <blockquote class="blockquote">
                            <p><abbr title="attribute">attr</abbr></p>
                            <p><abbr title="HyperText Markup Language" class="initialism">HTML</abbr></p>
                        </blockquote>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!--/ Lead & Abbreviations -->

<!-- Blockquotes -->
<section id="blockquotes" class="row">
    <div class="col-md-12 mt-1">
        <div class="group-area">
            <h4>Blockquotes</h4>
            <p>For quoting blocks of content from another source within your document. Wrap <code class="highlighter-rouge">&lt;blockquote class="blockquote"&gt;</code> around any
                <abbr title="HyperText Markup Language">HTML</abbr> as the quote.</p>
            <hr>
        </div>
    </div>
</section>

<!-- Blockquotes basic-->
<section id="blockquotes-default" class="row">
    <div class="col-sm-12 col-md-6">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Blockquotes <small class="text-muted">Default</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Left aligned basic blockquotes</p>
                        <blockquote class="blockquote">
                            <p class="mb-0">Design is not just what it looks like and feels like. Design is how it works.</p>
                        </blockquote>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-sm-12 col-md-6">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Blockquotes <small class="text-muted">Right</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Add <code class="highlighter-rouge">.blockquote-reverse</code> for a blockquote with right-aligned content.</p>
                        <blockquote class="blockquote">
                            <p class="mb-0">Design is not just what it looks like and feels like. Design is how it works.</p>
                        </blockquote>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!--/ Blockquotes basic -->

<!-- Naming a source -->
<section id="naming-a-source-default" class="row">
    <div class="col-sm-12 col-md-6">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Naming a source <small class="text-muted">Default</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Add a <code class="highlighter-rouge">&lt;footer class="blockquote-footer"&gt;</code> for identifying the source. Wrap the name of the source work in <code class="highlighter-rouge">&lt;cite&gt;</code>.</p>
                        <blockquote class="blockquote">
                            <p class="mb-0">Being the richest man in the cemetery doesn't matter to me. Going to bed at night saying we've done something wonderful, that's what matters to me.</p>
                            <footer class="blockquote-footer">Steve Jobs
                                <cite title="Source Title">Entrepreneur</cite>
                            </footer>
                        </blockquote>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="col-sm-12 col-md-6">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Naming a source <small class="text-muted">Right</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Add a <code class="highlighter-rouge">&lt;footer class="blockquote-footer"&gt;</code> for identifying the source with <code class="highlighter-rouge">.blockquote-reverse</code> for a blockquote with right-aligned content.</p>
                        <blockquote class="blockquote blockquote-reverse">
                            <p class="mb-0">Being the richest man in the cemetery doesn't matter to me. Going to bed at night saying we've done something wonderful, that's what matters to me.</p>
                            <footer class="blockquote-footer">Steve Jobs
                                <cite title="Source Title">Entrepreneur</cite>
                            </footer>
                        </blockquote>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!--/ Naming a source -->

<!-- Lists -->
<section id="lists">
<div class="row">
    <div class="col-md-12 mt-1">
        <div class="group-area">
            <h4>Lists</h4>
            <p>For quoting blocks of content from another source within your document. Wrap <code class="highlighter-rouge">&lt;blockquote class="blockquote"&gt;</code> around any
                <abbr title="HyperText Markup Language">HTML</abbr> as the quote.</p>
            <hr>
        </div>
    </div>
</div>
<div class="row match-height">
    <!-- Lists Unstyled -->
    <div class="col-sm-12 col-md-4">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Lists Unstyled</h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Use class <code>.list-unstyled</code> for Lists Unstyled. It remove the default <code class="highlighter-rouge">list-style</code> and left margin on list items (immediate children only). <strong>This only applies to immediate children list items</strong>, meaning you will need to add the class for any nested lists as well.</p>
                        <ul class="list-unstyled">
                            <li>Lorem ipsum dolor sit amet</li>
                            <li>Consectetur adipiscing elit</li>
                            <li>Integer molestie lorem at massa</li>
                            <li>Facilisis in pretium nisl aliquet</li>
                            <li>Nulla volutpat aliquam velit
                                <ul>
                                    <li>Phasellus iaculis neque</li>
                                    <li>Purus sodales ultricies</li>
                                    <li>Vestibulum laoreet porttitor sem</li>
                                    <li>Ac tristique libero volutpat at</li>
                                </ul>
                            </li>
                            <li>Faucibus porta lacus fringilla vel</li>
                            <li>Aenean sit amet erat nunc</li>
                            <li>Eget porttitor lorem</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Lists Unstyled -->
    <!-- Lists Unordered -->
    <div class="col-sm-12 col-md-4">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Lists Unordered <small class="text-muted">Default</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <p>List of items in which the order does not explicitly matter.</p>
                    <div class="card-text">
                        <ul>
                            <li>Lorem ipsum dolor sit amet</li>
                            <li>Consectetur adipiscing elit</li>
                            <li>Integer molestie lorem at massa</li>
                            <li>Facilisis in pretium nisl aliquet</li>
                            <li>Nulla volutpat aliquam velit
                                <ul>
                                    <li>Phasellus iaculis neque</li>
                                    <li>Purus sodales ultricies</li>
                                    <li>Vestibulum laoreet porttitor sem</li>
                                    <li>Ac tristique libero volutpat at</li>
                                </ul>
                            </li>
                            <li>Faucibus porta lacus fringilla vel</li>
                            <li>Aenean sit amet erat nunc</li>
                            <li>Eget porttitor lorem</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/ Lists Unordered -->
    <!-- Lists Ordered -->
    <div class="col-sm-12 col-md-4">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Lists Ordered <small class="text-muted">Default</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>List of items in which the order does explicitly matter.</p>
                        <ol>
                            <li>Lorem ipsum dolor sit amet</li>
                            <li>Consectetur adipiscing elit</li>
                            <li>Integer molestie lorem at massa</li>
                            <li>Facilisis in pretium nisl aliquet</li>
                            <li>Nulla volutpat aliquam velit
                                <ol>
                                    <li>Phasellus iaculis neque</li>
                                    <li>Purus sodales ultricies</li>
                                    <li>Vestibulum laoreet porttitor sem</li>
                                    <li>Ac tristique libero volutpat at</li>
                                </ol>
                            </li>
                            <li>Faucibus porta lacus fringilla vel</li>
                            <li>Aenean sit amet erat nunc</li>
                            <li>Eget porttitor lorem</li>
                        </ol>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/ Lists Ordered -->
</div>

<div class="row match-height">
    <!-- Inline Lists-->
    <div class="col-sm-12 col-md-4">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Inline Lists <small class="text-muted">Default</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Remove a list??????s bullets and apply some light <code class="highlighter-rouge">margin</code> with a combination of two classes, <code class="highlighter-rouge">.list-inline</code> and <code class="highlighter-rouge">.list-inline-item</code>.</p>
                        <ul class="list-inline">
                          <li class="list-inline-item">Chocolate</li>
                          <li class="list-inline-item">Cake</li>
                          <li class="list-inline-item">Ice-Cream</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Inline Lists-->

    <!-- Inline Lists-->
    <div class="col-sm-12 col-md-4">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Inline Lists <small class="text-muted">Ordered</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>Use inline numbers, alphabet  etc... for ordered Inline List.</p>
                        <ul class="list-inline">
                          <li class="list-inline-item">1. Chocolate</li>
                          <li class="list-inline-item">2. Cake</li>
                          <li class="list-inline-item">3. Ice-Cream</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Inline Lists-->

    <!-- Inline Lists-->
    <div class="col-sm-12 col-md-4">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Inline Lists <small class="text-muted">With icons</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <p>You can also use Chameleon Admin icons in Inline Lists.</p>
                        <ul class="list-inline">
                          <li class="list-inline-item"><i class="la la-eur"></i> Euro</li>
                          <li class="list-inline-item"><i class="la la-gbp"></i> Pound</li>
                          <li class="list-inline-item"><i class="la la-usd"></i> Dollar</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Inline Lists-->
</div>
</section>
<!--/ Lists -->

<!-- Description list alignment -->
<section id="description-list-alignment">
<div class="row">
    <div class="col-md-12 mt-1">
        <div class="group-area">
            <h4>Description list alignment</h4>
            <p>Align terms and descriptions horizontally by using our grid system??????s predefined classes (or semantic mixins). For longer terms, you can optionally add a <code class="highlighter-rouge">.text-truncate</code> class to truncate the text with an ellipsis.</p>
            <hr>
        </div>
    </div>
</div>
<div class="row match-height">
    <!-- Description lists horizontal -->
    <div class="col-sm-12">
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Description lists <small class="text-muted">Horizontal</small></h4>
                <a class="heading-elements-toggle"><i class="la la-ellipsis-v font-medium-3"></i></a>
                <div class="heading-elements">
                    <ul class="list-inline mb-0">
                        <li><a data-action="expand"><i class="ft-maximize"></i></a></li>
                    </ul>
                </div>
            </div>
            <div class="card-content">
                <div class="card-body">
                    <div class="card-text">
                        <dl class="row">
                            <dt class="col-sm-3">Description lists</dt>
                            <dd class="col-sm-9">A description list is perfect for defining terms.</dd>
                        </dl>
                        <dl class="row">
                            <dt class="col-sm-3">Euismod</dt>
                            <dd class="col-sm-9">Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.</dd>
                        </dl>
                        <dl class="row">
                            <dt></dt>
                            <dd class="col-sm-9 ml-auto">Donec id elit non mi porta gravida at eget metus.</dd>
                        </dl>
                        <dl class="row">
                            <dt class="col-sm-3">Malesuada porta</dt>
                            <dd class="col-sm-9">Etiam porta sem malesuada magna mollis euismod.</dd>
                        </dl>
                        <dl class="row">
                            <dt class="col-sm-3 text-truncate">Truncated term is truncated</dt>
                            <dd class="col-sm-9">Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</dd>
                        </dl>
                        <dl class="row">
                            <dt class="col-sm-3">Nesting</dt>
                            <dd class="col-sm-9">
                                <dl class="row">
                                    <dt class="col-sm-4">Nested definition list</dt>
                                    <dd class="col-sm-8">Aenean posuere, tortor sed cursus feugiat, nunc augue blandit nunc.</dd>
                                </dl>
                            </dd>
                        </dl>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/ Description lists horizontal-->
</div>
</section>
        </div>
      </div>
    </div>
    <!-- ////////////////////////////////////////////////////////////////////////////-->


    <footer class="footer footer-static footer-light navbar-border navbar-shadow">
      <div class="clearfix blue-grey lighten-2 text-sm-center mb-0 px-2"><span class="float-md-left d-block d-md-inline-block">2018  &copy; Copyright <a class="text-bold-800 grey darken-2" href="https://themeselection.com" target="_blank">ThemeSelection</a></span>
        <ul class="list-inline float-md-right d-block d-md-inline-blockd-none d-lg-block mb-0">
          <li class="list-inline-item"><a class="my-1" href="https://themeselection.com/" target="_blank"> More themes</a></li>
          <li class="list-inline-item"><a class="my-1" href="https://themeselection.com/support" target="_blank"> Support</a></li>
          <li class="list-inline-item"><a class="my-1" href="https://themeselection.com/products/chameleon-admin-modern-bootstrap-webapp-dashboard-html-template-ui-kit/" target="_blank"> Purchase</a></li>
        </ul>
      </div>
    </footer>

    <!-- BEGIN VENDOR JS-->
    <script src="<c:url value="/CuongHandsome/theme-assets/vendors/js/vendors.min.js"/>" type="text/javascript"></script>
    <!-- BEGIN VENDOR JS-->
    <!-- BEGIN PAGE VENDOR JS-->
    <!-- END PAGE VENDOR JS-->
    <!-- BEGIN CHAMELEON  JS-->
    <script src="<c:url value="/CuongHandsome/theme-assets/js/core/app-menu-lite.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/CuongHandsome/theme-assets/js/core/app-lite.js"/>" type="text/javascript"></script>
    <script src="<c:url value="/CuongHandsome/Template.js"/>" type="text/javascript"></script>
    <!-- END CHAMELEON  JS-->
    <!-- BEGIN PAGE LEVEL JS-->
    <!-- END PAGE LEVEL JS-->
  </body>
</html>