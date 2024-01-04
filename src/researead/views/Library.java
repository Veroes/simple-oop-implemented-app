package researead.views;

import researead.views.utils.ScrollBar;
import researead.views.dialogmsg.Dialog_AddBook;
import researead.views.dialogmsg.DialogMsg_Logout;
import java.awt.Color;
import java.util.HashMap;
import researead.controllers.AuthManager;
import researead.controllers.BookController;
import researead.controllers.LibraryController;
import researead.models.Book;
import researead.models.LibraryModel;
import researead.views.dialogmsg.DialogMsg_DeleteBook;
import researead.views.dialogmsg.Dialog_EditBook;

public class Library extends javax.swing.JFrame {
    Color DefaultColor, ClickedColor, HoverColor, DefaultColorAction, HoverColorAction;
    private final String username;
    private final LibraryController libraryController;
    private final BookController bookController;
    private LibraryModel userLibrary;
    public Library() {
        initComponents();
        
        username = AuthManager.getAuthenticatedUser().getUsername();
        AuthenticatedUsername.setText("User: " + username);
        
        libraryController = new LibraryController();
        bookController = new BookController();
        
        userLibrary = libraryController.getUserLibraryInDB(AuthManager.getAuthenticatedUserId());
        AuthManager.setAuthenticatedUserLibrary(userLibrary);
        
        BookTable.populateTable(userLibrary, "All");
        // table scrollbar
        spTable.setVerticalScrollBar(new ScrollBar());
        //--------------
        
        // for menu
        DefaultColor  = new Color(126,151,151);
        ClickedColor  = new Color(103,133,133);
        HoverColor = new Color(169, 185, 185);
        
        // for action 
        DefaultColorAction  = new Color(238,238,238);
        HoverColorAction = new Color(228,228,228);
        
        // set default color to pan on run time
        Menu_AllBooks.setBackground(ClickedColor);
        Menu_Reading.setBackground(DefaultColor);
        Menu_Finished.setBackground(DefaultColor);
        Menu_Logout.setBackground(DefaultColor);
        
        // Add mouse listeners for hover effect
        Menu_AllBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_AllBooksMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_AllBooksMouseExited(evt);
            }
        });

        Menu_Reading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_ReadingMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_ReadingMouseExited(evt);
            }
        });

        Menu_Finished.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_FinishedMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_FinishedMouseExited(evt);
            }
        });
        
        Menu_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_LogoutMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_FinishedMouseExited(evt);
            }
        });
        
        Button_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_EditMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_EditMouseExited(evt);
            }
        });
        
        Button_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_AddMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_AddMouseExited(evt);
            }
        });
        
        Button_Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_RefreshMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_RefreshMouseExited(evt);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel_Menu = new javax.swing.JPanel();
        Menu_AllBooks = new javax.swing.JPanel();
        AllBookState = new javax.swing.JLabel();
        Menu_Reading = new javax.swing.JPanel();
        ReadingState = new javax.swing.JLabel();
        Menu_Finished = new javax.swing.JPanel();
        FinishedState = new javax.swing.JLabel();
        Menu_Logout = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AuthenticatedUsername = new javax.swing.JLabel();
        InternalPanelSection = new javax.swing.JPanel();
        spTable = new javax.swing.JScrollPane();
        BookTable = new researead.views.utils.Table();
        Panel_Header = new javax.swing.JPanel();
        Button_Add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Button_Delete = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Button_Edit = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Button_Refresh = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        MenuName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(247, 246, 244));

        Panel_Menu.setBackground(new java.awt.Color(126, 151, 151));

        Menu_AllBooks.setBackground(new java.awt.Color(126, 151, 151));
        Menu_AllBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_AllBooksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_AllBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_AllBooksMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_AllBooksMousePressed(evt);
            }
        });

        AllBookState.setBackground(new java.awt.Color(247, 246, 244));
        AllBookState.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        AllBookState.setForeground(new java.awt.Color(247, 246, 244));
        AllBookState.setText("All Books");

        javax.swing.GroupLayout Menu_AllBooksLayout = new javax.swing.GroupLayout(Menu_AllBooks);
        Menu_AllBooks.setLayout(Menu_AllBooksLayout);
        Menu_AllBooksLayout.setHorizontalGroup(
            Menu_AllBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_AllBooksLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(AllBookState)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Menu_AllBooksLayout.setVerticalGroup(
            Menu_AllBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AllBookState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu_Reading.setBackground(new java.awt.Color(126, 151, 151));
        Menu_Reading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_ReadingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_ReadingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_ReadingMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_ReadingMousePressed(evt);
            }
        });

        ReadingState.setBackground(new java.awt.Color(247, 246, 244));
        ReadingState.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        ReadingState.setForeground(new java.awt.Color(247, 246, 244));
        ReadingState.setText("Reading");

        javax.swing.GroupLayout Menu_ReadingLayout = new javax.swing.GroupLayout(Menu_Reading);
        Menu_Reading.setLayout(Menu_ReadingLayout);
        Menu_ReadingLayout.setHorizontalGroup(
            Menu_ReadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_ReadingLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(ReadingState)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Menu_ReadingLayout.setVerticalGroup(
            Menu_ReadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReadingState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu_Finished.setBackground(new java.awt.Color(126, 151, 151));
        Menu_Finished.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_FinishedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_FinishedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_FinishedMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_FinishedMousePressed(evt);
            }
        });

        FinishedState.setBackground(new java.awt.Color(247, 246, 244));
        FinishedState.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        FinishedState.setForeground(new java.awt.Color(247, 246, 244));
        FinishedState.setText("Finished");

        javax.swing.GroupLayout Menu_FinishedLayout = new javax.swing.GroupLayout(Menu_Finished);
        Menu_Finished.setLayout(Menu_FinishedLayout);
        Menu_FinishedLayout.setHorizontalGroup(
            Menu_FinishedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_FinishedLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(FinishedState)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Menu_FinishedLayout.setVerticalGroup(
            Menu_FinishedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_FinishedLayout.createSequentialGroup()
                .addComponent(FinishedState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        Menu_Logout.setBackground(new java.awt.Color(126, 151, 151));
        Menu_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Menu_LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Menu_LogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Menu_LogoutMousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(247, 246, 244));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(247, 246, 244));
        jLabel9.setText("Logout");

        javax.swing.GroupLayout Menu_LogoutLayout = new javax.swing.GroupLayout(Menu_Logout);
        Menu_Logout.setLayout(Menu_LogoutLayout);
        Menu_LogoutLayout.setHorizontalGroup(
            Menu_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_LogoutLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Menu_LogoutLayout.setVerticalGroup(
            Menu_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_LogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setBackground(new java.awt.Color(247, 246, 244));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(247, 246, 244));
        jLabel8.setText("ReseaRead");

        AuthenticatedUsername.setBackground(new java.awt.Color(247, 246, 244));
        AuthenticatedUsername.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AuthenticatedUsername.setForeground(new java.awt.Color(247, 246, 244));
        AuthenticatedUsername.setText("User :");

        javax.swing.GroupLayout Panel_MenuLayout = new javax.swing.GroupLayout(Panel_Menu);
        Panel_Menu.setLayout(Panel_MenuLayout);
        Panel_MenuLayout.setHorizontalGroup(
            Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu_AllBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu_Reading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu_Finished, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Menu_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_MenuLayout.createSequentialGroup()
                .addGroup(Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_MenuLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8))
                    .addGroup(Panel_MenuLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(AuthenticatedUsername)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        Panel_MenuLayout.setVerticalGroup(
            Panel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_MenuLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel8)
                .addGap(24, 24, 24)
                .addComponent(Menu_AllBooks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Menu_Reading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Menu_Finished, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AuthenticatedUsername)
                .addGap(18, 18, 18)
                .addComponent(Menu_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        InternalPanelSection.setBackground(new java.awt.Color(247, 246, 244));

        BookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cover", "Title", "Author", "Page", "Status"
            }
        ));
        BookTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spTable.setViewportView(BookTable);

        Panel_Header.setBackground(new java.awt.Color(247, 246, 244));

        Button_Add.setBackground(new java.awt.Color(238, 238, 238));
        Button_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_AddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Button_AddMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add");

        javax.swing.GroupLayout Button_AddLayout = new javax.swing.GroupLayout(Button_Add);
        Button_Add.setLayout(Button_AddLayout);
        Button_AddLayout.setHorizontalGroup(
            Button_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Button_AddLayout.setVerticalGroup(
            Button_AddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Button_Delete.setBackground(new java.awt.Color(238, 238, 238));
        Button_Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_DeleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Button_DeleteMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Delete");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout Button_DeleteLayout = new javax.swing.GroupLayout(Button_Delete);
        Button_Delete.setLayout(Button_DeleteLayout);
        Button_DeleteLayout.setHorizontalGroup(
            Button_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Button_DeleteLayout.setVerticalGroup(
            Button_DeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Button_Edit.setBackground(new java.awt.Color(238, 238, 238));
        Button_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_EditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_EditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_EditMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Edit");

        javax.swing.GroupLayout Button_EditLayout = new javax.swing.GroupLayout(Button_Edit);
        Button_Edit.setLayout(Button_EditLayout);
        Button_EditLayout.setHorizontalGroup(
            Button_EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Button_EditLayout.setVerticalGroup(
            Button_EditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Button_Refresh.setBackground(new java.awt.Color(238, 238, 238));
        Button_Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button_RefreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button_RefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button_RefreshMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Button_RefreshMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Refresh");

        javax.swing.GroupLayout Button_RefreshLayout = new javax.swing.GroupLayout(Button_Refresh);
        Button_Refresh.setLayout(Button_RefreshLayout);
        Button_RefreshLayout.setHorizontalGroup(
            Button_RefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        Button_RefreshLayout.setVerticalGroup(
            Button_RefreshLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MenuName.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        MenuName.setForeground(new java.awt.Color(126, 151, 151));
        MenuName.setText("All Books");

        javax.swing.GroupLayout Panel_HeaderLayout = new javax.swing.GroupLayout(Panel_Header);
        Panel_Header.setLayout(Panel_HeaderLayout);
        Panel_HeaderLayout.setHorizontalGroup(
            Panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_HeaderLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(MenuName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Button_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Button_Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        Panel_HeaderLayout.setVerticalGroup(
            Panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Panel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Refresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(MenuName)
        );

        javax.swing.GroupLayout InternalPanelSectionLayout = new javax.swing.GroupLayout(InternalPanelSection);
        InternalPanelSection.setLayout(InternalPanelSectionLayout);
        InternalPanelSectionLayout.setHorizontalGroup(
            InternalPanelSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InternalPanelSectionLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        InternalPanelSectionLayout.setVerticalGroup(
            InternalPanelSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InternalPanelSectionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Panel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Panel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InternalPanelSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(InternalPanelSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_ReadingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_ReadingMousePressed
        // TODO add your handling code here:
        Menu_AllBooks.setBackground(DefaultColor);
        Menu_Reading.setBackground(ClickedColor);
        Menu_Finished.setBackground(DefaultColor);

        MenuName.setText("Reading");
    }//GEN-LAST:event_Menu_ReadingMousePressed

    private void Menu_ReadingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_ReadingMouseExited
        // TODO add your handling code here:
        if (!Menu_Reading.getBackground().equals(ClickedColor)) {
            Menu_Reading.setBackground(DefaultColor);
        }
    }//GEN-LAST:event_Menu_ReadingMouseExited

    private void Menu_ReadingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_ReadingMouseEntered
        // TODO add your handling code here:
        Menu_Reading.setBackground(HoverColor);
    }//GEN-LAST:event_Menu_ReadingMouseEntered

    private void Menu_ReadingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_ReadingMouseClicked
        // TODO add your handling code here:
        userLibrary = libraryController.getUserLibraryInDB(AuthManager.getAuthenticatedUserId());
        BookTable.populateTable(userLibrary, "Reading");
    }//GEN-LAST:event_Menu_ReadingMouseClicked

    private void Menu_AllBooksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AllBooksMousePressed
        // TODO add your handling code here:
        Menu_AllBooks.setBackground(ClickedColor);
        Menu_Reading.setBackground(DefaultColor);
        Menu_Finished.setBackground(DefaultColor);

        MenuName.setText("All Books");
    }//GEN-LAST:event_Menu_AllBooksMousePressed

    private void Menu_AllBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AllBooksMouseExited
        // TODO add your handling code here:
        if (!Menu_AllBooks.getBackground().equals(ClickedColor)) {
            Menu_AllBooks.setBackground(DefaultColor);
        }
    }//GEN-LAST:event_Menu_AllBooksMouseExited

    private void Menu_AllBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AllBooksMouseEntered
        // TODO add your handling code here:
        //Menu_AllBooks.setBackground(HoverColor);
    }//GEN-LAST:event_Menu_AllBooksMouseEntered

    private void Menu_AllBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_AllBooksMouseClicked
        // TODO add your handling code here:
        userLibrary = libraryController.getUserLibraryInDB(AuthManager.getAuthenticatedUserId());
        BookTable.populateTable(userLibrary, "All");
    }//GEN-LAST:event_Menu_AllBooksMouseClicked

    private void Button_EditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_EditMouseEntered
        // TODO add your handling code here:
        Button_Edit.setBackground(HoverColorAction);
    }//GEN-LAST:event_Button_EditMouseEntered

    private void Button_EditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_EditMouseExited
        // TODO add your handling code here:
        Button_Edit.setBackground(DefaultColorAction);
    }//GEN-LAST:event_Button_EditMouseExited

    private void Button_AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AddMouseEntered
        // TODO add your handling code here:
        Button_Add.setBackground(HoverColorAction);
    }//GEN-LAST:event_Button_AddMouseEntered

    private void Button_AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AddMouseExited
        // TODO add your handling code here:
         Button_Add.setBackground(DefaultColorAction);
    }//GEN-LAST:event_Button_AddMouseExited

    private void Menu_FinishedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_FinishedMousePressed
        // TODO add your handling code here:
        Menu_AllBooks.setBackground(DefaultColor);
        Menu_Reading.setBackground(DefaultColor);
        Menu_Finished.setBackground(ClickedColor);

        MenuName.setText("Finished");
    }//GEN-LAST:event_Menu_FinishedMousePressed

    private void Menu_FinishedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_FinishedMouseExited
        // TODO add your handling code here:
        if (!Menu_Finished.getBackground().equals(ClickedColor)) {
            Menu_Finished.setBackground(DefaultColor);
        }
    }//GEN-LAST:event_Menu_FinishedMouseExited

    private void Menu_FinishedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_FinishedMouseEntered
        // TODO add your handling code here:
        Menu_Finished.setBackground(HoverColor);
    }//GEN-LAST:event_Menu_FinishedMouseEntered

    private void Menu_FinishedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_FinishedMouseClicked
        // TODO add your handling code here:
        userLibrary = libraryController.getUserLibraryInDB(AuthManager.getAuthenticatedUserId());
        BookTable.populateTable(userLibrary, "Finished");
    }//GEN-LAST:event_Menu_FinishedMouseClicked

    private void Menu_LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_LogoutMouseClicked
        // TODO add your handling code here:
        // Menampilkan dialog konfirmasi logout
        DialogMsg_Logout dialogLogout = new DialogMsg_Logout(this, true);
        dialogLogout.setLocationRelativeTo(null);
        dialogLogout.setVisible(true);
    }//GEN-LAST:event_Menu_LogoutMouseClicked

    private void Menu_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_LogoutMouseEntered
        // TODO add your handling code here:
        Menu_Logout.setBackground(HoverColor);
    }//GEN-LAST:event_Menu_LogoutMouseEntered

    private void Menu_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_LogoutMouseExited
        // TODO add your handling code here:
        if (!Menu_Logout.getBackground().equals(ClickedColor)) {
            Menu_Logout.setBackground(DefaultColor);
        }
    }//GEN-LAST:event_Menu_LogoutMouseExited

    private void Menu_LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_LogoutMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_LogoutMousePressed

    private void Button_RefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_RefreshMouseEntered
        // TODO add your handling code here:
        Button_Refresh.setBackground(HoverColorAction);
    }//GEN-LAST:event_Button_RefreshMouseEntered
    
    private void Button_RefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_RefreshMouseExited
        // TODO add your handling code here:
        Button_Refresh.setBackground(DefaultColorAction);
    }//GEN-LAST:event_Button_RefreshMouseExited

    private void Button_AddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_AddMousePressed
        // TODO add your handling code here:
        // Menampilkan form add book
        Dialog_AddBook dialogAddbook = new Dialog_AddBook(this, true);
        dialogAddbook.setLocationRelativeTo(null);
        dialogAddbook.setVisible(true);
    }//GEN-LAST:event_Button_AddMousePressed

    private void Button_RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_RefreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_RefreshMouseClicked

    private void Button_RefreshMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_RefreshMousePressed
        // TODO add your handling code here:
        userLibrary = libraryController.getUserLibraryInDB(AuthManager.getAuthenticatedUserId());
        BookTable.populateTable(userLibrary, "All");
        System.out.println("Succesfully Refresh Books");
    }//GEN-LAST:event_Button_RefreshMousePressed

    private void Button_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_EditMouseClicked
        // TODO add your handling code here:
        int selectedIndex = BookTable.getSelectedRow();
        
        if (selectedIndex != 1) {
            Book selectedBook = BookTable.getBookAtRow(selectedIndex);
            
            // Menampilkan form edit book
            Dialog_EditBook dialogEditbook = new Dialog_EditBook(this, true, selectedBook);
            dialogEditbook.setLocationRelativeTo(null);
            dialogEditbook.setVisible(true);
        }  
    }//GEN-LAST:event_Button_EditMouseClicked

    private void Button_DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeleteMouseExited
        // TODO add your handling code here:
        Button_Delete.setBackground(DefaultColorAction);
    }//GEN-LAST:event_Button_DeleteMouseExited

    private void Button_DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeleteMouseEntered
        // TODO add your handling code here:
        Button_Delete.setBackground(HoverColorAction);
    }//GEN-LAST:event_Button_DeleteMouseEntered

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // TODO add your handling code here:
         int selectedRowIndex = BookTable.getSelectedRow();

         if (selectedRowIndex != -1) {
             Book selectedBook = BookTable.getBookAtRow(selectedRowIndex);
             
             DialogMsg_DeleteBook dialogDeleteBook = new DialogMsg_DeleteBook(this, true);
             dialogDeleteBook.setLocationRelativeTo(null);
             dialogDeleteBook.setVisible(true);
             
             int userChoice = dialogDeleteBook.getUserChoice();
             
             switch (userChoice) {
                 case DialogMsg_DeleteBook.YES_DELETE -> {
                     bookController.deleteBook(selectedBook.getTitle());
                     
                     userLibrary = libraryController.getUserLibraryInDB(AuthManager.getAuthenticatedUserId());
                     BookTable.populateTable(userLibrary, "All");
                 }
                 case DialogMsg_DeleteBook.DISCARD_DELETE -> {
                     dialogDeleteBook.dispose();
                 }
                 default -> {
                     break;
                 }
             }
         }
    }//GEN-LAST:event_jLabel4MousePressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void Button_DeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button_DeleteMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_DeleteMousePressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AllBookState;
    private javax.swing.JLabel AuthenticatedUsername;
    private researead.views.utils.Table BookTable;
    private javax.swing.JPanel Button_Add;
    private javax.swing.JPanel Button_Delete;
    private javax.swing.JPanel Button_Edit;
    private javax.swing.JPanel Button_Refresh;
    private javax.swing.JLabel FinishedState;
    private javax.swing.JPanel InternalPanelSection;
    private javax.swing.JLabel MenuName;
    private javax.swing.JPanel Menu_AllBooks;
    private javax.swing.JPanel Menu_Finished;
    private javax.swing.JPanel Menu_Logout;
    private javax.swing.JPanel Menu_Reading;
    private javax.swing.JPanel Panel_Header;
    private javax.swing.JPanel Panel_Menu;
    private javax.swing.JLabel ReadingState;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane spTable;
    // End of variables declaration//GEN-END:variables
}
