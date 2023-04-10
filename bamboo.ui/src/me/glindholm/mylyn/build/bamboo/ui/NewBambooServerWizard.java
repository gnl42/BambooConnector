package me.glindholm.mylyn.build.bamboo.ui;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.mylyn.builds.core.IBuildServer;
import org.eclipse.mylyn.builds.ui.spi.BuildServerWizard;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewBambooServerWizard extends BuildServerWizard implements INewWizard {

    public NewBambooServerWizard(final IBuildServer server) {
        super(server);
    }

    @Override
    public void init(final IWorkbench workbench, final IStructuredSelection selection) {
        super.init(workbench, selection);
    }

    @Override
    public void addPages() {
        super.addPages();
    }

    @Override
    public boolean canFinish() {
        return super.canFinish();
    }

    @Override
    public void createPageControls(final Composite pageContainer) {
        super.createPageControls(pageContainer);
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public IWizardContainer getContainer() {
        return super.getContainer();
    }

    @Override
    public Image getDefaultPageImage() {
        return super.getDefaultPageImage();
    }

    @Override
    public IDialogSettings getDialogSettings() {
        return super.getDialogSettings();
    }

    @Override
    public IWizardPage getNextPage(final IWizardPage page) {
        return super.getNextPage(page);
    }

    @Override
    public IWizardPage getPage(final String pageName) {
        return super.getPage(pageName);
    }

    @Override
    public int getPageCount() {
        return super.getPageCount();
    }

    @Override
    public IWizardPage[] getPages() {
        return super.getPages();
    }

    @Override
    public IWizardPage getPreviousPage(final IWizardPage page) {
        return super.getPreviousPage(page);
    }

    @Override
    public IWizardPage getStartingPage() {
        return super.getStartingPage();
    }

    @Override
    public RGB getTitleBarColor() {
        return super.getTitleBarColor();
    }

    @Override
    public String getWindowTitle() {
        return super.getWindowTitle();
    }

    @Override
    public boolean isHelpAvailable() {
        return super.isHelpAvailable();
    }

    @Override
    public boolean needsPreviousAndNextButtons() {
        return super.needsPreviousAndNextButtons();
    }

    @Override
    public boolean needsProgressMonitor() {
        return super.needsProgressMonitor();
    }

    @Override
    public boolean performCancel() {
        return super.performCancel();
    }

    @Override
    public boolean performFinish() {
        return super.performFinish();
    }

    @Override
    public void setContainer(final IWizardContainer wizardContainer) {
        super.setContainer(wizardContainer);
    }

}
